import com.progra.hangman.UserInterface;

public class Main {
    public static void main(String[] args) {

        /*
         No se debera de modificar el codigo de esta clase
         */
        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();

    }
}