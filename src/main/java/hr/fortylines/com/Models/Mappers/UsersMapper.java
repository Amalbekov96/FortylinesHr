package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Dto.UsersDto;
import hr.fortylines.com.Models.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UsersMapper extends BaseMapper<Users, UsersDto>{
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
}
