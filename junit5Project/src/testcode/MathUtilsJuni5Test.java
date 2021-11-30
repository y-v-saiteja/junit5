package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.MathUtils;

/* The @BeforeAll annotation denotes that the annotated method should be executed before
all @Test, @RepeatedTest, @ParameterizedTest, 
and @TestFactory methods in the current class. It is executed only once.
*/
class MathUtilsJuni5Test {
	
	private static List<Integer> vals;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		vals=List.of(2,1,-2,3,-1,0,-2);
	}

	@Test
	@DisplayName("testing sum of values")
	void testSum() {
		
		 var sum=MathUtils.sum(vals);
		 assertEquals(Integer.valueOf(1), sum);
	}

	@Test
	@DisplayName("should get positive  values")
	void testPositive() {
		var pValues=MathUtils.positive(vals);
		assertEquals(pValues, List.of(2,1,3));
	}

	@Test
	@DisplayName("should get negative  values")
	void testNegative() {
		var nValues=MathUtils.negative(vals);
		assertEquals(nValues, List.of(-2,-1,-2));
	}

}
