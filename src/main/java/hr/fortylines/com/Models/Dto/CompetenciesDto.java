package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CompetenciesDto extends BaseDto{
    private Users users;
    private String name;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
