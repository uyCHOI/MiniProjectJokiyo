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
		int age = getInt("나이대별 별점 높은순으로 출력을 위해 나이를 입력 :");
		List<Stat> list = mapper.selectAgePref(age);
		System.out.println(age+"대 가장 선호하는 음식점 ");
		System.out.println("식당명           별점        리뷰수");
		for(Stat s : list) {
			System.out.println("================================");
			System.out.println("   "+s.getName()+ "   "+s.getStar()+"   "+s.getReviewCnt());
		}
	}
	
}
