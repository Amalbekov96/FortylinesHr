package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.EmailTemplatesTypesDto;
import hr.fortylines.com.Models.EmailTemplatesTypes;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EmailTemplatesTypesMapper extends BaseMapper<EmailTemplatesTypes, EmailTemplatesTypesDto>{
    EmailTemplatesTypesMapper INSTANCE = Mappers.getMapper(EmailTemplatesTypesMapper.class);
}
