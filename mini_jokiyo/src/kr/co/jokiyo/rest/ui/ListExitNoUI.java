package kr.co.jokiyo.rest.ui;

import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.ListRestMapper;
import kr.co.jokiyo.user.ui.UserUI;

public class ListExitNoUI extends BaseUI {
	private ListRestMapper mapper;

	public ListExitNoUI(ListRestMapper mapper) {
		this.mapper = mapper;
	}

	public void service() {
		BaseUI ui = new SearchMainUI();
		System.out.println("================================");
		System.out.println("0. 뒤로가기");
		System.out.println("1. 출구 번호를 입력하세요 :");
		System.out.println("( ※ 1,2번출구:1, 7,8번출구:2");
		System.out.println("     9,10번출구:3, 11,12번출구:4 )");
		int no = getInt("메뉴 중 처리할 항목을 선택하세요 : ");
		
		System.out.println("식당아이디\t식당이름\t식당종류\t식당출구번호\t식당전화번호");
		System.out.println("================================");
		List<Rest> list = mapper.selectRestExitNum(no);
		for (Rest r :list) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",r.getRestId(),r.getName(),r.getTypeName(),r.getExitName(),r.getTel());
		}
		System.out.println("================================");
		int num = getInt("상세번호를 보기를 원하면 식당아이디를 입력하세요 : ");
		System.out.println("0. 이전 메뉴로 돌아가기");
		if(num==0) {
			ui = new SearchMainUI();
			ui.service();
		}
		System.out.println("================================");
		DetailRestUI dr = new DetailRestUI(num);
		dr.service();
	}
}

