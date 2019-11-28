/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public final class App {

    //Constantes de clase
    public static final int NUM = 10;
    public static final int MIN = 1;
    public static final int MAX = 10;

    //Método principal
    public final void launchApp() {
        //Cabecera
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");

        //Salidas
        System.out.printf("Número ......: %d%n",
                NUM);
        System.out.println("---");
        System.out.printf("Mínimo ......: %d%n",
                MIN);
        System.out.printf("Máximo ......: %d%n",
                MAX);
        System.out.println("---");
        System.out.printf("Análisis ....: %s%n",
                ubicacion(analizarRango(NUM, MIN, MAX)));
    }

    public static final int analizarRango(double num, double min, double max) {
        //Variable a usar
        int rango;

        //Condicional
        if (num > max) {
            rango = 2; // 2 = //NUM > MAX//
        } else if (num < min) {
            rango = 1; // 1 = //NUM < MIN//
        } else {
            rango = 0; // 0 = //NUM >= MIN && NUM <= MAX//
        }

        //Return
        return rango;
    }

    public static final String ubicacion(int num) {
        //Variables
        String posicion;

        //Condicional
        switch (num) {
            case 2: // 2 = //NUM > MAX//
                posicion = "FUERA ( Arriba )";
                break;
            case 1: // 1 = //NUM < MIN//
                posicion = "FUERA ( Abajo )";
                break;
            default: // 0 = //NUM >= MIN && NUM <= MAX//
                posicion = "DENTRO";
                break;
        }
        
        //Return
        return posicion;
    }
}
