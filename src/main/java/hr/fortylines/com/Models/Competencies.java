package hr.fortylines.com.Models;

import lombok.Data;
import org.apache.catalina.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class Competencies extends BaseEntity {

    @ManyToOne
    private Users users;
    private String name;
    @CreationTimestamp
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
