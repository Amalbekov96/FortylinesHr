package hr.fortylines.com.Service.Impl;

import hr.fortylines.com.Exceptions.EntityNotFound;
import hr.fortylines.com.Models.BaseEntity;
import hr.fortylines.com.Models.Dto.BaseDto;
import hr.fortylines.com.Models.Mappers.BaseMapper;
import hr.fortylines.com.Repository.BaseRepo;
import hr.fortylines.com.Service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;
import java.util.List;
@Service
@MappedSuperclass
public abstract class BaseServiceImpl<E extends BaseEntity, D extends BaseDto, M extends BaseMapper<E, D>, R extends BaseRepo<E>> implements BaseService<D> {

    private R repo;
    private M mapper;

    @Autowired
    public BaseServiceImpl(R repo, M mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<?> findById(Long id) {
        return ResponseEntity.ok(mapper.toDto(repo.findById(id).orElseThrow(()-> new EntityNotFound("Was not found"))));
    }

    @Override
    public ResponseEntity<?> save(D d) {
        return ResponseEntity.ok(mapper.toDto(repo.save(mapper.toEntity(d))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<D> findAll() {
        return mapper.toListDto(repo.findAll());
    }
}
