package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Enums.VacancyCreationStatus;
import hr.fortylines.com.Models.Requirements;
import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class VacancyCreationHistoryDto extends BaseDto{
    private Departments department;
    private VacancyCreationStatus status;
    private List<Requirements> requirement;
    private String description;
    private Users chief;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private List<Competencies> competency;
}
