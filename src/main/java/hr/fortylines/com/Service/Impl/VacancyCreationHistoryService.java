package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.VacancyCreationHistoryDto;
import hr.fortylines.com.Models.Mappers.VacancyCreationHistoryMapper;
import hr.fortylines.com.Models.VacancyCreationHistory;
import hr.fortylines.com.Repository.VacancyCreationHistoryRepo;
import org.springframework.stereotype.Service;

@Service
public class VacancyCreationHistoryService extends BaseServiceImpl<VacancyCreationHistory, VacancyCreationHistoryDto, VacancyCreationHistoryMapper, VacancyCreationHistoryRepo>{
    public VacancyCreationHistoryService(VacancyCreationHistoryRepo repo, VacancyCreationHistoryMapper mapper) {
        super(repo, mapper);
    }
}
