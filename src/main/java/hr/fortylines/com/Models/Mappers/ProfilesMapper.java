package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.ProfilesDto;
import hr.fortylines.com.Models.Profiles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ProfilesMapper extends BaseMapper<Profiles, ProfilesDto>{
    ProfilesMapper INSTANCE = Mappers.getMapper(ProfilesMapper.class);
}
