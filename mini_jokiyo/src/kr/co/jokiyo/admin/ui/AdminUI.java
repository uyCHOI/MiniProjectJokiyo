package kr.co.jokiyo.admin.ui;

import java.util.Scanner;
import kr.co.jokiyo.user.ui.UserUI;
import kr.co.jokiyo.common.ui.BaseUI;

public class AdminUI extends BaseUI{
	private static Scanner sc = new Scanner(System.in);
	BaseUI ui =null;
	public static void main(String[] args) {
		AdminUI ui = new AdminUI();
		try {
			ui.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void service() {
		RestUI rui = null;
		kr.co.jokiyo.admin.ui.UserUI uui = null;
		StatUI sui = null;
		
		switch (menu()) {
			case 1: rui = new RestUI();
					rui.service(); 
					break;
			case 2: uui = new kr.co.jokiyo.admin.ui.UserUI();
			        uui.service();
			        break;
			case 3: sui = new StatUI();
			        sui.service();
			        break;
			case 4: ui =new UserUI();
					ui.service(); break;
			}
	}

	private static int menu() {
		System.out.println("================================");
		System.out.println("1. 식당 관리");
		System.out.println("2. 유저 관리");
		System.out.println("3. 통계 관리");
		System.out.println("4. 로그아웃");
		System.out.println("================================");
		System.out.print("번호를 선택해 주세요 : ");
        
		return Integer.parseInt(sc.nextLine());
	
	}




}
