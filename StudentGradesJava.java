/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author student
 */
public class StudentGradesJava {
    // Sets the variables for the student name and marks
    public String FirstName;
    public String LastName;
    public float mark1;
    public float mark2;
    public float mark3;
    public float mark4;
    
public StudentGradesJava(String FirstName, String LastName, float mark1, float mark2, float mark3, float mark4){
    // Sets the inputed name and marks to equal the variables 
    this.FirstName = FirstName;
    this.LastName = LastName;
    this. mark1 = mark1;
    this. mark2 = mark2;
    this. mark3 = mark3;
    this. mark4 = mark4;
    }
    // Gets the names and marks and then returns the variables
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public float getMark1(){
        return mark1;
    }
    public float getMark2(){
        return mark2;
    }
    public float getMark3(){
        return mark3;
    }
    public float getMark4(){
        return mark4;
    }
    // Adds the names and marks and then returns the variables 
    public String addFirstName(){
        return FirstName;
    }
    public String addLastName(){
        return LastName;
    }
    public float addMark1(){
        return mark1;
    }
    public float addMark2(){
        return mark2;
    }
    public float addMark3(){
        return mark3;
    }
    public float addMark4(){
        return mark4;
    }
    
    // Outputs a header for all of the inputs to keep it organized
    public String toString(){
        String OutputMessage = (FirstName+"\t"+LastName+"\t"+mark1+"\t"+mark2+"\t"+mark3+"\t"+mark4+"\t");
        return OutputMessage;
    }
    // Calculates the average between the marks and returns it
    public float getAverage(){
        float Average = ((mark1+mark2+mark3+mark4)/4);
        return Average;
    }
}
