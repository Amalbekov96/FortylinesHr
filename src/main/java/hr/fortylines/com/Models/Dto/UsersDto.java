package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Enums.UsersRoles;
import lombok.Data;

@Data
public class UsersDto extends BaseDto{
    private String unsername;
    private String password;
    private String first_name;
    private String last_name;
    private UsersRoles role;
    private Departments department;
}
