package kr.co.jokiyo.mapper;

import java.util.List;

import kr.co.jokiyo.domain.User;

public interface LoginMapper {
	List<User> selectUser();
}
