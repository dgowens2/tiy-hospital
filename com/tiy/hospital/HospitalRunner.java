package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */

public class HospitalRunner {

    public static void main(String[] args) {
        Hospital myHospital = new Hospital();
        System.out.println("Welcome to " + myHospital.getHospitalName());
//        Diagnosis myDiagnosis = new Diagnosis(int);
        Scanner myScanner = new Scanner(System.in);

        HospitalDoctor firstHs = new HospitalDoctor("Donald", "Gowens", "FAMU");
//            public Diagnosis diagnose()
//                return null;

        Patient firstPatient = new Patient("David", "Polk");
//        System.out.println("Patient Name: " + firstPatient.getFirstName() + " " + firstPatient.getLastName());
//
//        HospitalDoctor firstDoc = new SurgicalOncologist("James", "Glavin", "MIT");
//        System.out.println("Doctor's Name: " + firstDoc.getFirstName() + " " + firstDoc.getLastName());

//        if (firstDoc instanceof SurgicalOncologist) {
//            boolean success = ((SurgicalOncologist)firstDoc).operate(firstPatient);
//            if (success) {
//                System.out.println("Successful operation!");
//            } else {
//                System.out.println("Operation failed!!!");
//            }
//        }
        System.out.println("What are your symptoms?");
        System.out.println("1. Short of Breath");
        System.out.println("2. Migraine");
        System.out.println("3. Persistent Cough");
        System.out.println("4. Sore Throat");
        System.out.println("5. Everything Hurts");

        int userChoice = 0;
        userChoice = Integer.valueOf(myScanner.nextLine());

        if (userChoice == 0) {
            break;
        } else if (userChoice == 1) {
            System.out.println(myDiagnosis);
        }
        firstPatient.isSick() = new Diagnosis();


        System.out.println("HospitalRunner.main() - done!");
    }




}


