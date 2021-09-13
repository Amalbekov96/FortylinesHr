package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Dto.CompetenciesDto;
import hr.fortylines.com.Service.Impl.CompetenciesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Competency")
public class CompetenciesController extends BaseController<Competencies, CompetenciesDto, CompetenciesService> {
    protected CompetenciesController(CompetenciesService service) {
        super(service);
    }
}
