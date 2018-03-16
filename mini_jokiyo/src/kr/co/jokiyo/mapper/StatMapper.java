package kr.co.jokiyo.mapper;

import java.util.List;

import kr.co.jokiyo.domain.Stat;

public interface StatMapper {
	List<Stat> selectFemailStat();
	List<Stat> selectMailStat();
	List<Stat> selectMonthStat(String mm);
	List<Stat> selectAgePref(int age);
}
