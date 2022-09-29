package org.projectindividualcrud.demoprojectcrud.repositories;

import org.projectindividualcrud.demoprojectcrud.models.Customes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomesRepository extends JpaRepository <Customes, Long> {


}
