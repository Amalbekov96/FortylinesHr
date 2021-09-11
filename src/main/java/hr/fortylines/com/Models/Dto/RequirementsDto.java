package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequirementsDto extends BaseDto{
    private String name;
    private Users user;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
