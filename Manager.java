/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saidisexercise11_27;

import java.time.Year;

/**
 *
 * @author giorgoskoz
 */
public class Manager extends Emploee {

    public float getBonuspercent() {
        return bonuspercent;
    }

    public double getWage() {
        return wage;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Year getBirthYear() {
        return birthYear;
    }
    
    private float bonuspercent;
    
    public Manager (String name, String surname, Year birthyear, double wage, float bonuspercent) {
        super(name, surname, birthyear, wage);
        this.bonuspercent = bonuspercent;
    }
    
    public Manager (Emploee emploee, float bonuspercent) {
        super(emploee.name, emploee.surname, emploee.birthYear, emploee.wage);
        this.bonuspercent = bonuspercent;
    }
    
    public Manager (Person person, double wage, float bonuspercent) {
        super(person.name, person.surname, person.birthYear, wage);
        this.bonuspercent = bonuspercent;
    }
}
