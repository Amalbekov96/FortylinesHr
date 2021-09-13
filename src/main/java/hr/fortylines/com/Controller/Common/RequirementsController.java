package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.RequirementsDto;
import hr.fortylines.com.Models.Requirements;
import hr.fortylines.com.Service.Impl.RequirementsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Requirements")
public class RequirementsController extends BaseController<Requirements, RequirementsDto, RequirementsService> {
    protected RequirementsController(RequirementsService service) {
        super(service);
    }
}
