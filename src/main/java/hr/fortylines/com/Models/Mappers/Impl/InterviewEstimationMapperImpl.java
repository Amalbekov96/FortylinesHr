package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.InterviewEstimationDto;
import hr.fortylines.com.Models.InterviewEstimation;
import hr.fortylines.com.Models.Mappers.InterviewEstimationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewEstimationMapperImpl implements InterviewEstimationMapper {


    @Override
    public InterviewEstimation toEntity(InterviewEstimationDto interviewEstimationDto) {
        return InterviewEstimationMapper.INSTANCE.toEntity(interviewEstimationDto);
    }

    @Override
    public InterviewEstimationDto toDto(InterviewEstimation interviewEstimation) {
        return InterviewEstimationMapper.INSTANCE.toDto(interviewEstimation);
    }

    @Override
    public List<InterviewEstimation> toListEntity(List<InterviewEstimationDto> d) {
        return InterviewEstimationMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<InterviewEstimationDto> toListDto(List<InterviewEstimation> e) {
        return InterviewEstimationMapper.INSTANCE.toListDto(e);
    }
}
