package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.InterviewEventsDto;
import hr.fortylines.com.Models.InterviewEvents;
import hr.fortylines.com.Models.Mappers.InterviewEventsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewEventsMapperImpl implements InterviewEventsMapper {
    @Override
    public InterviewEvents toEntity(InterviewEventsDto interviewEventsDto) {
        return InterviewEventsMapper.INSTANCE.toEntity(interviewEventsDto);
    }

    @Override
    public InterviewEventsDto toDto(InterviewEvents interviewEvents) {
        return InterviewEventsMapper.INSTANCE.toDto(interviewEvents);
    }

    @Override
    public List<InterviewEvents> toListEntity(List<InterviewEventsDto> d) {
        return InterviewEventsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<InterviewEventsDto> toListDto(List<InterviewEvents> e) {
        return InterviewEventsMapper.INSTANCE.toListDto(e);
    }
}
