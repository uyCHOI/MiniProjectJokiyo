package kr.co.jokiyo.user.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.User;
import kr.co.jokiyo.mapper.LoginMapper;

public class FindPwUI extends BaseUI {
	BaseUI ui = null;
	private LoginMapper mapper;

	public FindPwUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(LoginMapper.class);
	}

	@Override
	public void service() throws Exception {
		System.out.println("================================");
		System.out.println("본인 확인 후 비밀번호를 찾아드립니다.");
		String id = getStr("아이디: ");
		String name = getStr("이름: ");
		String email = getStr("이메일: ");
		User param = new User();
		param.setId(id);
		param.setName(name);
		param.setEmail(email);
		param = mapper.findUserPW(param);
			if (param == null) {
			System.out.println("일치하는 회원정보가 없습니다.");
			System.out.println("================================");
		} else {
			System.out.println("아이디는 " + param.getId() + "이고,");
			System.out.println("비밀번호는 " + param.getPw() + "입니다.");
			System.out.println("================================");
		}
	
	}
	


}

