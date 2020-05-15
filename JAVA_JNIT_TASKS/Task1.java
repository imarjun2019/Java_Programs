public class Task1 {
    public static void main(String[] args) {

        int emp_no[] = {1001,1002,1003,1004,1005,1006,1007};
        String emp_name[] = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String join_date[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
        char dest_code[] = {'e','c','k','r','m','e','c'};
        String dept[] = {"R&D","PM","Acc","Front Desk","Engg","Manufacturing","PM"};
        int basic[] = {20000,30000,10000,12000,50000,23000,29000};
        int HRA[] = {8000,12000,8000,6000,20000,9000,12000};
        int IT[] = {3000,9000,1000,2000,20000,4400,10000};
        String Destination[] = {"Engineer","Consultant","Clerk","Receptionist","Manager"};
        int DA[] = {20000,32000,12000,15000,40000};
        char d_code[] = {'e','c','k','r','m'};

        //System.out.println("\t\t\t\t\t\t\t\tThis Table represents the employee details.\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        Salary emp = new Salary(emp_no,basic,HRA,IT,emp_name,join_date,dept,dest_code,DA,d_code,Destination);
        /*
        emp.DisplayDetails();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t\tThis Table represents the dearness allowance.\n------------------------------------------------------------------------------------------------------------------------------------------------");
        emp.AllowanceDetails();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------\n\n");
         */
        //System.out.println(emp.getDestination('z'));

        int check = Integer.parseInt(args[0]);
        int i, j=0;
        for (i=0; i<emp_no.length; i++){
            if (check != emp_no[i]) {
                j++;
                if (j>=emp_no.length)
                {
                    System.out.println("No ID Found");
                    break;
                }
                continue;
            }
            else
            {
                System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
                System.out.print(emp_no[i] + "\t" + emp_name[i] + "\t\t" + dept[i] + "\t\t" );
                char cr = emp.getDest_code()[i];
                int getdst = emp.getDestination(cr);
                int salary = emp.getSalary(basic[i],HRA[i],getdst,IT[i]);
                System.out.println("\t\t" + salary);
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class EmployeeDetails {
    private int emp_no[],basic[],HRA[],IT[],DA[];
    private String emp_name[],join_date[],dept[],Destination[];
    private char dest_code[],d_code[];

    public int[] getEmp_no() {
        return emp_no;
    }

    public int[] getBasic() {
        return basic;
    }

    public int[] getHRA() {
        return HRA;
    }

    public int[] getIT() {
        return IT;
    }

    public int[] getDA() {
        return DA;
    }

    public String[] getEmp_name() {
        return emp_name;
    }

    public String[] getJoin_date() {
        return join_date;
    }

    public String[] getDept() {
        return dept;
    }

    public String[] getDestination() {
        return Destination;
    }

    public char[] getDest_code() {
        return dest_code;
    }

    public char[] getD_code() {
        return d_code;
    }

    EmployeeDetails(int[] emp_no, int[] basic, int[] HRA, int[] IT, String[] emp_name, String[] join_date, String[] dept, char[] dest_code, int[] DA, char[]d_code, String[] Destination) {
        this.emp_no = emp_no;
        this.basic = basic;
        this.HRA = HRA;
        this.IT = IT;
        this.emp_name = emp_name;
        this.join_date = join_date;
        this.dept = dept;
        this.dest_code = dest_code;
        this.DA = DA;
        this.d_code = d_code;
        this.Destination = Destination;
    }

    public void DisplayDetails()
    {
        System.out.println("EmpNo\t\tEmpName\t\tJoin Date\t\tDestination Code\t\tBasic\t\tHRA\t\tIT\t\tDepartment");
        for (int i = 0; i<emp_name.length;i++)
        {
            //System.out.print(emp_no[i] + "\t\t" + emp_name[i] + "\t\t" + join_date[i] + "\t\t"
            //+ dest_code[i] + "\t\t\t\t\t\t" + basic[i] + "\t\t\t\t" + HRA[i] + "\t\t" + IT[i] + "\t" + dept[i] + "\n");

            System.out.print(emp_no[i]);
            System.out.print("\t\t" + emp_name[i]);
            System.out.print("\t\t" + join_date[i]);
            System.out.print("\t\t" + dest_code[i]);
            System.out.print("\t\t\t\t" + basic[i]);
            System.out.print("\t\t"+HRA[i]);
            System.out.print("\t\t" + IT[i]);
            System.out.print("\t\t" + dept[i]);
            System.out.println();
        }
    }
    public void AllowanceDetails()
    {
        System.out.println("Destination Code\t\tDA\t\tDestination");
        for (int i = 0; i<DA.length;i++)
        {
            System.out.print(d_code[i] + "\t\t\t\t" + DA[i] + "\t\t" + Destination[i]);
            System.out.println();
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Salary extends EmployeeDetails {
     Salary(int[] emp_no, int[] basic, int[] HRA, int[] IT, String[] emp_name, String[] join_date, String[] dept, char[] dest_code, int[] DA, char[] d_code, String[] Destination) {
        super(emp_no, basic, HRA, IT, emp_name, join_date, dept, dest_code, DA, d_code, Destination);
    }

    public int getDestination(char destCode)
    {

        int DA = 0;
        switch(destCode)
        {
            case 'e':
                System.out.print("Engineer");
                DA = 20000;
                break;
            case 'c':
                System.out.print("Consultant");
                DA = 32000;
                break;
            case 'k':
                System.out.print("Clerk");
                DA = 12000;
                break;
            case 'r':
                System.out.print("Receptionist");
                DA = 15000;
                break;
            case 'm':
                System.out.print("Manager");
                DA = 40000;
                break;
            default:
                System.out.println("No characters available");
        }
        return DA;
    }

    public int getSalary(int Basic, int HRA, int DA, int IT)
    {
        int salary;
        salary = Basic + HRA + DA - IT;
        return salary;
    }
}




