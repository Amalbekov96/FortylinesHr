package hr.fortylines.com.Models.Dto;

import hr.fortylines.com.Models.EmailTemplates;
import hr.fortylines.com.Models.Profiles;
import hr.fortylines.com.Models.Users;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class UserChatProfileDto extends BaseDto{
    private EmailTemplates template;
    private Users user;
    private Profiles profile;
}
