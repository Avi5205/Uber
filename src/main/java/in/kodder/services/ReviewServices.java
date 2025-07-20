package in.kodder.services;

import in.kodder.models.Booking;
import in.kodder.models.Review;
import in.kodder.repositories.BookingRepository;
import in.kodder.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************");
        Review r = Review.builder()
                .content("service is amazing, highly recommend!")
                .rating(4.5)
                .build();
        Booking b = Booking.builder()
                .review(r)
                .endTime(new Date())
                .build();
        System.out.println(r);
//        reviewRepository.save(r);
        bookingRepository.save(b);

        List<Review> reviews = reviewRepository.findAll();
        for (Review review : reviews) {
            System.out.println("Review ID: " + review.getId());
            System.out.println("Content: " + review.getContent());
            System.out.println("Rating: " + review.getRating());
            System.out.println("----------------");
        }
    }
}
