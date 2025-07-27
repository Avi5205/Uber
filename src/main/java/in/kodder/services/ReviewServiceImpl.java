package in.kodder.services;

import in.kodder.models.Review;
import in.kodder.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Optional<Review> findReviewById(Long id) {
        return reviewRepository.findById((id));
    }

    @Override
    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public boolean deleteReviewById(Long reviewId) {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent()) {
            reviewRepository.delete(review.get());
            return true;
        }
        return false;
    }

    // Add these methods to ReviewServiceImpl
    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> findReviewsByRating(Integer rating) {
        return reviewRepository.findAllByRatingIsLessThanEqual(rating);
    }

    @Override
    public List<Review> findReviewsBeforeDate(Date date) {
        return reviewRepository.findAllByCreatedAtBefore(date);
    }

    @Override
    public Integer countReviewsByMaxRating(Integer rating) {
        return reviewRepository.countAllByRatingIsLessThanEqual(rating);
    }
}
