package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.InterviewResultsDto;
import hr.fortylines.com.Models.InterviewResults;
import hr.fortylines.com.Service.Impl.InterviewResultsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/InterviewResults")
public class InterviewResultsController extends BaseController<InterviewResults, InterviewResultsDto, InterviewResultsService> {
    protected InterviewResultsController(InterviewResultsService service) {
        super(service);
    }
}
