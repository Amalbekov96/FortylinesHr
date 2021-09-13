package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.EmailTemplatesTypesDto;
import hr.fortylines.com.Models.EmailTemplatesTypes;
import hr.fortylines.com.Service.Impl.EmailTemplatesTypesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/EmailTemplatesTypes")
public class EmailTemplatesTypesController extends BaseController<EmailTemplatesTypes, EmailTemplatesTypesDto, EmailTemplatesTypesService> {
    protected EmailTemplatesTypesController(EmailTemplatesTypesService service) {
        super(service);
    }
}
