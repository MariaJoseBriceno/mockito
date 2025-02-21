package org.mjbr.mockito.ejemplos.repositories;

import org.mjbr.mockito.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryOtro implements  ExamenRepository{


    @Override
    public List<Examen> findAll() {
        try {
            System.out.println("ExamenRepositoryOtro");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return List.of();
    }
}
