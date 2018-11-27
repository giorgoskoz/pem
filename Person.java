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
public class Person {
    
    private String name;
    private String surname;
    private Year birthYear;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Year getBirthYear() {
        return birthYear;
    }
    
    public Person (String name, String surname, Year birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
}
