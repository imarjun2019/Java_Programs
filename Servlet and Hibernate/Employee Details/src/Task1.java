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


        System.out.println("\t\t\t\t\t\t\t\tThis Table represents the employee details.\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        Details emp = new Details(emp_no,basic,HRA,IT,emp_name,join_date,dept,dest_code,DA,d_code,Destination);
        emp.DisplayDetails();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t\t\t\t\tThis Table represents the dearness allowance.\n------------------------------------------------------------------------------------------------------------------------------------------------");
        emp.AllowanceDetails();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------\n\n");

        int salary[] = emp.Salary();
        String dest[] = emp.getDestination();

        String check = args[0];
        //System.out.println(check);

        if (check.equals("1001"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[0] + "\t" + emp_name[0] + "\t\t" + dept[0] + "\t\t" + dest[0] + "\t" + salary[0]);
        }
        else if (check.equals("1002"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[1] + "\t" + emp_name[1] + "\t\t" + dept[1] + "\t\t" + dest[1] + "\t" + salary[1]);
        }
        else if (check.equals("1003"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[2] + "\t" + emp_name[2] + "\t\t" + dept[2] + "\t\t" + dest[2] + "\t" + salary[2]);
        }
        else if (check.equals("1004"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[3] + "\t" + emp_name[3] + "\t\t" + dept[3] + "\t\t" + dest[3] + "\t" + salary[3]);
        }
        else if (check.equals("1005"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[4] + "\t" + emp_name[4] + "\t\t" + dept[4] + "\t\t" + dest[4] + "\t" + salary[4]);
        }
        else if (check.equals("1006"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[5] + "\t" + emp_name[5] + "\t\t" + dept[5] + "\t" + dest[5] + "\t" + salary[5]);
        }
        else if (check.equals("1007"))
        {
            System.out.println("Emp No \tEmp Name \tDepartment \tDestination \tSalary");
            System.out.println(emp_no[6] + "\t" + emp_name[6] + "\t\t" + dept[6] + "\t\t" + dest[6] + "\t" + salary[6]);
        }
        else
            System.out.println("There is no employee id with " + check);

        //System.out.println("Salary = " + Arrays.toString(salary));

    }
}

class EmployeeDetails
{
    public int emp_no[],basic[],HRA[],IT[],DA[];
    public String emp_name[],join_date[],dept[],Destination[];
    public char dest_code[],d_code[];

    public EmployeeDetails(int[] emp_no, int[] basic, int[] HRA, int[] IT, String[] emp_name, String[] join_date, String[] dept, char[] dest_code,int[] DA, char[]d_code,String[] Destination) {
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

class Details extends EmployeeDetails
{
    public Details(int[] emp_no, int[] basic, int[] HRA, int[] IT, String[] emp_name, String[] join_date, String[] dept, char[] dest_code, int[] DA, char[] d_code, String[] Destination) {
        super(emp_no, basic, HRA, IT, emp_name, join_date, dept, dest_code, DA, d_code, Destination);
    }

    int salary[] = new int[emp_name.length];
    String destination[] = new String[emp_name.length];
    public String[] getDestination()
    {
        for (int i= 0; i<emp_name.length; i++)
        {
            if (dest_code[i] == 'e')
                destination[i] = "Engineer";
            else if (dest_code[i] == 'c')
                destination[i] = "Consultant";
            else if (dest_code[i] == 'k')
                destination[i] = "Clerk";
            else if (dest_code[i] == 'r')
                destination[i] = "Receptionist";
            else destination[i] = "Manager";
        }
        return destination;
    }
    public int[] Salary()
    {

        for(int i=0 ; i<emp_name.length; i++)
        {
            if (dest_code[i] == 'e')
                salary[i] = (basic[i] + HRA[i] + 20000 - IT[i]);
            else if (dest_code[i] == 'c')
                salary[i] = (basic[i] + HRA[i] + 32000 - IT[i]);
            else if (dest_code[i] == 'k')
                salary[i] = (basic[i] + HRA[i] + 12000 - IT[i]);
            else if (dest_code[i] == 'r')
                salary[i] = (basic[i] + HRA[i] + 15000 - IT[i]);
            else
                salary[i] = (basic[i] + HRA[i] + 40000 - IT[i]);
        }
        return salary;
    }


}