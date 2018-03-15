package kr.co.jokiyo.mapper;

import java.util.List;
import kr.co.jokiyo.domain.Rest;

public interface RestManagerMapper {
	List<Rest> selectRest();
	void insertRest(Rest rest);
	int updateRest(Rest rest);
	int deleteRest(int no);
}
