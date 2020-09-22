package kyh.labs.lab3;

class Patient {

    boolean isSick;
    String name;
    String sickness;

    Patient(String name) {
        this.name = name;
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
        if(sickness != null) {
            isSick = true;
        }
    }

    void takeMedication(Medicine medicine) {
        if(medicine.getTreatmentName().equals(sickness)) {
            isSick = false;
        }
    }

    String getSickness() {
        return sickness;
    }

    String getName() {
        return name;
    }

    boolean isSick() {
        return isSick;
    }

}
