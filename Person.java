/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//alli library gia tin imerominia
// import.java.time.Year;
//int currentYear = Year.now().getValue()

package saidisexercise11_27;

import java.time.Year;
import java.util.Calendar;

/**
 *
 * @author giorgoskoz
 */
public class Person {
    
    private String name;
    private String surname;
    private int birthYear;

    public Person (String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }
    
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return age;
    }
    
}
