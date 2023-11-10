/**
 * Menu de operaciones.
 * 
 */
public class Menu {
    
    /**
     * Opciones del menú.
     */
    String opciones[];
    
    /**
     * Número total de opciones.
     */
    int nOpciones;
    
    /**
     * Primera opción libre.
     */
    int opcionLibre;

    /**
        * Crea una menú de opciones con un número de opciones.
        * @param nO Número de opciones.
        */
    public Menu(int nO) {...}
    
    /**
     * Añade una opción al menú.
     * @param op Opción del menú.
     */
    public void addOpcion(String op) {...}
    
    /**
      * Obtiene sólo las opciones introducidas en el menú.
      * @return Opciones del menú.
      */
    public String[] getOpciones() {...}
}