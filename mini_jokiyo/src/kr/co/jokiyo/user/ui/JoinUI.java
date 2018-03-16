package kr.co.jokiyo.user.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.User;
import kr.co.jokiyo.mapper.JoinMapper;

public class JoinUI extends BaseUI {
	private JoinMapper mapper;
		public JoinUI() {
			SqlSession session = MyAppSqlConfig.getSqlSession();
			mapper = session.getMapper(JoinMapper.class);
		}	
		@Override
		public void service() {
			System.out.println("================================");
			User u = new User();
			boolean chk = true;
			String id="";
			while(chk) {
				id = getStr("아이디: ");
				u.setId(mapper.idCheck(id));
				if(u.getId()!=null) {
					System.out.println("이미 사용중인 ID입니다.");
				} else {
					System.out.println("입력하신 ID는 사용하실 수 있는 ID입니다.");
					chk=false;
				}
			}
			Scanner sc = new Scanner(System.in);
			String pw = getStr("비밀번호: ");
			String name = getStr("이름: ");
			int age = getInt("나이: ");
			System.out.print("성별(남성은 m, 여성은 f를 입력해주세요): ");
			char sex = sc.nextLine().charAt(0);
			String hp= getStr("핸드폰 : ");
			String email= getStr("이메일: ");
			System.out.println("================================");
			User param = new User();
			param.setId(id);
			param.setPw(pw);
			param.setName(name);
			param.setAge(age);
			param.setSex(sex);
			param.setHp(hp);
			param.setEmail(email);
			mapper.insertUserJoin(param);
			System.out.println("회원가입이 완료되었습니다.");
			LoginUI ui = new LoginUI();
			try {
				ui.service();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		
			
	

}
