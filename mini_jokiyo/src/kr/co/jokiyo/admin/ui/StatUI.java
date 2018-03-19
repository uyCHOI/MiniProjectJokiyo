package kr.co.jokiyo.admin.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.mapper.StatMapper;

public class StatUI extends BaseUI {
	
	private StatMapper mapper;
	public StatUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(StatMapper.class);
	}
	public void service() {
		
		BaseUI ui= null;
		while(true) {
			switch(menu()) {
			case 1 : ui = new GenderPrefStatUI(mapper);  break;
			case 2 : ui = new MonthPrefStatUI(mapper); break;
			case 3 : ui = new AgePrefStatUI(mapper);  break;
			case 0 : ui = new AdminUI();  break;
			}
			ui.service();
		}
	}
	public int menu() {
		System.out.println("================================");
		System.out.println("1. 성별 선호도");
		System.out.println("2. 월별 선호도");
		System.out.println("3. 나이별 선호도");
		System.out.println("0. 뒤로가기");
		System.out.println("================================");
		return getInt("메뉴 중 처리할 항목을 선택하세요 : ");
	}
}
