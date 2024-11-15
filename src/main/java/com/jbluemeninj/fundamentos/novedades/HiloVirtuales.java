package com.jbluemeninj.fundamentos.novedades;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HiloVirtuales {
    public static void main(String[] args) {
        // Crear un pool de hilos virtuales
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            // Simular múltiples solicitudes
            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> {
                    // Simular el procesamiento de una solicitud
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Solicitud procesada: " + Thread.currentThread().getName());
                });
            }

            // Esperar a que todas las tareas terminen
            executor.shutdown();
        }
    }
}
