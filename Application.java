package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

public class Application {

    private String firstname;
    private String lastname;
    private int age;
    private int regDay;
    private int regMonth;
    private int regYear;
    private String email;
    private String initialStatus;
    private String finalStatus;
    private Date nowDays = new Date();

    public String getFisrtname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname.length() >= 3) {
            this.firstname = firstname;
        } else {
            System.out.println("The firstname is too short!");

        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (firstname.length() >= 3) {
            this.lastname = lastname;
        } else {
            System.out.println("The lastname is too short!");

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

    public String getInitialStatus() {
        return initialStatus;
    }

    public void setInitialStatus(String status) {
        if (status == "ACTIVE" || status == "INACTIVE" || status == "BLOCKED" || status == "NEW") {
            this.initialStatus = status;
        } else {
            System.out.println("Wrong status!");
        }
    }
    
    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String status) {
        if (status == "ACTIVE" || status == "INACTIVE" || status == "BLOCKED" || status == "NEW") {
            this.finalStatus = status;
        } else {
            System.out.println("Wrong status!");
        }
    }

    public int getRegDay() {
        return regDay;
    }

    public void setRegDay(int regDay) {
        if (regDay >= 01 && regDay <= 31) {
            this.regDay = regDay;
        } else {
            System.out.println("Wrong date");
        }

    }

    public int getRegMonth() {
        return regMonth;
    }

    public void setRegMonth(int regMonth) {
        if (regMonth >= 1 && regMonth <= 12) {
            this.regMonth = regMonth;
        } else {
            System.out.println("Wrong month");
        }

    }

    public int getRegYear() {
        return regYear;
    }

    public void setRegYear(int year) {
        if (year > 2000) {
            this.regYear = regYear;
        } else {
            System.out.println("Wrong year");
        }
    }

    public Application(String firstname, String lastname, int age, String email, String initialStatus, int regDay, int regMonth, int regYear ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.initialStatus = initialStatus;
        this.finalStatus = finalStatus;
        this.regDay = regDay;
        this.regMonth = regMonth;
        this.regYear = regYear;
        
        SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
        SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
        SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
        int nowD = Integer.parseInt(sdfDay.format(nowDays));
        int nowM = Integer.parseInt(sdfMonth.format(nowDays));
        int nowY = Integer.parseInt(sdfYear.format(nowDays));

        {if (initialStatus == "NEW"){
            if (nowD - regDay >= 1 ) {
                this.finalStatus = "ACTIVE";
            }
            else if (nowD-regDay<1&& nowM-regMonth>=1){
                this.finalStatus = "ACTIVE";
            }
            else if (nowD-regDay<1&& nowM-regMonth<1&& nowY-regYear>=1){
                this.finalStatus = "ACTIVE";
            }
           
        }
        if (initialStatus=="ACTIVE") {this.finalStatus= "ACTIVE";}
        if (initialStatus == "INACTIVE"){
            if (nowM-regMonth>=1){
                this.finalStatus = "BLOCKED";
            }
            else if (nowM-regMonth<1&& nowY-regYear>=1){
                this.finalStatus = "BLOCKED";
            }
         }

        }
    }
    @Override
    public String toString() {
        return "\nFirstname: " + firstname + "\n" + "Lastname: " + lastname + "\n" + "Age:= " + age + "\n" + "Email:= " + email + "\n" + "Status:= " + initialStatus +"=>"+finalStatus+ "\n" + "Register day:= " + regDay + "." + regMonth + "." + regYear + "\n";
    }
    static Application user1 = new Application("Catalin", "Baidauz", 21, "katalin19969@gmail.com", "ACTIVE", 12, 02, 2020);
    static Application user2 = new Application("John", "Bill", 16, "JohnBill78@gmail.com", "NEW", 7, 6, 2019);
    static Application user3 = new Application("Elvis", "Washington", 52, "ELWashington@gmail.com", "ACTIVE", 31, 11, 2018);
    static Application user4 = new Application("Bill", "Trump", 56, "TheTrump008@gmail.com", "INACTIVE", 21, 5, 2005);
    static Application user5 = new Application("Dan", "Bilzerian", 45, "BilzerianDan@gmail.com", "ACTIVE", 6, 8, 2020);
    static Application user6 = new Application("Evghenii", "Hodorojkov", 32, "EHO@gmail.com", "NEW", 4, 10, 2019);
    static Application user7 = new Application("Phillip", "Kirkorov", 45, "KirkoPhillip@gmail.com", "INACTIVE", 7, 6, 2019);
    static Application user8= new Application("Anna", "Karenina", 27, "abracadabra@gmail.com", "INACTIVE", 6, 9, 2020);

    public static void main(String[] args) {
        ArrayList<Application> users = new ArrayList<Application>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        System.out.println(users);
        //System.out.println(nowD);
    }

//    iterate through the list of users and change status to ACTIVE for NEW users
//whose timestamp when they were registered in the system is older than yesterday.
//You can extract this functionality into a separate method
    //write a method that will pick up INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED
}
