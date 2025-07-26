package in.kodder.services;

import in.kodder.models.Booking;
import in.kodder.models.Driver;
import in.kodder.repositories.BookingRepository;
import in.kodder.repositories.DriverRepository;
import in.kodder.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class ReviewServices implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************");
//        Review r = Review.builder()
//                .content("service is amazing, highly recommend!")
//                .rating(4.5)
//                .build();
//        Booking b = Booking.builder()
//                .review(r)
//                .endTime(new Date())
//                .build();
//        System.out.println(r);
////        reviewRepository.save(r);
//        bookingRepository.save(b);
//
//        List<Review> reviews = reviewRepository.findAll();
//        for (Review review : reviews) {
//            System.out.println("Review ID: " + review.getId());
//            System.out.println("Content: " + review.getContent());
//            System.out.println("Rating: " + review.getRating());
//            System.out.println("----------------");
//        }

//        List<Driver> drivers = driverRepository.findAll();

        List<Long> driverIds = new ArrayList<>(Arrays.asList(1L, 3L, 4L, 5L, 6L, 7L, 8L, 19L, 20L, 21L, 22L, 23L));
        List<Driver> drivers = driverRepository.findAllById(driverIds);

//        List<Booking> bookings = bookingRepository.findAllByDriverIn(drivers);
        for (Driver driver : drivers) {
            List<Booking> bookings = driver.getBookings();
            bookings.forEach(booking -> System.out.println(booking.getId()));
        }
    }
}
