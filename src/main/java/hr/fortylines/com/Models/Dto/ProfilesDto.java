package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Enums.InterviewStatus;
import hr.fortylines.com.Models.Vacancies;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProfilesDto extends BaseDto{

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String skypeOrDiscord;
    private int yearOfExperience;
    private String cvUrl;
    private String comments;
    private InterviewStatus interviewResult;
    private Vacancies vacancy;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
