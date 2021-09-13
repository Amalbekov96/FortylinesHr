package hr.fortylines.com.Controller.Common;

import hr.fortylines.com.Controller.BaseController;
import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Dto.DepartmentsDto;
import hr.fortylines.com.Service.Impl.DepartmentsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Departments")
public class DepartmentsController extends BaseController<Departments, DepartmentsDto, DepartmentsService> {
    protected DepartmentsController(DepartmentsService service) {
        super(service);
    }
}
