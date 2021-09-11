package hr.fortylines.com.Models;

import hr.fortylines.com.Models.Enums.VacancyCreationStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class VacancyCreationHistory extends BaseEntity{
    @ManyToOne
    private Departments department;
    private VacancyCreationStatus status;
    @OneToMany(mappedBy = "vacancy_creation_history")
    private List<Requirements> requirement;
    private String description;
    @ManyToOne
    private Users chief;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;
    @OneToMany(mappedBy = "vacancy_creation_history")
    private List<Competencies> competency;
}
