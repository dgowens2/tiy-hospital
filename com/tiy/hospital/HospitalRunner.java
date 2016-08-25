package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */

public class HospitalRunner {

    public static void main(String[] args) {
        String hospitalName = "Atlanta Hospital of Sacred Souls";
        System.out.println("Welcome to " + hospitalName + "\nLet's get some information.");
        Scanner userInput = new Scanner(System.in);
        patientInformation(userInput);
    }

    public static void patientInformation(Scanner userInput) {
        System.out.println("What is your first name?");

        Patient myPatient = new Patient("String", "String");

        myPatient.setFirstName(userInput.nextLine());

        System.out.println("What is your last name?");

        myPatient.setLastName(userInput.nextLine());

        System.out.println("Hi, " + myPatient.getFirstName() + " " + myPatient.getLastName() + ". Are you sick?");

        int patientSickChoice;
        System.out.println("1: Yes");
        System.out.println("2: No");

        patientSickChoice = Integer.valueOf(userInput.nextLine());

        if (patientSickChoice == 1) {
            symptomSelection(userInput);
        } else if (patientSickChoice == 2) {
            System.out.println("You don't need our help today. Thank you for coming.");
        } else {
            System.out.println("I didn't understand your response.\nWill you state it again?");
        }
    }

    public static void symptomSelection(Scanner userInput) {
        System.out.println("What hurts?");
        InternalDoctor drBrown = new InternalDoctor("Harvey", "Brown", "Meharry");
        Pulmonologist drWhite = new Pulmonologist("Dustin", "White", "Johns Hopkins");

        int patientPainChoice;
        System.out.println("1. Head");
        System.out.println("2. Stomach");
        System.out.println("3. Lungs");
        System.out.println("4. Throat");
        System.out.println("5. None of the above");

        patientPainChoice = Integer.valueOf(userInput.nextLine());

        if (patientPainChoice == 1) {
            System.out.println("Please see Dr. Brown");
            drBrown.diagnose();
        } else if (patientPainChoice == 2) {
            System.out.println("Please see Dr. Brown");
            drBrown.diagnose();
        } else if (patientPainChoice == 3) {
            System.out.println("Please see Dr. White");
            drWhite.diagnose();
        } else if (patientPainChoice == 4) {
            System.out.println("Please see Dr. White");
            drWhite.diagnose();
        } else if (patientPainChoice == 5) {
            System.out.println("Please see Dr. Brown");
            drBrown.diagnose();
        } else {
            System.out.println("I didn't understand your response.");
        }
    }

    public void goodEndProgram(){
        System.out.println("Thank you for visiting Atlanta Heart of Sacred Souls!");
    }

    public void badEndProgram(){
        System.out.println("We are sorry for this outcome.\nLife is tough sometimes.");
    }


//        HospitalDoctor firstHs = new HospitalDoctor("Donald", "Gowens", "FAMU");
////            public Diagnosis diagnose()
////                return null;
//
//        Patient firstPatient = new Patient("David", "Polk");
////        System.out.println("Patient Name: " + firstPatient.getFirstName() + " " + firstPatient.getLastName());
////
////        HospitalDoctor firstDoc = new SurgicalOncologist("James", "Glavin", "MIT");
////        System.out.println("Doctor's Name: " + firstDoc.getFirstName() + " " + firstDoc.getLastName());
//
////        if (firstDoc instanceof SurgicalOncologist) {
////            boolean success = ((SurgicalOncologist)firstDoc).operate(firstPatient);
////            if (success) {
////                System.out.println("Successful operation!");
////            } else {
////                System.out.println("Operation failed!!!");
////            }
////        }
//        System.out.println("What are your symptoms?");
//        System.out.println("1. Short of Breath");
//        System.out.println("2. Migraine");
//        System.out.println("3. Persistent Cough");
//        System.out.println("4. Sore Throat");
//        System.out.println("5. Everything Hurts");
//
//        int userChoice = 0;
//        userChoice = Integer.valueOf(myScanner.nextLine());
//
//        if (userChoice == 0) {
//            break;
//        } else if (userChoice == 1) {
//            System.out.println(myDiagnosis);
//        }
//        firstPatient.isSick() = new Diagnosis();
//
//
//        System.out.println("HospitalRunner.main() - done!");
}


