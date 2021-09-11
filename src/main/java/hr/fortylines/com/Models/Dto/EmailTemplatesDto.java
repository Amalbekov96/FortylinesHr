package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.EmailTemplatesTypes;
import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailTemplatesDto extends BaseDto{

    private Departments department;
    private String message;
    private Users createdUser;
    private EmailTemplatesTypes type;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
