package kr.co.jokiyo.admin.ui;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.RestManagerMapper;

public class UpdateRestUI extends BaseUI{
	private RestManagerMapper mapper;

	public UpdateRestUI(RestManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		Rest rest = new Rest();
		rest.setRestId(getInt("변경할 식당번호를 입력하세요 : "));
		rest.setName(getStr("변경할 식당이름을 입력하세요 : "));
		rest.setTypeId(getInt("변경할 식당타입을 입력하세요 : "));
		rest.setExitNum(getInt("변경할 출구번호를 입력하세요 : "));
		rest.setTel(getStr("변경할 전화번호를 입력하세요 : "));
		rest.setOpenDate(getStr("변경할 여는시간을 입력하세요 : "));
		rest.setCloseDate(getStr("변경할 닫는시간을 입력하세요 : "));
		
		int result = mapper.updateRest(rest);
		if (result == 0) {
			System.out.println("입력된 번호의 식당은 존재하지 않습니다.");
		} else {
			System.out.println("식당정보가 수정되었습니다.");
		}
		
	}

}
