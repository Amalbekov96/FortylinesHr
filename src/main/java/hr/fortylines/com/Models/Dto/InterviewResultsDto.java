package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Enums.InterviewStatus;
import hr.fortylines.com.Models.InterviewEstimation;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class InterviewResultsDto extends BaseDto{
    private List<InterviewEstimation> estimations;
    private InterviewStatus status;
    private LocalDateTime addDate;
}
