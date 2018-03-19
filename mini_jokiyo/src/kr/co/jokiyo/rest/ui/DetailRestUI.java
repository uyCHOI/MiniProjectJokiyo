package kr.co.jokiyo.rest.ui;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Menu;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.ListRestMapper;
import kr.co.jokiyo.mapper.ListReviewMapper;

public class DetailRestUI extends BaseUI {
	BaseUI ui = null;
	int num;
	public ListRestMapper mapper;
	public ListReviewMapper mapper2;

	public DetailRestUI(int num) {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ListRestMapper.class);
		this.num = num;
		mapper2 = session.getMapper(ListReviewMapper.class);
	}

	public void service() {
		List<Rest> list = mapper.selectDetailRest(num);
		System.out.println("================================");
		for (Rest r : list) {
			System.out.printf("식당명 : %s\t주소 : %s\t영업시간 : %s ~ %s\t\n", r.getName(), r.getAddr(), r.getOpenDate(),
					r.getCloseDate());
			System.out.printf("별점 : %.2f\t전화번호 : %s\t출구번호 : %s\n", r.getStar(), r.getTel(), r.getExitName());
			if(list.isEmpty()) {
				System.out.println("해당하는 식당은 없습니다.");
				ui = new SearchMainUI();
				ui.service();
			}
		}   
		
		List<Menu> menu = mapper.selectDetailMenu(num);
		System.out.println("메뉴\t\t\t가격");
		for(Menu m: menu) {
			System.out.println(m.getName()+ "\t"+ m.getPrice() + "원");
		}
		System.out.println("================================");
		System.out.println("0. 메인으로 가기 ");
		System.out.println("1. 리뷰작성");
		System.out.println("2. 리뷰보기");
		System.out.println("================================");
		System.out.print("원하는 메뉴를 입력하세요 : ");
		int no = Integer.parseInt(sc.nextLine());
		switch (no) {
		case 0:
			ui = new SearchMainUI();
			ui.service();
			break;
		case 1:
			ui = new WriteReviewUI();
			ui.service();
			break;
		case 2:
			ui = new DetailReviewUI(num);
			ui.service();
			break;
		}

	}
	/*	상세보기 번호 입력시
		===========
		식당명 :
		주소 :
		영업시간:
		별점:
		전화번호:
		메뉴 :
		출구번호 :
		0. 뒤로가기
		1.리뷰작성
		2.리뷰보기
		===========*/
	

}
