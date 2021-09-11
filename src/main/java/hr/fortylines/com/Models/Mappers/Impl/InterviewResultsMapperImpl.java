package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.InterviewResultsDto;
import hr.fortylines.com.Models.InterviewResults;
import hr.fortylines.com.Models.Mappers.InterviewResultsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewResultsMapperImpl implements InterviewResultsMapper {
    @Override
    public InterviewResults toEntity(InterviewResultsDto interviewResultsDto) {
        return InterviewResultsMapper.INSTANCE.toEntity(interviewResultsDto);
    }

    @Override
    public InterviewResultsDto toDto(InterviewResults interviewResults) {
        return InterviewResultsMapper.INSTANCE.toDto(interviewResults);
    }

    @Override
    public List<InterviewResults> toListEntity(List<InterviewResultsDto> d) {
        return InterviewResultsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<InterviewResultsDto> toListDto(List<InterviewResults> e) {
        return InterviewResultsMapper.INSTANCE.toListDto(e);
    }
}
