package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {

    public SurgicalOncologist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.BRAIN_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successful operation
    }

    public void surgery() {

        System.out.println("Please relax. This will all be over soon.");

        System.out.println("Surgery successful!");

        HospitalRunner myrunner = new HospitalRunner();

        myrunner.goodEndProgram();
    }
}
