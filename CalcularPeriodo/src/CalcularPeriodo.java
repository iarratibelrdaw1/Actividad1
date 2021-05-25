import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de Am�rica", fecha);
		
		//Creamos la fecha del bombardeo de hiroshima y nagasaki
		LocalDate fecha2 = LocalDate.of(1945, Month.AUGUST, 6);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El bombardeo de hiroshima y nagasaki", fecha2);
		
		//Creamos la fecha del atentado de las torres gemelas
		LocalDate fecha3 = LocalDate.of(2001, Month.SEPTEMBER, 11);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("11S (Descubrimiento del ISIS)", fecha3);
		
		//Creamos la fecha del atentado de las torres gemelas
		LocalDate fecha4 = LocalDate.of(1789, Month.MAY, 5);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("La revoluci�n francesa", fecha4);

	}
	
	public static void calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurri� hace %d a�os, %d meses y %d d�as.", anyos, meses, dias);
         
        System.out.println(texto);
    }
 
}
