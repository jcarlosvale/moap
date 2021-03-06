import static org.junit.Assert.*;

import org.junit.Test;

import arida.ufc.br.function.CostLinearFunction;


public class CostLinearFunctionTest {

	@Test
	public void generateFunctionTest() {
		CostLinearFunction function = new CostLinearFunction();
		function.generateFunction(1, 2, 3, 5);
		assertEquals(2.0, function.getCoeficienteAngular(), 0.00001);
		assertEquals(1.0, function.getCoeficienteLinear(), 0.00001);
	}
}
