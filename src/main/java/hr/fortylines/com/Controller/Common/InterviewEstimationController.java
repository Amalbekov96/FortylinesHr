package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.InterviewEstimationDto;
import hr.fortylines.com.Models.InterviewEstimation;
import hr.fortylines.com.Service.Impl.InterviewEstimationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/InterviewEstimation")
public class InterviewEstimationController extends BaseController<InterviewEstimation, InterviewEstimationDto, InterviewEstimationService> {
    protected InterviewEstimationController(InterviewEstimationService service) {
        super(service);
    }
}
