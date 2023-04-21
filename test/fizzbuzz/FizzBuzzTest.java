package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	FizzBuzz fb;
	
	@BeforeEach
	void setup() throws Exception{
		fb= new FizzBuzz();
	}
	
	
	@Test
	void test_fb1() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	
	//indiquer les regressions
	//on ne commit pas du code red
	// on ne teste pas les fonctions privees

}
