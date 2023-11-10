//import java.lang.reflect.GenericDeclaration;
//import java.lang.reflect.TypeVariable;
import java.util.Date;

public class Appointment {

    Person owner;
    Pet pet;
    Date date;
    String time;
    String reason;

    public Appointment(Person owner, Pet pet, Date date, String time, String reason) {
        this.owner = owner;
        this.pet = pet;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }


    public Date getDate() {
        return this.date;
    }

    public Pet getPet() {
        return this.pet;
    }

    public String getReason() {
        return this.reason;
    }
}
