package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.InterviewEventsDto;
import hr.fortylines.com.Models.InterviewEvents;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface InterviewEventsMapper extends BaseMapper<InterviewEvents, InterviewEventsDto>{
    InterviewEventsMapper INSTANCE = Mappers.getMapper(InterviewEventsMapper.class);
}
