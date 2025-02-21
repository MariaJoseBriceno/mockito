package org.mjbr.mockito.ejemplos.repositories;

import org.mjbr.mockito.ejemplos.models.Examen;

import java.util.List;

public interface PreguntaRepository {

    List<String> findPreguntasPorExamenId(Long id);
}
