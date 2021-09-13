package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.ProfilesDto;
import hr.fortylines.com.Models.Mappers.ProfilesMapper;
import hr.fortylines.com.Models.Profiles;
import hr.fortylines.com.Repository.ProfilesRepo;
import org.springframework.stereotype.Service;

@Service
public class ProfilesService extends BaseServiceImpl<Profiles, ProfilesDto, ProfilesMapper, ProfilesRepo>{
    public ProfilesService(ProfilesRepo repo, ProfilesMapper mapper) {
        super(repo, mapper);
    }
}
