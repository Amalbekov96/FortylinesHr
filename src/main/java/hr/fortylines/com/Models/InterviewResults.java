package hr.fortylines.com.Models;

import hr.fortylines.com.Models.Enums.InterviewStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class InterviewResults extends BaseEntity{

    @OneToMany(mappedBy = "interview_results")
    private List<InterviewEstimation> estimations;
    private InterviewStatus status;
    @CreationTimestamp
    private LocalDateTime addDate;

}
