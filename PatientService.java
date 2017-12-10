import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Jan", "Kowalski", 11));
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
