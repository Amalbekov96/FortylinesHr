package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.EmailTemplatesDto;
import hr.fortylines.com.Models.EmailTemplates;
import hr.fortylines.com.Models.Mappers.EmailTemplatesMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailTemplatesMapperImpl implements EmailTemplatesMapper {
    @Override
    public EmailTemplates toEntity(EmailTemplatesDto emailTemplatesDto) {
        return EmailTemplatesMapper.INSTANCE.toEntity(emailTemplatesDto);
    }

    @Override
    public EmailTemplatesDto toDto(EmailTemplates emailTemplates) {
        return EmailTemplatesMapper.INSTANCE.toDto(emailTemplates);
    }

    @Override
    public List<EmailTemplates> toListEntity(List<EmailTemplatesDto> d) {
        return EmailTemplatesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<EmailTemplatesDto> toListDto(List<EmailTemplates> e) {
        return EmailTemplatesMapper.INSTANCE.toListDto(e);
    }
}
