import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainFormController {

    public TableView<EmployeeTM> tblEmployee;
    public TableColumn<EmployeeTM,Integer> colEmployeeId;
    public TableColumn<EmployeeTM,String> colEmployeeName;
    public TableColumn<EmployeeTM,String> colEmployeePosition;

    public TableColumn<EmployeeTM,Integer> colEmployeeSalary;
    public TableColumn<EmployeeTM, Button> colRemove;
    public TableColumn<EmployeeTM,String> colEmployeeCity;


    public void initialize(){
        colEmployeeId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colEmployeeName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmployeeCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colEmployeePosition.setCellValueFactory(new PropertyValueFactory<>("position"));
        colEmployeeSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colRemove.setCellValueFactory(new PropertyValueFactory<>("btn"));
        addData();
    }

    private void addData() {
        ObservableList<EmployeeTM> observableList= FXCollections.observableArrayList();

        for (Employee e:EmployeeDatabaseTable.dataset) {
            Button btn= new Button("Delete");
            observableList.add(new EmployeeTM(e.getId(),e.getName(),e.getCity(),e.getPosition(),e.getSalary(),btn));
        }
        tblEmployee.setItems(observableList);
        }

    }


