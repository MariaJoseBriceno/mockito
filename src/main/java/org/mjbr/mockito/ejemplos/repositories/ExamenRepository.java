package org.mjbr.mockito.ejemplos.repositories;

import org.mjbr.mockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {

    List<Examen> findAll();


}
