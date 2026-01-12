package com.nbicocchi.exercises.classes;

/**
 * ### Exercise: Model a `Drug` Class
 *
 * **Title**: Create a `Drug` Class for a Rehabilitation Program
 *
 * **Objective**: Practice defining classes, attributes, constructors, methods, and object-oriented principles to represent drugs in a system for monitoring substance abuse and rehabilitation.
 *
 * ---
 *
 * #### Instructions:
 *
 * 1. **Define a class named `Drug`** that models a drug used in a rehabilitation context.
 *
 * 2. **Add the following attributes** to the `Drug` class:
 *    - `name` (a `String`): the name of the drug (e.g., "Heroin", "Methamphetamine").
 *    - `type` (a `String`): the category of the drug (e.g., "Stimulant", "Depressant", "Opioid").
 *    - `addictionLevel` (an `int`): a value between 1 and 10 representing how addictive the drug is.
 *    - `legalStatus` (a `boolean`): `true` if the drug is legal, `false` otherwise.
 *    - `riskOfOverdose` (a `double`): a percentage (e.g., 75.5) indicating the likelihood of an overdose.
 *
 * 3. **Create the following constructors**:
 *    - A default constructor that sets default values for the attributes.
 *    - A parameterized constructor that accepts values for all attributes.
 *
 * 4. **Add the following methods**:
 *    - `isHighlyAddictive()`: Returns `true` if the `addictionLevel` is greater than or equal to 8, otherwise returns `false`.
 *    - `toString()`: Prints all the details of the drug, including its name, type, addiction level, legal status, and risk of overdose.
 *    - `rehabilitationSuggestion()`: Prints a suggestion based on the addiction level:
 *      - For addiction levels 1–4: "Moderate risk. Basic counseling recommended."
 *      - For addiction levels 5–7: "High risk. Rehabilitation program required."
 *      - For addiction levels 8–10: "Severe risk. Immediate intervention needed."
 *
 * 5. **Write a `main` method** to:
 *    - Create several `Drug` objects with different values.
 *    - Use the `displayInfo`, `isHighlyAddictive`, and `rehabilitationSuggestion` methods for each drug.
 *
 * ---
 *
 * #### Expected Output Example:
 *
 * ```plaintext
 * Name: Heroin
 * Type: Opioid
 * Addiction Level: 10
 * Legal Status: Illegal
 * Risk of Overdose: 90.5%
 *
 * Highly addictive: true
 * Rehabilitation Suggestion: Severe risk. Immediate intervention needed.
 *
 * Name: Marijuana
 * Type: Depressant
 * Addiction Level: 3
 * Legal Status: Legal
 * Risk of Overdose: 0.0%
 *
 * Highly addictive: false
 * Rehabilitation Suggestion: Moderate risk. Basic counseling recommended.
 * ```
 *
 * ---
 *
 * This exercise encourages students to think critically about how to model real-world problems with Java classes, introduces basic decision-making, and uses encapsulation and methods effectively.
 */
public class Drug {
    String name;
    String type;
    int addictionLevel;
    boolean legalStatus;
    double riskOfOverdose;

    public Drug() {
        this.name = "cannabis";
        this.type = "depressant";
        this.addictionLevel = 0;
        this.legalStatus = false;
        this.riskOfOverdose = 0;
    }

    public Drug(String name, String type, int addictionLevel, boolean legalStatus, double riskOfOverdose) {
        this.name = name;
        this.type = type;
        this.addictionLevel = addictionLevel;
        this.legalStatus = legalStatus;
        this.riskOfOverdose = riskOfOverdose;
    }

    public boolean isHighlyAddictive() {
        return addictionLevel > 8;
    }

    public void rehabilitationSuggestion() {
        if (addictionLevel < 5) {
            System.out.println("Moderate risk. Basic counseling recommended");
        } else if (addictionLevel < 8) {
            System.out.println("High risk. Rehabilitation program required.");
        } else {
            System.out.println("Severe risk. Immediate intervention needed.");
        }
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", addictionLevel=" + addictionLevel +
                ", legalStatus=" + legalStatus +
                ", riskOfOverdose=" + riskOfOverdose +
                '}';
    }

    public static void main(String[] args) {
        Drug d1 = new Drug();
        Drug d2 = new Drug("Cocaine", "stimulant", 9, false, 0.7);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.isHighlyAddictive());
        System.out.println(d2.isHighlyAddictive());
        d1.rehabilitationSuggestion();
        d2.rehabilitationSuggestion();
    }
}
