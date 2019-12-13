package ch.adnovum.githubactionspoc;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MyBusinessServiceTest {

	@Test
	public void shouldAdd() {
		int sum = new MyBusinessService().add(10, 3);
		assertEquals(13, sum);
	}

	@Test
	public void shouldFail() {
		Assert.fail("I'm a failure!");
	}
}