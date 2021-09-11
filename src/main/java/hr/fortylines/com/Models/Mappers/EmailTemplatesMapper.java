package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.EmailTemplatesDto;
import hr.fortylines.com.Models.EmailTemplates;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EmailTemplatesMapper extends BaseMapper<EmailTemplates, EmailTemplatesDto>{
    EmailTemplatesMapper INSTANCE = Mappers.getMapper(EmailTemplatesMapper.class);
}
