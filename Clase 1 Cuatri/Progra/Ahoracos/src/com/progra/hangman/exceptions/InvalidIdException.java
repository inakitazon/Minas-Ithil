package com.progra.hangman.exceptions;

@SuppressWarnings("serial")
public class InvalidIdException extends Exception {
	public String message;
	public InvalidIdException() {
		this.message = "Valores de la palabra faltantes";
	}
	public String getMessage() {
		return message;
	}
	
	

}
