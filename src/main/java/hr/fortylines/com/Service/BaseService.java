package hr.fortylines.com.Service;

import hr.fortylines.com.Models.Dto.BaseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BaseService<D extends BaseDto> {
    ResponseEntity<?> findById(Long id);
    ResponseEntity<?> save(D d);
    void deleteById(Long id);
    List<D> findAll();
}
