package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Profiles;
import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class InterviewEventsDto extends BaseDto{
    private Profiles profile;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private List<Users> users;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
