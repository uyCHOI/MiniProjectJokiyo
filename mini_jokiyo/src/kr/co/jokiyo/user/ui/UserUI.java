package kr.co.jokiyo.user.ui;

import java.util.Scanner;

import kr.co.jokiyo.common.ui.BaseUI;

public class UserUI extends BaseUI{
	private Scanner sc = new Scanner(System.in);

	public void service() {
		BaseUI ui = null;
		switch (menu()) {
		case 1:
			ui = new LoginUI();
			break;
		case 2:
			ui = new JoinUI();
			break;
		case 0:quit(); 
		}
		ui.service();
	}
	private void quit() {
		System.out.println("강남역 맛집평가 프로그램을 종료합니다.");
		System.exit(0);
	}
	private int menu() {
		System.out.println("================================");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("0. 프로그램 종료");
		System.out.println("================================");
		System.out.print("원하시는 서비스의 번호를 선택해주세요: ");
		return Integer.parseInt(sc.nextLine());
	}

}
