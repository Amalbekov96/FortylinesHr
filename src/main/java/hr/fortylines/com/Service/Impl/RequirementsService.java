package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.RequirementsDto;
import hr.fortylines.com.Models.Mappers.RequirementsMapper;
import hr.fortylines.com.Models.Requirements;
import hr.fortylines.com.Repository.RequirementsRepo;
import org.springframework.stereotype.Service;

@Service
public class RequirementsService extends BaseServiceImpl<Requirements, RequirementsDto, RequirementsMapper, RequirementsRepo>{
    public RequirementsService(RequirementsRepo repo, RequirementsMapper mapper) {
        super(repo, mapper);
    }
}
