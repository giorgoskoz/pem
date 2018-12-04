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

    private float bonuspercent;
    
    public Manager (String name, String surname, int birthyear, double wage, float bonuspercent) {
        super(name, surname, birthyear, wage);
        this.bonuspercent = bonuspercent;
    }
    
    public Manager (Emploee emploee, float bonuspercent) {
        super(emploee.getName(), emploee.getSurname(), emploee.getBirthYear(), emploee.getWage());
        this.bonuspercent = bonuspercent;
    }
    
    public Manager (Person person, double wage, float bonuspercent) {
        super(person.getName(), person.getSurname(), person.getBirthYear(), wage);
        this.bonuspercent = bonuspercent;
    }
    
    public float getBonuspercent() {
        return bonuspercent;
    }
    
}
