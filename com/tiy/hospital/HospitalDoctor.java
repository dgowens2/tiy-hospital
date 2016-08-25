package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */
public abstract class HospitalDoctor extends Person implements Doctor {
    private String college;

    public HospitalDoctor(String firstName, String lastName, String college) {
        super(firstName, lastName);
        this.college = college;

    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;

    }

//    public Diagnosis diagnose(Scanner userInput) throws Exception {
//        System.out.println("Let me have a look...");
//
//        Thread.sleep(1000);
//
//        int diagnosisChoice;
//        while (true) {
//
//            diagnosisChoice = Integer.valueOf(userInput.nextLine());
//            System.out.println("Does it it hurt when I press here?");
//
//            if (diagnosisChoice == 1) {
//                System.out.println("You have cancer and need surgery.");
//                surgeryChoice();
//            } else if (diagnosisChoice == 2) {
//                System.out.println("I can take care of this.");
//                treatment();
//            }
//        }
//    }

//    public void surgeryChoice() {
//        System.out.println("Do you want surgery?");
//    }
//
//    public void treatment() throws Exception {
//
//        System.out.println("Please take this medicine.");
//
//        Thread.sleep(2000);
//
//        System.out.println("Treatment successful!");
//
//    }



}
