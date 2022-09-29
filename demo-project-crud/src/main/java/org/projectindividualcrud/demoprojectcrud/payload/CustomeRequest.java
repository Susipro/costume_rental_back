package org.projectindividualcrud.demoprojectcrud.payload;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/*DTO es una clase que se encarga de transportar datos de un sitio a otro, pasa los daos del postmapping de custome a custome del servicio*/
@Getter
@Setter
public class CustomeRequest {
    private Long id;
    private String name;
    private int age;
    /*sin el role*/
}
