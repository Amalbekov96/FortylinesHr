package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.InterviewEventsDto;
import hr.fortylines.com.Models.InterviewEvents;
import hr.fortylines.com.Service.Impl.InterviewEventsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/InterviewEvents")
public class InterviewEventsController extends BaseController<InterviewEvents, InterviewEventsDto, InterviewEventsService> {
    protected InterviewEventsController(InterviewEventsService service) {
        super(service);
    }
}
