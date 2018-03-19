// UI 클래스들의 부모 클래스
// Scanner 과 관련된 기능을 추가
package kr.co.jokiyo.common.ui;

import java.util.Scanner;

public abstract class BaseUI {
	public Scanner sc = new Scanner(System.in);
	
	public abstract void service();
	
	public String getStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	public int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	public void printStar(float cnt) {
		 int star = (int)cnt;
		 System.out.print(" ");
		for(int i =0; i<star; i++) {
			System.out.print("★");
		}
		if(cnt%1>0.4) {
			System.out.print("☆");
		}System.out.println();
	}
}













