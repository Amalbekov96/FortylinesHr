package hr.fortylines.com.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class UserChatProfile extends BaseEntity{

    @ManyToOne
    private EmailTemplates template;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Profiles profile;
}
