package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.VacanciesDto;
import hr.fortylines.com.Models.Mappers.VacanciesMapper;
import hr.fortylines.com.Models.Vacancies;
import hr.fortylines.com.Repository.VacanciesRepo;
import org.springframework.stereotype.Service;

@Service
public class VacanciesService extends BaseServiceImpl<Vacancies, VacanciesDto, VacanciesMapper, VacanciesRepo>{
    public VacanciesService(VacanciesRepo repo, VacanciesMapper mapper) {
        super(repo, mapper);
    }
}
