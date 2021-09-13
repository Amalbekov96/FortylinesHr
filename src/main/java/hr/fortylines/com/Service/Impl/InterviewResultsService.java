package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.InterviewResultsDto;
import hr.fortylines.com.Models.InterviewResults;
import hr.fortylines.com.Models.Mappers.InterviewResultsMapper;
import hr.fortylines.com.Repository.InterviewResultsRepo;
import org.springframework.stereotype.Service;

@Service
public class InterviewResultsService extends BaseServiceImpl<InterviewResults, InterviewResultsDto, InterviewResultsMapper, InterviewResultsRepo>{
    public InterviewResultsService(InterviewResultsRepo repo, InterviewResultsMapper mapper) {
        super(repo, mapper);
    }
}
