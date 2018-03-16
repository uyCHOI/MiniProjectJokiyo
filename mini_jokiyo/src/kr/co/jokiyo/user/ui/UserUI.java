package kr.co.jokiyo.user.ui;

import java.util.Scanner;

import kr.co.jokiyo.common.ui.BaseUI;

public class UserUI  {
private Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
		UserUI uui = new UserUI();
		try {
		    uui.service();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
    	
		public void service() throws Exception {
			BaseUI ui = null;
			
			switch (menu()) {
			    case 1: ui = new LoginUI(); break;
			    case 2: ui = new JoinUI(); break;
			}
			ui.service();
			
		}



		private int menu() {
			System.out.println("================================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("================================");
			System.out.print("원하시는 서비스의 번호를 선택해주세요: ");
			return Integer.parseInt(sc.nextLine());
		}


		}
