package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Departments;
import hr.fortylines.com.Models.Dto.DepartmentsDto;
import hr.fortylines.com.Models.Mappers.DepartmentsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsMapperImpl implements DepartmentsMapper {
    @Override
    public Departments toEntity(DepartmentsDto departmentsDto) {
        return DepartmentsMapper.INSTANCE.toEntity(departmentsDto);
    }

    @Override
    public DepartmentsDto toDto(Departments departments) {
        return DepartmentsMapper.INSTANCE.toDto(departments);
    }

    @Override
    public List<Departments> toListEntity(List<DepartmentsDto> d) {
        return DepartmentsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<DepartmentsDto> toListDto(List<Departments> e) {
        return DepartmentsMapper.INSTANCE.toListDto(e);
    }
}
