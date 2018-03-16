import kr.co.jokiyo.user.ui.UserUI;

public class Test {
	public static void main(String[] args) {
		UserUI ui = new UserUI();
		try {
			ui.service();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
