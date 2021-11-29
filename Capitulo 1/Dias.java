/**
 * ENUMERADOS Los enumerados son un conjunto de valores constantes para los que
 * no existe un tipo definido
 * 
 * Ejemplo 1.6
 */

public class Dias {
    public enum DiasSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        DiasSemana hoy = DiasSemana.VIERNES;
        DiasSemana ultimo = DiasSemana.DOMINGO;

        System.out.println("Hoy es: " + hoy);
        System.out.println("El último día de la semana es: " + ultimo);
    }
}