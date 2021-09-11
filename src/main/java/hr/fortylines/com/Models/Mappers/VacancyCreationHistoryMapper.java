package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.VacancyCreationHistoryDto;
import hr.fortylines.com.Models.VacancyCreationHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface VacancyCreationHistoryMapper extends BaseMapper<VacancyCreationHistory, VacancyCreationHistoryDto>{
    VacancyCreationHistoryMapper INSTANCE = Mappers.getMapper(VacancyCreationHistoryMapper.class);
}
