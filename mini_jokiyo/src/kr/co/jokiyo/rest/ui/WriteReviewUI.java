package kr.co.jokiyo.rest.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Review;
import kr.co.jokiyo.mapper.ListReviewMapper;

public class WriteReviewUI extends BaseUI {
	int no= 2;
	String id = "user1";
	ListReviewMapper mapper;

	public WriteReviewUI() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
	     mapper = session.getMapper(ListReviewMapper.class);
//	     this.no= no;

	}
	
	
	public void service() {
		Review re = new Review();
		re.setId(id);
		re.setRestId(no);
		System.out.println("================================");
		re.setCmt(getStr("코멘트 :"));
		re.setStar(getInt("별점 (1-5) :"));
		System.out.println("================================");
		mapper.writeReview(re);
		System.out.println("리뷰가 등록되었습니다.");
		/*
		 * 리뷰를 작성하세요.
============
코멘트 :
별점 (1-5) :
============
		 * */
		
	}
	

}
