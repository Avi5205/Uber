package in.kodder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bookingreview")
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
