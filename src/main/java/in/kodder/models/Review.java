package in.kodder.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {

    @Column(nullable = false)
    private String content;
    private Double rating;

    @Override
    public String toString() {
        return "Review: " + this.content +
                ", Rating: " + this.rating +
                ", Created At: " + this.createdAt;
    }
}
