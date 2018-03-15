package kr.co.jokiyo.mapper;

import java.util.List;
import kr.co.jokiyo.domain.User;

public interface UserManagerMapper {
	List<User> selectUser();
	int updateUser(User user);
	int deleteUser(String id);
}
