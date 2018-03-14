package kr.co.jokiyo.admin.ui;

import java.util.Scanner;

public class AdminUI {
	private static Scanner sc = new Scanner(System.in);
	
	public void service() throws Exception {
//		RestUI rui = null;
//		UserUI uui = null;
//		StatUI sui = null;
//		
//		switch (menu()) {
//			case 1: rui = new RestUI();
//					rui.service(); 
//					break;
//			case 2: uui = new UserUI();
//			        uui.service();
//			        break;
//			case 3: sui = new StatUI();
//			        sui.service();
//			        break;
//			}
	}

	private static int menu() {
		System.out.println("==================");
		System.out.println("1. 한글");
		System.out.println("2. ��������");
		System.out.println("3. ������");
		System.out.println("==================");
		System.out.print("��ȣ�� �Է��ϼ��� : ");
        
		return Integer.parseInt(sc.nextLine());
	
	}




}
