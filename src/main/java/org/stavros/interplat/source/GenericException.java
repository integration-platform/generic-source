package org.stavros.interplat.source;

public class GenericException extends Exception {
	
	private Exception e;
	public Exception getException() {
		return this.e;
	}
	
	public GenericException(Exception e) {
		this.e = e;
	}

}
