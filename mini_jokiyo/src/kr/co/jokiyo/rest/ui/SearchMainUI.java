package kr.co.jokiyo.rest.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.ListRestMapper;
import kr.co.jokiyo.user.ui.UserUI;

public class SearchMainUI extends BaseUI {
	private ListRestMapper mapper;
	private Scanner sc = new Scanner(System.in);

	public SearchMainUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ListRestMapper.class);
	}

	public void service() {
		BaseUI ui = null;
		while (true) {
			switch (menu()) {
			case 1:
				ui = new ListExitNoUI(mapper);
				break;
			case 2:
				ui = new ListCategoryUI(mapper);
				break;
			case 3:
				ui = new UserUI();
			}
			ui.service();
		}
	}

	public int menu() {
		System.out.println("================================");
		System.out.println("1.강남역 출구번호 선택");
		System.out.println("2.메뉴별");
		System.out.println("3.로그아웃");
		System.out.println("================================");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}

}
