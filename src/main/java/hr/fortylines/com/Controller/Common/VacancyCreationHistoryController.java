package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Dto.VacancyCreationHistoryDto;
import hr.fortylines.com.Models.VacancyCreationHistory;
import hr.fortylines.com.Service.Impl.VacancyCreationHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/VacancyCreationHistory")
public class VacancyCreationHistoryController extends BaseController<VacancyCreationHistory, VacancyCreationHistoryDto, VacancyCreationHistoryService> {
    protected VacancyCreationHistoryController(VacancyCreationHistoryService service) {
        super(service);
    }
}
