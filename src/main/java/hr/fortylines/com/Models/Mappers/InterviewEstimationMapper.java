package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.InterviewEstimationDto;
import hr.fortylines.com.Models.InterviewEstimation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface InterviewEstimationMapper extends BaseMapper<InterviewEstimation, InterviewEstimationDto>{
    InterviewEstimationMapper INSTANCE = Mappers.getMapper(InterviewEstimationMapper.class);
}
