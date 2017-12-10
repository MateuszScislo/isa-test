import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Marcin", "Leczniczny"));
        this.doctors.add(new Doctor("Jan", "Rzeźnik"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
