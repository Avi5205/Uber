package in.kodder.repositories;

import in.kodder.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    List<Driver> findAllByIdIn(List<Long> driverIds);


}
