package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.NotificationsDto;
import hr.fortylines.com.Models.Notifications;
import hr.fortylines.com.Service.Impl.NotificationsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Notifications")
public class NotificationsController extends BaseController<Notifications, NotificationsDto, NotificationsService> {
    protected NotificationsController(NotificationsService service) {
        super(service);
    }
}
