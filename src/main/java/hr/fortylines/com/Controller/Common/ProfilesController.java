package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.ProfilesDto;
import hr.fortylines.com.Models.Profiles;
import hr.fortylines.com.Service.Impl.ProfilesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Profiles")
public class ProfilesController extends BaseController<Profiles, ProfilesDto, ProfilesService> {
    protected ProfilesController(ProfilesService service) {
        super(service);
    }
}
