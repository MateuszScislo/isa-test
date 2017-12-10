import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Maria", "Nowakowska", 14));
        this.patients.add(new Patient("Daria", "Polakowska", 15));
        this.patients.add(new Patient("Aria", "Nosowska", 16));
        this.patients.add(new Patient("Katarzyna", "Dworakowska", 17));
        this.patients.add(new Patient("Mariola", "Marmolada", 19));
        this.patients.add(new Patient("Katarzyna", "Zając", 17));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
