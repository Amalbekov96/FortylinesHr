package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.EmailTemplatesTypesDto;
import hr.fortylines.com.Models.EmailTemplatesTypes;
import hr.fortylines.com.Models.Mappers.EmailTemplatesTypesMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailTemplatesTypesMapperImpl implements EmailTemplatesTypesMapper {
    @Override
    public EmailTemplatesTypes toEntity(EmailTemplatesTypesDto emailTemplatesTypesDto) {
        return EmailTemplatesTypesMapper.INSTANCE.toEntity(emailTemplatesTypesDto);
    }

    @Override
    public EmailTemplatesTypesDto toDto(EmailTemplatesTypes emailTemplatesTypes) {
        return EmailTemplatesTypesMapper.INSTANCE.toDto(emailTemplatesTypes);
    }

    @Override
    public List<EmailTemplatesTypes> toListEntity(List<EmailTemplatesTypesDto> d) {
        return EmailTemplatesTypesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<EmailTemplatesTypesDto> toListDto(List<EmailTemplatesTypes> e) {
        return EmailTemplatesTypesMapper.INSTANCE.toListDto(e);
    }
}
