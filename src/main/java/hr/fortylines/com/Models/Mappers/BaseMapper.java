package hr.fortylines.com.Models.Mappers;

import hr.fortylines.com.Models.BaseEntity;
import hr.fortylines.com.Models.Dto.BaseDto;

import java.util.List;

public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {
    E toEntity(D d);
    D toDto(E e);
    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);
}