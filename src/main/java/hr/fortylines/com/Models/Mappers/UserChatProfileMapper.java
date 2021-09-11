package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.UserChatProfileDto;
import hr.fortylines.com.Models.UserChatProfile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserChatProfileMapper extends BaseMapper<UserChatProfile, UserChatProfileDto>{
    UserChatProfileMapper INSTANCE = Mappers.getMapper(UserChatProfileMapper.class);
}
