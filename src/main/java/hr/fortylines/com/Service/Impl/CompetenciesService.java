package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Dto.CompetenciesDto;
import hr.fortylines.com.Models.Mappers.CompetenciesMapper;
import hr.fortylines.com.Repository.CompetenciesRepo;
import org.springframework.stereotype.Service;

@Service
public class CompetenciesService extends BaseServiceImpl<Competencies, CompetenciesDto, CompetenciesMapper, CompetenciesRepo>{
    public CompetenciesService(CompetenciesRepo repo, CompetenciesMapper mapper) {
        super(repo, mapper);
    }
}
