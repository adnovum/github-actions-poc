package ch.adnovum.githubactionspoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyBusinessServiceTest {

	@Test
	public void shouldDoStuff() {
		int sum = new MyBusinessService().add(10, 3);
		assertEquals(13, sum);
	}
}