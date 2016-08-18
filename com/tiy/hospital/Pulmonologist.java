package com.tiy.hospital;

/**
 * Created by DTG2 on 08/17/16.
 */

public class Pulmonologist extends HospitalDoctor implements Surgeon {

    public Pulmonologist (String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.BRAIN_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
