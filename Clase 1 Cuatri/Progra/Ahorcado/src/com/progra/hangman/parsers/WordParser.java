package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;

public class WordParser implements Parser {


    String regex; // Cadena de texto que representa el patron de expresion regular
    final int ELEMENT_COUNT = 3; // Numero de elementos que debe contener la cadena de texto al hacer split

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {

        /*
        * Tokens es una cadena que contiene la informacion de una palabra.
        * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepcion InvalidWordException
        * La cadena debe tener la forma:
        * codigo,palabra,tipo
        * codigo: es un numero que identifica la palabra
        * palabra: es la palabra en si
        * tipo: es el tipo de palabra que es: LARGA, MEDIA o CORTA
        * Dependiendo del tipo crear la instancia de la clase Word correspondiente, que puede ser de la clase WordShort, WordMedium o WordLong
        * */

    }

    /*
     Parsea el Id de la palabra si ocurre un error lanza una excepcion InvalidIdException
    */
    private int idValidator(String id) throws InvalidIdException {
        int idInt;

        try{
            idInt = Integer.parseInt(id);
        }catch(Exception e){
            throw new InvalidIdException(e.getMessage());
        }

        return idInt;
    }

    /*
    * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepcion InvalidWordException
     */
    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}
