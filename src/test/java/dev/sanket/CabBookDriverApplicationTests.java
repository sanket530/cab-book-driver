package dev.sanket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CabBookDriverApplicationTests {

	@Test
	void contextLoads() {
		int actual = 1;
		int expected = 1;
		Assertions.assertEquals(actual,expected);
	}

}
