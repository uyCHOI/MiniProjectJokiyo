package kr.co.jokiyo.mapper;

import java.util.List;

import kr.co.jokiyo.domain.Review;

public interface ListReviewMapper {
	void writeReview(Review review);
	List<Review> detailReview(int no);

}
