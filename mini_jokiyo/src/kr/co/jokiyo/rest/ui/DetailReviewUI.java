package kr.co.jokiyo.rest.ui;


import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.jokiyo.common.ui.BaseUI;
import kr.co.jokiyo.domain.Review;
import kr.co.jokiyo.mapper.ListReviewMapper;

public class DetailReviewUI extends BaseUI {
	int num;
	public ListReviewMapper mapper;
	
	
	public DetailReviewUI(int num) {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(ListReviewMapper.class);
		this.num = num;

	}
	public void service() { 
		
		System.out.println("================================");
		List<Review> list = mapper.detailReview(num);
		SimpleDateFormat sim = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		for(Review r: list) {
		System.out.println("================================");
		System.out.println(" 작성자 id : " + r.getId() );
		System.out.println(" 리뷰번호 : " + r.getReviewId());
		System.out.println(" 작성일자 : " + sim.format(r.getRegDate()) );
		System.out.println(" 별점 : " + r.getStar());
		System.out.println(" 내용 : " + r.getCmt() );
		System.out.println(" 좋아요(갯수) :" +r.getGood());
		System.out.println("================================");
		}
		/*
		 * 상세보기 번호 입력시
리뷰상세화면
===========
식당명
------
id
리뷰번호
작성일자.
별점
내용
좋아요(개수)
--------
.좋아요(리뷰번호 입력)
0번.뒤로가기
===========

		 * 
		 * */
		
	}
}

	

