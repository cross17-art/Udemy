package IC;

import java.util.Date;

public class Car_for_Me {
    private Vehicle vehicle;
    private String name;
    private int age;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public Car_for_Me(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getCar(){
       vehicle.getSpeed();
    }
    public void getInfoMe(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }


}
