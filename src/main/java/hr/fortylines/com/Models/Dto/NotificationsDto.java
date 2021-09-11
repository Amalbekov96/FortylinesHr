package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.EmailTemplates;
import hr.fortylines.com.Models.Users;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationsDto extends BaseDto{
    private EmailTemplates template;
    private Users user;
    private LocalDateTime addDate;
}
