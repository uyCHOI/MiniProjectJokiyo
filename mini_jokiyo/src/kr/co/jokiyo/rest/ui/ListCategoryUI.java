package kr.co.jokiyo.rest.ui;

import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.ListRestMapper;
import kr.co.jokiyo.mapper.ListReviewMapper;

public class ListCategoryUI extends BaseUI {
	private ListRestMapper mapper;
	public ListCategoryUI(ListRestMapper mapper) {
    	this.mapper = mapper;
    }

	
	public void service() {
		SearchMainUI ui = new SearchMainUI();
		System.out.println("================================");
		System.out.println("1. 한식 ");
		System.out.println("2. 중식 ");
		System.out.println("3. 양식 ");
		System.out.println("4. 일식 ");
		System.out.println("5. 분식 ");
		System.out.println("================================");
		int no = getInt("메뉴 중 처리할 항목을 선택하세요 : ");
		List<Rest> list = mapper.selectRestCategory(no);
		
		
			// 출력 내용 : 식당아이디,식당이름,리뷰개수,별점
			System.out.println("식당아이디\t식당이름\t리뷰개수\t별점");
			System.out.println("================================");
			for (Rest r :list) {
				System.out.printf("%d\t%s\t\t%d\t%.1f\n",r.getRestId(),r.getName(),r.getReviewCnt(),r.getStar());
			} 
			System.out.println("================================");
			int num = getInt("상세번호를 보기를 원하면 식당아이디를 입력하세요 : ");
			DetailRestUI dr = new DetailRestUI(num);
			dr.service();
		} 
	}



	

