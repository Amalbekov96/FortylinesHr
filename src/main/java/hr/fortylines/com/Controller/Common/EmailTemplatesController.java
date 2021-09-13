package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.EmailTemplatesDto;
import hr.fortylines.com.Models.EmailTemplates;
import hr.fortylines.com.Service.Impl.EmailTemplatesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/EmailTemplates")
public class EmailTemplatesController extends BaseController<EmailTemplates, EmailTemplatesDto, EmailTemplatesService> {
    protected EmailTemplatesController(EmailTemplatesService service) {
        super(service);
    }
}
