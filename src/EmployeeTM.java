import javafx.scene.control.Button;

import java.awt.*;

public class EmployeeTM {
     private int id;
     private String name;
     private String city;
     private String position;
     private int salary;
     private Button btn;

    public EmployeeTM(int id, String name, String city, String position, int salary, Button btn) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.position = position;
        this.salary = salary;
        this.btn = btn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
