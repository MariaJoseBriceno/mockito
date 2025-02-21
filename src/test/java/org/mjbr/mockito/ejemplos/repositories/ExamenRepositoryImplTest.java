package org.mjbr.mockito.ejemplos.repositories;

import org.junit.jupiter.api.Test;
import org.mjbr.mockito.ejemplos.models.Examen;
import org.mjbr.mockito.ejemplos.services.ExamenService;
import org.mjbr.mockito.ejemplos.services.ExamenServiceImpl;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExamenRepositoryImplTest {

    @Test
    void findExamenPorNombre() {
        ExamenRepository repository = mock(ExamenRepository.class);

        ExamenService service = new ExamenServiceImpl(repository);

        List<Examen> datos = Arrays.asList(
                new Examen(5L, "Matematicas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matematicas");

        assertTrue(examen.isPresent());
        assertEquals(5L, examen.get().getId());
        assertEquals("Matematicas", examen.get().getNombre());
    }


    @Test
    void findExamenPorNombreListaVacia() {
        ExamenRepository examenRepository = mock(ExamenRepository.class);
        ExamenService service = new ExamenServiceImpl(examenRepository);

        List<Examen> datos = Collections.emptyList();

        when(examenRepository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Historia");

        assertTrue(examen.isEmpty());





    }
}