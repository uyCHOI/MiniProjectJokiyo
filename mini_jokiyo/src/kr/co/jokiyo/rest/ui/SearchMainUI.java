package kr.co.jokiyo.rest.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;

import kr.co.jokiyo.mapper.ListRestMapper;

public class SearchMainUI {
	private ListRestMapper mapper;
	private Scanner sc = new Scanner(System.in);
	public SearchMainUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ListRestMapper.class);
	}
	public void service() throws Exception {
		BaseUI ui = null;
		while(true) {
			switch(menu()) {
			case 1: 
				/*List<Rest> list = mapper.selectRest();
			for(Rest r : list ) {
				System.out.println(r.getAddr());
			}*/
				ui = new ListExitNoUI(mapper); break;
			case 2: ui = new ListCategoryUI(mapper);break;
			
			}
			ui.service();
		}
	
	}
	
	public int menu() {
		System.out.println("================================");
		System.out.println("1.강남역 출구번호 선택");
		System.out.println("2.메뉴별");
		System.out.println("================================");
		System.out.println("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
	

	

	}






