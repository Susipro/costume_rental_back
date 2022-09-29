package org.projectindividualcrud.demoprojectcrud.controllers;

import org.projectindividualcrud.demoprojectcrud.models.Customes;
import org.projectindividualcrud.demoprojectcrud.repositories.CustomesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controllers/v1/costume")
public class CostumesController {

    private final CustomesRepository customesRepository;
    @Autowired
    public  CostumesController(CustomesRepository customesRepository){
        this.customesRepository = customesRepository;
    }


    @GetMapping("")
   public List<Customes> index (){
        return customesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customes getById(@PathVariable long id){
        return customesRepository.findById(id).get();}

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Customes customes){
     System.out.println("Custome created");
        return ResponseEntity.ok().body(customesRepository.save(customes));
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        if (customesRepository.findById(id).isPresent()) {
            customesRepository.deleteById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().body("no se pudo eliminar");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Customes customes, Long id) {
        return ResponseEntity.ok().body(customesRepository.save(customes));
    }
}
