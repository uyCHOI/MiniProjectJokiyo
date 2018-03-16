package kr.co.jokiyo.mapper;
/**
 * @author 지혜
 * 로그인, 비밀번호 찾기 mapper
 * 
 */
import kr.co.jokiyo.domain.User;

public interface LoginMapper {
	  User selectUserLogin(User param);
	  User findUserPW(User param);
}
