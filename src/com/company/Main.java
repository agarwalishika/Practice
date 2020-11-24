package com.company;

import java.util.Scanner;

public class Main {
    public static final String WELCOME_MESSAGE = "Hi! Welcome to the major decider. Answer \"Yes\" or \"No\" to " +
            "our questions.";
    public static final String ALREADY_KNOW = "Do you already know which major you want?";
    public static final String MATH = "Do you like math?";
    public static final String PEOPLE = "Do you like talking to people?";
    public static final String TEACHING = "Do you like teaching?";
    public static final String SCIENCES = "Do you like the sciences?";
    public static final String MONEY = "Do you think of ways to make money?";
    public static final String LANGUAGES = "Do you like languages?";
    public static final String ENGLISH = "Do you like English?";
    public static final String COMPUTERS = "Do you like using computers?";
    public static final String BUILDING = "Do you like building things?";
    public static final String GOODBYE_MESSAGE = "Thank you. Goodbye.";

    // ------------------------- DO NOT CHANGE ANYTHING ABOVE THIS -------------------------
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        System.out.println(ALREADY_KNOW);
        String choice = scaner.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            System.out.println(GOODBYE_MESSAGE);
        } else {
            System.out.println(MATH);
            choice = scaner.nextLine();

            if (choice.equalsIgnoreCase("Yes")) {
                System.out.println(COMPUTERS);
                choice = scaner.nextLine();

                if (choice.equalsIgnoreCase("Yes")) {
                    System.out.println("Computer Science");
                } else {
                    System.out.println(BUILDING);
                    choice = scaner.nextLine();

                    if (choice.equalsIgnoreCase("Yes")) {
                        System.out.println("Engineering");
                    } else {
                        System.out.println(SCIENCES);
                        choice = scaner.nextLine();

                        if (choice.equalsIgnoreCase("Yes")) {
                            System.out.println("Natural Sciences");
                        } else {
                            System.out.println("Math");
                        }
                    }
                }
            } else {
                System.out.println(PEOPLE);
                choice = scaner.nextLine();

                if (choice.equalsIgnoreCase("Yes")) {
                    System.out.println(TEACHING);
                    choice = scaner.nextLine();

                    if (choice.equalsIgnoreCase("Yes")) {
                        System.out.println("Education");
                    } else {
                        System.out.println(SCIENCES);
                        choice = scaner.nextLine();

                        if (choice.equalsIgnoreCase("Yes")) {
                            System.out.println("Medicine");
                        } else {
                            System.out.println(MONEY);
                            choice = scaner.nextLine();

                            if (choice.equalsIgnoreCase("Yes")) {
                                System.out.println("Business");
                            } else {
                                System.out.println("Psychology");
                            }
                        }
                    }
                } else {
                    System.out.println(LANGUAGES);
                    choice = scaner.nextLine();

                    if (choice.equalsIgnoreCase("Yes")) {
                        System.out.println(ENGLISH);
                        choice = scaner.nextLine();

                        if (choice.equalsIgnoreCase("Yes")) {
                            System.out.println("English");
                        } else {
                            System.out.println("Foreign Languages");
                        }
                    } else {
                        System.out.println("Art");
                    }
                }
            }
        }
    }
}
