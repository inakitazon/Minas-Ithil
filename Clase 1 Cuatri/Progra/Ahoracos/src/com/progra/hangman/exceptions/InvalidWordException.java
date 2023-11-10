package com.progra.hangman.exceptions;

@SuppressWarnings("serial")
public class InvalidWordException extends Exception {
	
	public String string;
	
	public InvalidWordException(String mensaje) {
		this.string = mensaje;;
	
	}

}
