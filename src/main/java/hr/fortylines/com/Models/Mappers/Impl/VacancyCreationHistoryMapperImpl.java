package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.VacancyCreationHistoryDto;
import hr.fortylines.com.Models.Mappers.VacancyCreationHistoryMapper;
import hr.fortylines.com.Models.VacancyCreationHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyCreationHistoryMapperImpl implements VacancyCreationHistoryMapper {
    @Override
    public VacancyCreationHistory toEntity(VacancyCreationHistoryDto vacancyCreationHistoryDto) {
        return VacancyCreationHistoryMapper.INSTANCE.toEntity(vacancyCreationHistoryDto);
    }

    @Override
    public VacancyCreationHistoryDto toDto(VacancyCreationHistory vacancyCreationHistory) {
        return VacancyCreationHistoryMapper.INSTANCE.toDto(vacancyCreationHistory);
    }

    @Override
    public List<VacancyCreationHistory> toListEntity(List<VacancyCreationHistoryDto> d) {
        return VacancyCreationHistoryMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<VacancyCreationHistoryDto> toListDto(List<VacancyCreationHistory> e) {
        return VacancyCreationHistoryMapper.INSTANCE.toListDto(e);
    }
}
