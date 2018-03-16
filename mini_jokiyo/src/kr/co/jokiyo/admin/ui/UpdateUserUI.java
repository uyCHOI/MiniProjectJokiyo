package kr.co.jokiyo.admin.ui;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.User;
import kr.co.jokiyo.mapper.UserManagerMapper;

public class UpdateUserUI extends BaseUI {
	private UserManagerMapper mapper;

	public UpdateUserUI(UserManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		
		User user = new User();
		user.setId(getStr("바꿀 아이디를 입력하세요 : "));
		user.setPw(getStr("바꿀 비밀번호를 입력하세요 : "));
		user.setName(getStr("바꿀 이름을 입력하세요 : "));
		user.setAge(getInt("바꿀 나이를 입력하세요 : "));
		user.setSex(getStr("바꿀 성별을 입력하세요 : ").charAt(0));
		user.setHp(getStr("바꿀 휴대전화 번호를 입력하세요 : "));
		user.setEmail(getStr("바꿀 이메일 주소를 입력하세요 : "));
		user.setAuthority(getStr("바꿀 권한 번호를 입력하세요 : ").charAt(0));
		
		int result = mapper.updateUser(user);
		if (result == 0) {
			System.out.println("입력하신 유저는 없습니다.");
		} else {
			System.out.println("유저 정보가 수정되었습니다.");
		}

	}

}





