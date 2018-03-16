package kr.co.jokiyo.admin.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.UserManagerMapper;

public class UserUI extends BaseUI {
	private Scanner sc = new Scanner(System.in);
	private UserManagerMapper mapper;
	UserUI(){
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(UserManagerMapper.class);
	}

	public void service() {
		AdminUI aui = new AdminUI();
		BaseUI ui = null;
		switch(menu()){
			case 1: ui = new ListUserUI(mapper); break;
			case 2: ui = new UpdateUserUI(mapper); break;
			case 3: ui = new DeleteUserUI(mapper); break;
			case 0: aui.service(); break;
		}
		ui.service();
	}

	private int menu() {
		System.out.println("================================");
		System.out.println("1. 전체 조회");
		System.out.println("2. 유저 수정");
		System.out.println("3. 유저 삭제");
		System.out.println("0. 뒤로 가기");
		System.out.println("================================");
		System.out.print("번호를 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}

}





