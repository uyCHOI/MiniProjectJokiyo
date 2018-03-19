package kr.co.jokiyo.admin.ui;

import java.util.List;
import java.util.Scanner;

import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Rest;
import kr.co.jokiyo.mapper.RestManagerMapper;

public class ListRestUI extends BaseUI{
	private RestManagerMapper mapper;

	public ListRestUI(RestManagerMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public void service() {
		List<Rest> list = mapper.selectRest();
		System.out.println("");
		System.out.printf("  ☆ 전체 %d개 ☆\n", list.size());
		System.out.println("================================");
		System.out.println("식당번호\t식당이름\t식당타입\t출구번호\t전화번호\t여는시간\t닫는시간");
		System.out.println("================================");
		
		for (Rest r : list) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n", 
					r.getRestId(), r.getName(), r.getTypeName(),
					r.getExitName(), r.getTel(), r.getOpenDate(), r.getCloseDate());
		}
		System.out.println("================================");
	}

}













