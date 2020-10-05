package user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
//the fist task
public class User {

    private String firstname;
    private String lastname;
    private int age;
    private int day;
    private int month;
    private int year;
    private String email;
    private String status;
    private Date timestamp;

    public String getFisrtname() {
        return firstname;
    }

    public void setFirstname(String firstname) 
    {if(firstname.length()>=3){
        this.firstname = firstname;}
        else {System.out.println("The firstname is too short!");
                
                }
    }
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if(firstname.length()>=3){
        this.lastname = lastname;}
        else {System.out.println("The lastname is too short!");
                
                }
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Wrong age!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == "ACTIVE" || status == "INACTIVE" || status == "BLOCKED" || status == "NEW") {
            this.status = status;
        } else {
            System.out.println("Wrong status!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 01 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Wrong date");
        }

    }

    public int getMonth() {
        return day;
    }

    public void setMonth(int month) {
        if (month >= 01 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Wrong month");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2000) {
            this.year = year;
        } else {
            System.out.println("Wrong year");
        }
    }



    public User(String firstname, String lastname, int age, String email,
            String status, int day, int month, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;

        this.day = day;
        this.month = month;
        this.year = year;

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Firstname: " + firstname + "\n" + "Lastname: " + lastname + "\n" + "Age:=" + age + "\n" + "Email:= " + email + "\n" + "Status:= " + status + "\n" + "Register day:= " + day + "."+ month+"."+year;
    }
    static User user1 = new User("Catalin", "Baidauz", 21, "katalin19969@gmail.com", "ACTIVE", 12, 02, 2020);

    public static void main(String[] args) {

        System.out.println(user1);
    }

}

