package hr.fortylines.com.Models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class Notifications extends BaseEntity{

    @ManyToOne
    private EmailTemplates template;
    @ManyToOne
    private Users user;
    @CreationTimestamp
    private LocalDateTime addDate;
}
