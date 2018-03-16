package kr.co.jokiyo.admin.ui;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.UserManagerMapper;

public class DeleteUserUI extends BaseUI {
	private UserManagerMapper mapper;

	public DeleteUserUI(UserManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		String s = getStr("삭제할 유저 아이디를 입력하세요 : ");
		int result = mapper.deleteUser(s);
		if (result == 0) {
			System.out.println("입력하신 번호의 식당이 없습니다.");
			return;
		}
		System.out.println("식당이 삭제되었습니다.");


	}

}
