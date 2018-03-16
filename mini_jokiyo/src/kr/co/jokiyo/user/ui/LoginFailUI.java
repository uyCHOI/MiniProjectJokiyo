package kr.co.jokiyo.user.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.LoginMapper;

public class LoginFailUI extends BaseUI{
	private LoginMapper mapper;
	
	public LoginFailUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(LoginMapper.class);
	}
	@Override
	public void service() throws Exception {
		BaseUI ui = null;
		
		switch(menu()) {
		case 1: ui = new LoginUI(); break;
		case 2: ui = new FindPwUI(); break;
		}
		ui.service();
	}




	public int menu() {
		System.out.println("================================");
		System.out.println("1. 다시 입력");
		System.out.println("2. 비밀번호 찾기");
		System.out.println("================================");
		System.out.print("원하시는 서비스의 번호를 선택해주세요: ");
		return Integer.parseInt(sc.nextLine());
	}




}
