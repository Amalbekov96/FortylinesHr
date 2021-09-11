package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Competencies;
import hr.fortylines.com.Models.Dto.CompetenciesDto;
import hr.fortylines.com.Models.Mappers.CompetenciesMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciesMapperImpl implements CompetenciesMapper {
    @Override
    public Competencies toEntity(CompetenciesDto competenciesDto) {
        return CompetenciesMapper.INSTANCE.toEntity(competenciesDto);
    }

    @Override
    public CompetenciesDto toDto(Competencies competencies) {
        return CompetenciesMapper.INSTANCE.toDto(competencies);
    }

    @Override
    public List<Competencies> toListEntity(List<CompetenciesDto> d) {
        return CompetenciesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<CompetenciesDto> toListDto(List<Competencies> e) {
        return CompetenciesMapper.INSTANCE.toListDto(e);
    }
}
