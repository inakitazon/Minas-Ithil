import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class VeterinaryClinic {

    List<Appointment> appointments;
    List<Person> personas;
    List<Pet> mascotas;

    public VeterinaryClinic() {

        this.appointments = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.mascotas = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void listAppointments() {
        for (Appointment appointment : appointments) {
            // Date - Pet - Reason
            System.out.println(appointment.getDate() + " - " + appointment.getPet().getName() + " - " + appointment.getReason());
        }
    }
    public String muestraFechas() {
    	
    	ArrayList<Date> auxiliar = new ArrayList<>();
    	
    	//for each aqui, paara cada appointment coger la fecha y añadirla a la auxiliar(comprobar si existe), ordenar la lista despues 
    	
    }
}
