import java.util.ArrayList;

public class EmployeeData {
    String fname,sname,email,workperiod,phonenumber,salary;

    public EmployeeData(String fname, String sname, String email, String workperiod, String phonenumber, String salary) {
        this.fname = fname;
        this.sname = sname;
        this.email = email;
        this.workperiod = workperiod;
        this.phonenumber = phonenumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", workperiod='" + workperiod + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<EmployeeData> EmployeeData;
        EmployeeData=new ArrayList<>();

        EmployeeData emp1=new EmployeeData("Brenda","Mugure","brendawanjiru72@gmail.com","2.5 years","0799023456","100000");
        EmployeeData emp2=new EmployeeData("Kerina","Auma","@aumagmail.com","1 year","0799023556","95000");
        EmployeeData emp3=new EmployeeData("Lilian","Waweru","lwaweru@gmail.com","3 years","0799023458","50000");
        EmployeeData emp4=new EmployeeData("Sherrone","Karanja","skaranja@gmail.com","9 months","0799023356","67000");
        EmployeeData emp5=new EmployeeData("Jacklyne","Wamaitha","itha@gmail.com","1.5 years","0799021256","230000");
        EmployeeData emp6=new EmployeeData("Sharon","Mutuma","mutuma@gmail.com","1 years 8 months","0799028956","840000");
        EmployeeData emp7=new EmployeeData("Vincent","Njeru","vnjeru@gmail.com.com","4 years","0799024556","70000");
        EmployeeData emp8=new EmployeeData("Josephat","Maina","jmaina@gmail.com","5 years","0756023456","40000");
        EmployeeData emp9=new EmployeeData("Eric","Maina","emaina@gmail.com","10 months","0706023456","60000");
        EmployeeData emp10=new EmployeeData("Godwin","Opuka","gopuka@gmail.com","2 yearz","0879023456","20000");

        EmployeeData.add(emp1);
        EmployeeData.add(emp2);
        EmployeeData.add(emp3);
        EmployeeData.add(emp4);
        EmployeeData.add(emp5);
        EmployeeData.add(emp6);
        EmployeeData.add(emp7);
        EmployeeData.add(emp8);
        EmployeeData.add(emp9);
        EmployeeData.add(emp10);

        System.out.println(EmployeeData.toString());
    }
}
