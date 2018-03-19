package kr.co.jokiyo.admin.ui;

import java.util.List;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Stat;
import kr.co.jokiyo.mapper.StatMapper;

public class AgePrefStatUI extends BaseUI{
	private StatMapper mapper;
	public AgePrefStatUI(StatMapper mapper) {
		this.mapper=mapper;
	}

	@Override
	public void service() {
		int age = getInt("별점 높은순으로 출력을 위해 나이대를 입력 : ");
		List<Stat> list = mapper.selectAgePref(age);
		System.out.println(age+"대 가장 선호하는 음식점 ");
		for(Stat s : list) {
			System.out.println("================================");
			System.out.println(" "+s.getName());
			System.out.printf(" 별점 평균 : %.1f\n",s.getStar());	
			System.out.println("리뷰 수" + s.getReviewCnt());
			printStar(s.getStar());
		}
	}
	
}
