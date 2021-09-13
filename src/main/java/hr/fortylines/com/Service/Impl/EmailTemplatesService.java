package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.EmailTemplatesDto;
import hr.fortylines.com.Models.EmailTemplates;
import hr.fortylines.com.Models.Mappers.EmailTemplatesMapper;
import hr.fortylines.com.Repository.EmailTemplatesRepo;
import org.springframework.stereotype.Service;

@Service
public class EmailTemplatesService extends BaseServiceImpl<EmailTemplates, EmailTemplatesDto, EmailTemplatesMapper, EmailTemplatesRepo>{
    public EmailTemplatesService(EmailTemplatesRepo repo, EmailTemplatesMapper mapper) {
        super(repo, mapper);
    }
}
