package kr.co.jokiyo.admin.ui;

import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Stat;
import kr.co.jokiyo.mapper.StatMapper;

public class GenderPrefStatUI  extends BaseUI{
	private StatMapper mapper;
	public GenderPrefStatUI(StatMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public void service() {
		List<Stat> list = mapper.selectFemailStat();
		System.out.println("여자가 선호하는 식당 순");
		for(Stat s: list) {
			System.out.println("================================");
			System.out.println(" "+s.getName());
			System.out.printf(" 별점 평균 : %.1f\n",s.getStar());	
			System.out.println("리뷰 수" + s.getReviewCnt());
			printStar(s.getStar());
		}
		list = mapper.selectMailStat();
		System.out.println("남자가 선호하는 식당 순");
		for(Stat s: list) {
			System.out.println("================================");
			System.out.println(" "+s.getName());
			System.out.printf(" 별점 평균 : %.1f\n",s.getStar());	
			System.out.println("리뷰 수" + s.getReviewCnt());
			printStar(s.getStar());                         
		}
		
	}
	
}
