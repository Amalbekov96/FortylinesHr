package hr.fortylines.com.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class InterviewEstimation extends BaseEntity {
    @ManyToOne
    private Profiles profile;
    @OneToOne
    private Users user;
    private String comments;
    @CreationTimestamp
    private LocalDateTime addDate;
}
