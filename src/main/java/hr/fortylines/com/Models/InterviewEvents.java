package hr.fortylines.com.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "interview_events")
public class InterviewEvents extends BaseEntity{

    @OneToOne
    private Profiles profile;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Users> users;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
}
