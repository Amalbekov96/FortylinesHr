package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Mappers.UsersMapper;
import hr.fortylines.com.Models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersMapperImpl implements UsersMapper {
    @Override
    public Users toEntity(UsersDto usersDto) {
        return UsersMapper.INSTANCE.toEntity(usersDto);
    }

    @Override
    public UsersDto toDto(Users users) {
        return UsersMapper.INSTANCE.toDto(users);
    }

    @Override
    public List<Users> toListEntity(List<UsersDto> d) {
        return UsersMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<UsersDto> toListDto(List<Users> e) {
        return UsersMapper.INSTANCE.toListDto(e);
    }
}
