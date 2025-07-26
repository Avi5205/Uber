package in.kodder.repositories;

import in.kodder.models.Booking;
import in.kodder.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findAllByDriverId(Long id);

    List<Booking> findAllByDriverIn(List<Driver> drivers);

}
