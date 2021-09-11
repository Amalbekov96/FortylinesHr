package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.RequirementsDto;
import hr.fortylines.com.Models.Mappers.RequirementsMapper;
import hr.fortylines.com.Models.Requirements;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequirementsMapperImpl implements RequirementsMapper {
    @Override
    public Requirements toEntity(RequirementsDto requirementsDto) {
        return RequirementsMapper.INSTANCE.toEntity(requirementsDto);
    }

    @Override
    public RequirementsDto toDto(Requirements requirements) {
        return RequirementsMapper.INSTANCE.toDto(requirements);
    }

    @Override
    public List<Requirements> toListEntity(List<RequirementsDto> d) {
        return RequirementsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<RequirementsDto> toListDto(List<Requirements> e) {
        return RequirementsMapper.INSTANCE.toListDto(e);
    }
}
