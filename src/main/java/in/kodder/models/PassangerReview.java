package in.kodder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassangerReview extends Review {

    @Column(nullable = false)
    private String passengerReviewColumn;

    @Column(nullable = false)
    private String passengerRating;
}
