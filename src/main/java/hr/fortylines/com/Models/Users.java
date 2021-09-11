package hr.fortylines.com.Models;

import hr.fortylines.com.Models.Enums.UsersRoles;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
public class Users extends BaseEntity{
    private String unsername;
    private String password;
    private String first_name;
    private String last_name;
    private UsersRoles role;
    @ManyToOne
    private Departments department;
}
