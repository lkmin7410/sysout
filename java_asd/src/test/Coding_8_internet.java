package test;

import java.io.IOException;

public class Coding_8_internet {

	void internet() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("C:/Program Files (x86)/Internet Explorer/iexplore.exe");
		} catch (IOException ex) {

		}
	}

	public static void main(String[] args) {
	}
}
