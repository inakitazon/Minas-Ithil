/**
 * Sistema de gestión de usuarios
 * 
 */
public class SistemaGestionUsuarios {
    
    /**
     * Número máximo de usuarios.
     */
    private int nUsuarios;
    
    /**
     * Primera posición libre.
     */
    private int primerLibre;

    /**
     * Usuarios del sistema.
     */
    private Usuario[] usuarios;
    
    /**
     * Menús asociados a los usuarios.
     * El usuarios[i] tiene asociado el menus[i].
     */
    private Menu[] menus;
    
    
    /**
     * Crea un sistema de gestión de usuarios limitado en número.
     * @param nU Número total de usuarios.
      */
    public SistemaGestionUsuarios(int nU) {...}
    
    /**
     * Añade un usuario al sistema y le asocia un menu de opciones.
     * @param u Usuario.
     * @param m Menú de opciones.
     */
    public void addUsuario(Usuario u, Menu m) {...}
    
    /**
     * Autentifica un usuario, y devuelve su menú si todo va bien, en caso 
     * contrario devuelve <i>null</i>.
     * 
     * Recorre la lista de usuarios, buscando un usuario con el mismo login que 
     * el suministrado, si lo encuentra comprueba que los passwords coinciden, 
     * devolviendo el menú que se encuentra en la misma posición.
     * 
     * @param login  Login de la autentificación. 
     * @param password Contraseña de la autentificación.
     * @return Menú asociado al usuario o <i>null</i>.
     */
    public Menu autentificaUsuario(String login, String password) {...}
}