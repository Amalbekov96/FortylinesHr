package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.InterviewEventsDto;
import hr.fortylines.com.Models.InterviewEvents;
import hr.fortylines.com.Models.Mappers.InterviewEventsMapper;
import hr.fortylines.com.Repository.InterviewEventsRepo;
import org.springframework.stereotype.Service;

@Service
public class InterviewEventsService extends BaseServiceImpl<InterviewEvents, InterviewEventsDto, InterviewEventsMapper, InterviewEventsRepo>{
    public InterviewEventsService(InterviewEventsRepo repo, InterviewEventsMapper mapper) {
        super(repo, mapper);
    }
}
