package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.UserChatProfileDto;
import hr.fortylines.com.Models.Mappers.UserChatProfileMapper;
import hr.fortylines.com.Models.UserChatProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserChatProfileMapperImpl implements UserChatProfileMapper {
    @Override
    public UserChatProfile toEntity(UserChatProfileDto userChatProfileDto) {
        return UserChatProfileMapper.INSTANCE.toEntity(userChatProfileDto);
    }

    @Override
    public UserChatProfileDto toDto(UserChatProfile userChatProfile) {
        return UserChatProfileMapper.INSTANCE.toDto(userChatProfile);
    }

    @Override
    public List<UserChatProfile> toListEntity(List<UserChatProfileDto> d) {
        return UserChatProfileMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<UserChatProfileDto> toListDto(List<UserChatProfile> e) {
        return UserChatProfileMapper.INSTANCE.toListDto(e);
    }
}
