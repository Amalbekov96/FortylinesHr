package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Dto.DepartmentsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DepartmentsMapper extends BaseMapper<Departments, DepartmentsDto>{
    DepartmentsMapper INSTANCE = Mappers.getMapper(DepartmentsMapper.class);
}
