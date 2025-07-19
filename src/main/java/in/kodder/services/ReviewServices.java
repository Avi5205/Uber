package in.kodder.services;

import in.kodder.models.Review;
import in.kodder.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewServices implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************");
        Review r = Review.builder()
                .content("Amazing service, highly recommend!")
                .createdAt(new Date())
                .updatedAt(new  Date())
                .rating(4.5)
                .build();
        reviewRepository.save(r);
    }
}
