package hr.fortylines.com.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class EmailTemplates extends BaseEntity{

    @ManyToOne
    private Departments department;
    private String message;
    @ManyToOne
    private Users createdUser;
    @OneToOne
    private EmailTemplatesTypes type;
    @CreationTimestamp
    private LocalDateTime addDate;
    @UpdateTimestamp
    private LocalDateTime editDate;

}
