package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Dto.CompetenciesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompetenciesMapper extends BaseMapper<Competencies, CompetenciesDto>{
    CompetenciesMapper INSTANCE = Mappers.getMapper(CompetenciesMapper.class);
}
