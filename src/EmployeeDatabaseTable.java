import java.util.ArrayList;

public class EmployeeDatabaseTable {

    public static ArrayList<Employee> dataset= new ArrayList<>();


    static {
        dataset.add(new Employee(1,"Tharindu","Galle","SE",300000));
        dataset.add(new Employee(2,"Pasindu","Matara","ASE",300000));
        dataset.add(new Employee(3,"Dinindu","Kegalle","SSE",200000));
        dataset.add(new Employee(4,"Saman","Katharagama","ATL",500000));
        dataset.add(new Employee(5,"Tharaka","Colombo","TL",900000));
    }



}
