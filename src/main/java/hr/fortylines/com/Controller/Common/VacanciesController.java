package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.VacanciesDto;
import hr.fortylines.com.Models.Vacancies;
import hr.fortylines.com.Service.Impl.VacanciesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/Vacancies")
public class VacanciesController extends BaseController<Vacancies, VacanciesDto, VacanciesService> {
    protected VacanciesController(VacanciesService service) {
        super(service);
    }
}
