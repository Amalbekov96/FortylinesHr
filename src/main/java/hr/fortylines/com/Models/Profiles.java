package hr.fortylines.com.Models;

import hr.fortylines.com.Models.Enums.InterviewStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class Profiles extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String skypeOrDiscord;
    private int yearOfExperience;
    private String cvUrl;
    private String comments;
    private InterviewStatus interviewResult;
    @ManyToOne
    private Vacancies vacancy;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
}
