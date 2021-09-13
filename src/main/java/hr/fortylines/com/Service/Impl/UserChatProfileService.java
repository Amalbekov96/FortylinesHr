package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.UserChatProfileDto;
import hr.fortylines.com.Models.Mappers.UserChatProfileMapper;
import hr.fortylines.com.Models.UserChatProfile;
import hr.fortylines.com.Repository.UserChatProfileRepo;
import org.springframework.stereotype.Service;

@Service
public class UserChatProfileService extends BaseServiceImpl<UserChatProfile, UserChatProfileDto, UserChatProfileMapper, UserChatProfileRepo>{
    public UserChatProfileService(UserChatProfileRepo repo, UserChatProfileMapper mapper) {
        super(repo, mapper);
    }
}
