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
public class Emploee extends Person {
    
    private double wage;

    public Emploee(String name, String surname, int birthyear, double wage) {
        super(name, surname, birthyear);
        this.wage = wage;
    }
    
    public Emploee(Person person, double wage) {
        super(person.getName(), person.getSurname(), person.getBirthYear());
        this.wage = wage;
    }
    
    public double getWage() {
        return wage;
    }
    
}
