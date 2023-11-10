package com.progra.hangman;

import com.progra.hangman.base.Word;

public class HangmanLogic {

    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(Word word) {
        this.word = word;
        this.word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }


    public void guessLetter(String letter) {

        /* Programa aqui la funcionalidad para adivinar
         si la letra ya fue adivinada, no pasa nada
        i: si la letra ha sido adivinada, agrega letra a la variable guessedLetters.
        si la palabra no contiene la letra adivinada, aumenta el numero de fallas
        i: aumentar el numero de fallas solo si la letra no se ha adivinado y la letra no esta en Word

        i: siempre agregue la letra ingresada guessedLetters (Para evitar contar como error si meten otra letra que no va),
        a menos que se haya adivinado antes de llamar a este metodo.
         */
    	
    	if(guessedLetters.contains(letter)) {
    		return;
    	}
    	
    	if(word.getWord().contains(letter)) {
    		guessedLetters += letter;
    	}
    	
    	if(word.getWord().contains(letter) == false && guessedLetters.contains(letter) == false) {
    		numberOfFaults++;
    		
    	}
    	
    	
    }

    public boolean isGameOver() {

        /* programa aqui la funcionalidad para verificar si el juego ha terminado
           si el numero de faltas es mayor que el numero maximo de faltas, el juego termina
           i: si el numero de fallas es mayor que el numero maximo de intentos, el juego termina.
         */
    	
    	if(numberOfFaults >= word.getMaxTries()) {
    		return true;
    	}
        return false;
    }

    public boolean isWon() {
        /* programa aqui la funcionalidad para comprobar si se gana el juego
         si se adivina la palabra, se gana el juego
         i: si la cantidad de letras sin los guiones es igual a la cantidad de letras de la palabra, se gana el juego.
         */
    	
    	String guessed = guessedLetters;
    	guessed.replace("_","");
    	
    	int adivinadas = guessed.length(); 
    
    	if(adivinadas == word.getWord().length()) {
    		
    		return true;
    	}
    	
    	return false;

    }

    public String getHangman() {
        String hangman = "";
        switch (numberOfFaults) {
            case 1:
                hangman = "\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 2:
                hangman = "\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 3:
                hangman = "\n_________" + "\n|                   |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 4:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 5:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|                   |" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 6:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 7:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 8:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
                break;
        }

        if (numberOfFaults >= word.getMaxTries()){
            hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
        }

        return hangman;

    }

    public String hiddenWord() {

        // programa aqui la funcionalidad para construir la palabra oculta
        // crea la palabra oculta iterando a traves de this.word letra por letra
        // si la letra en cuestion, de this.word, esta dentro de this.guessedLetters, ponla en la palabra oculta
        // si la letra en cuestion, de this.word, no esta entre las letras adivinadas, reemplazala con _ en la palabra oculta
        //i: repase cada letra en this.word y use guessedLetters.contains(letter) para ver si se ha adivinado la letra actual.
        //i: si es asi, agreguelo a hiddenWord. si no, agregue "_" a hiddenWord. luego pasar a la siguiente letra

        // return the hidden word at the end
    	
    	String hidden = "";
    	
    	String palabra = this.word.getWord();
    	
    	for(int i = 0; i < palabra.length(); i++) {
    		
    		String letra = String.valueOf(palabra.charAt(i));
    		
    		if(this.guessedLetters.contains(letra)) {
    			hidden += letra;
    			
    		}else {
    			hidden += "_";
    		}
    	}

        return hidden;
    }

}
