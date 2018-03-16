package kr.co.jokiyo.admin.ui;

import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Stat;
import kr.co.jokiyo.mapper.StatMapper;

public class MonthPrefStatUI extends BaseUI{
	private StatMapper mapper;
	public MonthPrefStatUI(StatMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public void service() {
		String month = getStr("월을 입력하세요 01 ~ 12 ");
		List<Stat> list = mapper.selectMonthStat(month);
		System.out.println(list.size());
		if(list.isEmpty())
			System.out.println("입력한 달에 정보가 없거나 잘못입력했습니다.");
		for(Stat s : list) {
			System.out.println(" "+s.getName());
			System.out.println(" 별점 : " +s.getStar());	
			System.out.println(month +"월에 리뷰 수 " +s.getReviewCnt());
		}
	}
	
}
