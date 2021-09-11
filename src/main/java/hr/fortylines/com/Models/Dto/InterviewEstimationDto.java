package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Profiles;
import hr.fortylines.com.Models.Users;

import java.time.LocalDateTime;

public class InterviewEstimationDto extends BaseDto{
    private Profiles profile;
    private Users user;
    private String comments;
    private LocalDateTime addDate;
}
