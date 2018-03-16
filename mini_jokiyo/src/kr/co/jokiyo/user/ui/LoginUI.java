package kr.co.jokiyo.user.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.admin.ui.AdminUI;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.User;
import kr.co.jokiyo.mapper.LoginMapper;
import kr.co.jokiyo.rest.ui.SearchMainUI;

public class LoginUI extends BaseUI {
	BaseUI ui = null;
	private LoginMapper mapper;
	public static String logUser;

	public LoginUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(LoginMapper.class);
	}

	@Override
	public void service() {
		System.out.println("================================");
		String id = getStr("아이디: ");
		String pw = getStr("비밀번호: ");
		User param = new User();
		param.setId(id);
		param.setPw(pw);

		param = mapper.selectUserLogin(param);
		if (param == null) {
			System.out.println("로그인에 실패하였습니다.");
			ui = new LoginFailUI();
			ui.service();
			return;
		} 
		char chk = param.getAuthority();
		
		if (chk == '1') {
			System.out.println("로그인에 성공하였습니다.");
			System.out.println("================================");
			logUser = param.getId();
			 ui = new SearchMainUI();
			 ui.service();
			
		} else if (chk == '2') {
			System.out.println("관리자 계정 로그인");
			System.out.println("================================");
			ui = new AdminUI();
			ui.service();
		}
	}

}
