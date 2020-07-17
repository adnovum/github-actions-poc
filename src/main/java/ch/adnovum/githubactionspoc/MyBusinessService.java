package ch.adnovum.githubactionspoc;

public class MyBusinessService {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b + 1; // oops, a mistake
	}
}