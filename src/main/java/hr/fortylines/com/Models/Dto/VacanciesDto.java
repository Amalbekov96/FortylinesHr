package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Enums.VacancyStatus;
import hr.fortylines.com.Models.Requirements;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class VacanciesDto extends BaseDto{

    private Departments department;
    private VacancyStatus status;
    private List<Requirements> requirement;
    private List<Competencies> competency;
    private String description;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
}
