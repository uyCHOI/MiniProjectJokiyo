/*
 *  전체식당 찾는 메서드
 *  출구검색에 해당하는 메서드
 *  식당 상세보기 메서드
 * 
 * */
package kr.co.jokiyo.mapper;

import java.util.List;

import kr.co.jokiyo.domain.Menu;
import kr.co.jokiyo.domain.Rest;

public interface ListRestMapper {
	List<Rest> selectRest();
	List<Rest> selectRestExitNum(int num);
	List<Rest> selectRestCategory(int no);
	List<Rest> selectDetailRest(int no);
	List<Menu> selectDetailMenu(int id);
}
