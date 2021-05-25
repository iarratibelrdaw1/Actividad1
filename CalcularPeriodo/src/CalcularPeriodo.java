import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de amÃ©rica
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuÃ¡nto tiempo ha pasado
		calcularPeriodo("El descubrimiento de América", fecha);
		
		//Creamos la fecha del bombardeo de hiroshima y nagasaki
		LocalDate fecha2 = LocalDate.of(1945, Month.AUGUST, 6);	 
		// Mostramos cuÃ¡nto tiempo ha pasado
		calcularPeriodo("El bombardeo de hiroshima y nagasaki", fecha2);
		
		//Creamos la fecha del atentado de las torres gemelas
		LocalDate fecha3 = LocalDate.of(2001, Month.SEPTEMBER, 11);	 
		// Mostramos cuÃ¡nto tiempo ha pasado
		calcularPeriodo("11S (Descubrimiento del ISIS)", fecha3);
		
		//Creamos la fecha del atentado de las torres gemelas
		LocalDate fecha4 = LocalDate.of(1789, Month.MAY, 5);	 
		// Mostramos cuÃ¡nto tiempo ha pasado
		calcularPeriodo("La revolución francesa", fecha4);

	}
	
	public static void calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // CÃ¡lculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
         
        System.out.println(texto);
    }
 
}
