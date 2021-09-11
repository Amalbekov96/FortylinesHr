package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.RequirementsDto;
import hr.fortylines.com.Models.Requirements;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RequirementsMapper extends BaseMapper<Requirements, RequirementsDto>{
    RequirementsMapper INSTANCE = Mappers.getMapper(RequirementsMapper.class);
}
