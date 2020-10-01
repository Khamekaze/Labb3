package kyh.labs.lab3;

class Patient {

    private String name;
    private String sickness;

    Patient(String name) {
        this.name = name;
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    void takeMedication(Medicine medicine) {
        if(medicine.getTreatmentName().equals(sickness)) {
            sickness = null;
        }
    }

    String getSickness() {
        return sickness;
    }

    String getName() {
        return name;
    }

    boolean isSick() {
        return sickness != null;
    }

}
