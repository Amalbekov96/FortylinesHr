package hr.fortylines.com.Models;

import hr.fortylines.com.Models.Enums.VacancyStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
public class Vacancies extends BaseEntity{
    @ManyToOne
    private Departments department;
    private VacancyStatus status;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Requirements> requirement;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Competencies> competency;
    private String description;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
}
