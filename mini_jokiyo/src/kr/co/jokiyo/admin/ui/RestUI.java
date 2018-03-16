package kr.co.jokiyo.admin.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.RestManagerMapper;

public class RestUI {
	private RestManagerMapper mapper;
	private Scanner sc = new Scanner(System.in);
	public RestUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(RestManagerMapper.class);
	}

	public void service() {
		BaseUI ui = null;
		AdminUI aui = new AdminUI();
		while(true) {
			switch(menu()) {
			case 1: ui = new ListRestUI(mapper); break;
			case 2: ui = new WriteRestUI(mapper); break;
			case 3: ui = new UpdateRestUI(mapper); break;
			case 4: ui = new DeleteRestUI(mapper); break;
			case 0: aui.service(); break;
			}
			ui.service();
		}
	}

	private int menu() {
		System.out.println("================================");
		System.out.println("1. 전체 조회");
		System.out.println("2. 식당 추가");
		System.out.println("3. 식당 수정");
		System.out.println("4. 식당 삭제");
		System.out.println("0. 뒤로 가기");
		System.out.println("================================");
		System.out.print("번호를 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}

}














