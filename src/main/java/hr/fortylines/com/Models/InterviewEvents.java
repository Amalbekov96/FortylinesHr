package hr.fortylines.com.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class InterviewEvents extends BaseEntity{

    @OneToOne
    private Profiles profile;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    @OneToMany(mappedBy = "interview_events")
    private List<Users> users;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
}
