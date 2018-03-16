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
//		List<Stat> list = mapper.selectAgePref();
//		for(Stat s : list) {
//			System.out.println(" "+s.getName());
//			System.out.println(" 별점 : " +s.getStar());	
//			System.out.println("10대 리뷰 수 " +s.getAge10()+" 별점" );
//			System.out.println("20대 리뷰 수 " +s.getAge20());
//			System.out.println("30대 리뷰 수 " +s.getAge30());
//			System.out.println("40대 리뷰 수 " +s.getAge40());
//			System.out.println("50대 리뷰 수 " +s.getAge50());
//			System.out.println("60대 리뷰 수 " +s.getAge60());
//		}
	}
	
}
