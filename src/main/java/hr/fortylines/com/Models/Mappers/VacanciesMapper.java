package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.VacanciesDto;
import hr.fortylines.com.Models.Vacancies;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface VacanciesMapper extends BaseMapper<Vacancies, VacanciesDto>{
    VacanciesMapper INSTANCE = Mappers.getMapper(VacanciesMapper.class);
}
