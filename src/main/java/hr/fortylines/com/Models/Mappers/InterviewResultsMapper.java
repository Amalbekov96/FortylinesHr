package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.InterviewResultsDto;
import hr.fortylines.com.Models.InterviewResults;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface InterviewResultsMapper extends BaseMapper<InterviewResults, InterviewResultsDto>{
    InterviewResultsMapper INSTANCE = Mappers.getMapper(InterviewResultsMapper.class);
}
