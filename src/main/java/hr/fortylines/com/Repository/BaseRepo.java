package hr.fortylines.com.Repository;

import hr.fortylines.com.Models.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaseRepo<E extends BaseEntity> extends JpaRepository<E, Long> {
}
