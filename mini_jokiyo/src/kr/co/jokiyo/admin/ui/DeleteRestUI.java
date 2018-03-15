package kr.co.jokiyo.admin.ui;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.RestManagerMapper;

public class DeleteRestUI extends BaseUI{
	private RestManagerMapper mapper;

	public DeleteRestUI(RestManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		int no = getInt("삭제할 식당번호를 입력하세요 : ");
		int result = mapper.deleteRest(no);
		if (result == 0) {
			System.out.println("입력하신 번호의 식당이 없습니다.");
			return;
		}
		System.out.println("식당이 삭제되었습니다.");
		
		
	}

}
