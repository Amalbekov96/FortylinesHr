package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Users;
import hr.fortylines.com.Service.Impl.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Users")
public class UsersController extends BaseController<Users, UsersDto, UsersService> {
    protected UsersController(UsersService service) {
        super(service);
    }
}
