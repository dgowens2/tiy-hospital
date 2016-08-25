package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by DTG2 on 08/24/16.
 */
public class InternalDoctor extends HospitalDoctor{

    public InternalDoctor(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        System.out.println("Let me have a look...");
        Scanner userInput = new Scanner(System.in);
        HospitalRunner myRunner = new HospitalRunner();

        int diagnosisChoice;
        System.out.println("Does it it hurt when I press here?");

        System.out.println("1. Yes");
        System.out.println("2. No");
        diagnosisChoice = Integer.valueOf(userInput.nextLine());

        if (diagnosisChoice == 1) {
            System.out.println("You have cancer and need surgery.");
            surgeryChoice(userInput);
        } else if (diagnosisChoice == 2) {
            System.out.println("I can take care of this.");
            treatment();
        } else {
            System.out.println("I didn't understand your response.\nWill you state it again?");
        }
        return null;
    }

    public void surgeryChoice(Scanner userInput) {
        HospitalRunner myRunner = new HospitalRunner();
        SurgicalOncologist drBlack = new SurgicalOncologist("Audrey", "Black", "Emory");

        int surgeryChoice;

        System.out.println("Do you want to have surgery?");

        System.out.println("1. Yes");
        System.out.println("2. No");
        surgeryChoice = Integer.valueOf(userInput.nextLine());

        if (surgeryChoice == 1) {
            System.out.println("Please see Dr. Black");
            drBlack.surgery();
        } else if (surgeryChoice == 2) {
            System.out.println("Surgery declined. Patient will leave against medical advice");
            myRunner.badEndProgram();
        } else {
            System.out.println("I didn't understand your response.\nWill you state it again?");
        }
    }

    public void treatment() {
        System.out.println("Please take this medicine.");

        System.out.println("Treatment successful!");
        HospitalRunner myRunner = new HospitalRunner();
        myRunner.goodEndProgram();
    }

}
