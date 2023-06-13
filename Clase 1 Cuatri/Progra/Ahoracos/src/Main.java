import java.io.FileNotFoundException;

import com.progra.hangman.UserInterface;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InvalidWordException, InvalidIdException {

        /*
         No se debera de modificar el codigo de esta clase
         */
        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();

    }
}