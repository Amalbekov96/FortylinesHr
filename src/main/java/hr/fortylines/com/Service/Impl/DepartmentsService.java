package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Dto.DepartmentsDto;
import hr.fortylines.com.Models.Mappers.DepartmentsMapper;
import hr.fortylines.com.Repository.DepartmentsRepo;
import org.springframework.stereotype.Service;

@Service
public class DepartmentsService extends BaseServiceImpl<Departments, DepartmentsDto, DepartmentsMapper, DepartmentsRepo>{
    public DepartmentsService(DepartmentsRepo repo, DepartmentsMapper mapper) {
        super(repo, mapper);
    }
}
