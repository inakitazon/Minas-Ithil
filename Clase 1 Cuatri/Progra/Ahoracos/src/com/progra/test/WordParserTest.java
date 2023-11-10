package com.progra.test;

import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {

    @Test
    @DisplayName("nameParsedTest() should create a Word object with word 'abdomen'")
    void nameParsedTest() throws InvalidIdException {
        String tokens = "9,abdomen,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertEquals("abdomen", word.getWord());
    }

    @Test
    @DisplayName("instanceParsedTest() should create an instance of MediumWord")
    void instanceParsedTest() throws InvalidIdException {
        String tokens = "9,abdomen,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertInstanceOf(MediumWord.class, word);
    }


    @Test
    @DisplayName("sizeValidator() Exception message when size is invalid")
    void sizeValidatorTest() {
        InvalidWordException thrown = assertThrows(InvalidWordException.class, () -> {
            String tokens = "9,abdomen";
            WordParser wordParser = new WordParser(",");
            Word word = wordParser.parse(tokens);
        });

        assertEquals("Valores de la palabra faltantes", thrown.getMessage());
    }

}