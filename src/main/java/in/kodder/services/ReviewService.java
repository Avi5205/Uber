package in.kodder.services;

import in.kodder.models.Review;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReviewService {

        Optional<Review> findReviewById(Long id);
        List<Review> findAllReviews();
        boolean deleteReviewById(Long reviewId);
        Review saveReview(Review review);
        List<Review> findReviewsByRating(Integer rating);
        List<Review> findReviewsBeforeDate(Date date);
        Integer countReviewsByMaxRating(Integer rating);

}
