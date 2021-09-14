package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Exceptions.EntityNotFound;
import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Mappers.UsersMapper;
import hr.fortylines.com.Models.Users;
import hr.fortylines.com.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends BaseServiceImpl<Users, UsersDto, UsersMapper, UsersRepo>{
    public UsersService(UsersRepo repo, UsersMapper mapper) {
        super(repo, mapper);
    }


    @Autowired
    private UsersRepo usersRepo;
    @Autowired
    private UsersMapper usersMapper;

    public UsersDto findByUsername(String username){

        Users user = usersRepo.findByUnsername(username);

        if(user != null){
            usersMapper.toDto(user);
        } else {
            throw new EntityNotFound("User " + user.getUnsername() + " is not found!");
        }
        return null;
    }
}
