/**
 * Menu de operaciones.
 * 
 */
public class Menu {
    
    /**
     * Opciones del men�.
     */
    String opciones[];
    
    /**
     * N�mero total de opciones.
     */
    int nOpciones;
    
    /**
     * Primera opci�n libre.
     */
    int opcionLibre;

    /**
        * Crea una men� de opciones con un n�mero de opciones.
        * @param nO N�mero de opciones.
        */
    public Menu(int nO) {...}
    
    /**
     * A�ade una opci�n al men�.
     * @param op Opci�n del men�.
     */
    public void addOpcion(String op) {...}
    
    /**
      * Obtiene s�lo las opciones introducidas en el men�.
      * @return Opciones del men�.
      */
    public String[] getOpciones() {...}
}