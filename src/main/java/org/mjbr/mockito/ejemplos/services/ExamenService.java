package org.mjbr.mockito.ejemplos.services;

import org.mjbr.mockito.ejemplos.models.Examen;

import java.util.Optional;

public interface ExamenService {

    Optional<Examen> findExamenPorNombre(String nombre);

}
