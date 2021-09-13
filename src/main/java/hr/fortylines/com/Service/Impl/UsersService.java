package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Mappers.UsersMapper;
import hr.fortylines.com.Models.Users;
import hr.fortylines.com.Repository.UsersRepo;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends BaseServiceImpl<Users, UsersDto, UsersMapper, UsersRepo>{
    public UsersService(UsersRepo repo, UsersMapper mapper) {
        super(repo, mapper);
    }
}
