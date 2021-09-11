package hr.fortylines.com.Models.Mappers.Impl;

import hr.fortylines.com.Models.Dto.VacanciesDto;
import hr.fortylines.com.Models.Mappers.VacanciesMapper;
import hr.fortylines.com.Models.Vacancies;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VacanciesMapperImpl implements VacanciesMapper {
    @Override
    public Vacancies toEntity(VacanciesDto vacanciesDto) {
        return VacanciesMapper.INSTANCE.toEntity(vacanciesDto);
    }

    @Override
    public VacanciesDto toDto(Vacancies vacancies) {
        return VacanciesMapper.INSTANCE.toDto(vacancies);
    }

    @Override
    public List<Vacancies> toListEntity(List<VacanciesDto> d) {
        return VacanciesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<VacanciesDto> toListDto(List<Vacancies> e) {
        return VacanciesMapper.INSTANCE.toListDto(e);
    }
}
