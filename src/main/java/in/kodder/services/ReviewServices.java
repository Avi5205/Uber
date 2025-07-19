package in.kodder.services;

import in.kodder.models.Review;
import in.kodder.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************");
        Review r = Review.builder()
                .content("service is amazing, highly recommend!")
                .rating(4.5)
                .build();
        reviewRepository.save(r);

        List<Review> reviews = reviewRepository.findAll();
        for (Review review : reviews) {
            System.out.println("Review ID: " + review.getId());
            System.out.println("Content: " + review.getContent());
            System.out.println("Rating: " + review.getRating());
            System.out.println("----------------");
        }
    }
}
