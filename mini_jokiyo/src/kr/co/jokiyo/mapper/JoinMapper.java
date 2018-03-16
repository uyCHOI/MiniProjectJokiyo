
package kr.co.jokiyo.mapper;
/**
 * @author 지혜
 * 회원가입 mapper
 * 
 */
import kr.co.jokiyo.domain.User;


public interface JoinMapper {
	String idCheck(String id);
	void insertUserJoin(User param);

	
	
	
	

}
