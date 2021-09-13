package hr.fortylines.com.Controller;

import hr.fortylines.com.Models.BaseEntity;
import hr.fortylines.com.Models.Dto.BaseDto;
import hr.fortylines.com.Service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseController<E extends BaseEntity, D extends BaseDto, S extends BaseService<D>> {

    private final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("/findById/{id}")
    ResponseEntity<?> findById(@PathVariable Long id) {return ResponseEntity.ok(this.service.findById(id));}

    @PostMapping("/create")
    ResponseEntity<?> save(@RequestBody D d){return ResponseEntity.ok(this.service.save(d));}

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){ this.service.deleteById(id);}

    @GetMapping("/findAll")
    ResponseEntity<?> findAll(){ return ResponseEntity.ok(this.service.findAll());}
}
