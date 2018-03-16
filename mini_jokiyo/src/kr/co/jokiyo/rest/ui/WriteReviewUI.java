package kr.co.jokiyo.rest.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Review;
import kr.co.jokiyo.mapper.ListRestMapper;
import kr.co.jokiyo.mapper.ListReviewMapper;
import kr.co.jokiyo.user.ui.LoginUI;

public class WriteReviewUI extends BaseUI {
	int no = 2;
	String id = LoginUI.logUser;
	ListReviewMapper mapper;
	ListRestMapper mapper2;

	public WriteReviewUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ListReviewMapper.class);
		mapper2 = session.getMapper(ListRestMapper.class);
	}

	public void service() {
		Review re = new Review();
		re.setId(id);
		re.setRestId(no);
		System.out.println("================================");
		while (true) {
		re.setCmt(getStr("코멘트 :"));
			int no = getInt("별점 (1-5) :");
			if (no >= 1 && no <6) {
				re.setStar(no);
				mapper.writeReview(re);
				System.out.println("리뷰가 등록되었습니다.");
			
		            SearchMainUI ui = new SearchMainUI();
		            ui.service();
		            
				  
				  
			} else {
				System.out.println("다시입력하세요 ");
			}
             
			System.out.println("================================");

		}
		 
	}
}
/*
 * 리뷰를 작성하세요. ============ 코멘트 : 별점 (1-5) : ============
 */
