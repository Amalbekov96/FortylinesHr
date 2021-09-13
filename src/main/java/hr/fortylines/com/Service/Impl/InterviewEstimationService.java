package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.InterviewEstimationDto;
import hr.fortylines.com.Models.InterviewEstimation;
import hr.fortylines.com.Models.Mappers.InterviewEstimationMapper;
import hr.fortylines.com.Repository.InterviewEstimationRepo;
import org.springframework.stereotype.Service;

@Service
public class InterviewEstimationService extends BaseServiceImpl<InterviewEstimation, InterviewEstimationDto, InterviewEstimationMapper, InterviewEstimationRepo>{
    public InterviewEstimationService(InterviewEstimationRepo repo, InterviewEstimationMapper mapper) {
        super(repo, mapper);
    }
}
