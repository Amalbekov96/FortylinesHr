package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.ProfilesDto;
import hr.fortylines.com.Models.Mappers.ProfilesMapper;
import hr.fortylines.com.Models.Profiles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilesMapperImpl implements ProfilesMapper {
    @Override
    public Profiles toEntity(ProfilesDto profilesDto) {
        return ProfilesMapper.INSTANCE.toEntity(profilesDto);
    }

    @Override
    public ProfilesDto toDto(Profiles profiles) {
        return ProfilesMapper.INSTANCE.toDto(profiles);
    }

    @Override
    public List<Profiles> toListEntity(List<ProfilesDto> d) {
        return ProfilesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<ProfilesDto> toListDto(List<Profiles> e) {
        return ProfilesMapper.INSTANCE.toListDto(e);
    }
}
