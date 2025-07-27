package in.kodder.repositories;

import in.kodder.models.Booking;
import in.kodder.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("SELECT r from Booking b inner join Review r where b.id  = :bookingId")
    Review findByBookingId(Long bookingId);
}
