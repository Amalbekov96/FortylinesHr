package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.UserChatProfileDto;
import hr.fortylines.com.Models.UserChatProfile;
import hr.fortylines.com.Service.Impl.UserChatProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/UCProfile")
public class UserChatProfileController extends BaseController<UserChatProfile, UserChatProfileDto, UserChatProfileService> {
    protected UserChatProfileController(UserChatProfileService service) {
        super(service);
    }
}
