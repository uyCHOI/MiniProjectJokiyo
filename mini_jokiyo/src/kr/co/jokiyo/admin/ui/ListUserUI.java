package kr.co.jokiyo.admin.ui;

import java.text.SimpleDateFormat;
import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.User;
import kr.co.jokiyo.mapper.UserManagerMapper;

public class ListUserUI extends BaseUI {
	private UserManagerMapper mapper;

	public ListUserUI(UserManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		List<User> list = mapper.selectUser();
		System.out.println("");
		System.out.printf("  ☆ 전체 %d개 ☆\n", list.size());
		System.out.println("================================");
		System.out.println("아이디\t비밀번호\t이름\t나이\t성별\t"
				+ "휴대전화\t전자우편\t가입일자\t유저종류");
		System.out.println("================================");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		for(User u : list) {
			System.out.printf("%s\t%s\t%s\t%d\t%c\t%s\t%s\t%s\t%c\n", 
					u.getId(), u.getPw(), u.getName(), u.getAge(), u.getSex(), 
					u.getHp(), u.getEmail(), sdf.format(u.getRegDate()), 
					u.getAuthority());
		}
		System.out.println("================================");
		UserUI user = new UserUI();
		try {
			user.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}









