package hr.fortylines.com.Models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class EmailTemplatesTypes extends BaseEntity {
    private String name;
}
