package kr.co.jokiyo.admin.ui;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.RestManagerMapper;

public class WriteRestUI extends BaseUI{
	private RestManagerMapper mapper;

	public WriteRestUI(RestManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		Rest restVO = new Rest();
		restVO.setName(getStr("식당이름 : "));
		restVO.setTypeId(getInt("식당타입(1~5) : "));
		restVO.setExitNum(getInt("출구번호 : "));
		restVO.setTel(getStr("전화번호 : "));
		restVO.setOpenDate(getStr("여는시간 : "));
		restVO.setCloseDate(getStr("닫는시간 : "));
		mapper.insertRest(restVO);
		System.out.println("식당 등록이 완료되었습니다.");
		
	}

}
