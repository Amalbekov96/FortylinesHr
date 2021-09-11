package hr.fortylines.com.Models.Dto;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseDto {
    private int id;

}
