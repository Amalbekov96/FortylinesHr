package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.EmailTemplatesTypesDto;
import hr.fortylines.com.Models.EmailTemplatesTypes;
import hr.fortylines.com.Models.Mappers.EmailTemplatesTypesMapper;
import hr.fortylines.com.Repository.EmailTemplatesTypesRepo;
import org.springframework.stereotype.Service;

@Service
public class EmailTemplatesTypesService extends BaseServiceImpl<EmailTemplatesTypes, EmailTemplatesTypesDto, EmailTemplatesTypesMapper, EmailTemplatesTypesRepo>{
    public EmailTemplatesTypesService(EmailTemplatesTypesRepo repo, EmailTemplatesTypesMapper mapper) {
        super(repo, mapper);
    }
}
