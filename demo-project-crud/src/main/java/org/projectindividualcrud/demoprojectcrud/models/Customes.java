package org.projectindividualcrud.demoprojectcrud.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Getter
@Setter

/*Tambien se puede utilizar el lombok para crear un constructor, debe haber un constructor que traiga todo y otro vacio, @AllArgsConstructor y @NoArgsConstructor, tambien existe @Builder*/

public class Customes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String role;
/*si utilizamos la dependencia de lombok no hay que generar los getter y los setter, se utiliza @getter y @setter*/

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}