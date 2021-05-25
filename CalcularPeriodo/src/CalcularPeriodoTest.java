import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void testCalcularPeriodo() {
		LocalDate fecha = LocalDate.of(2021, Month.MAY, 19);	
		CalcularPeriodo.calcularPeriodo("Aa", fecha);
	}

}
