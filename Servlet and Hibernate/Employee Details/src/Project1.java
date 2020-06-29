// class that contains employees details in array
class EmployeeDetails1{

    //array that contains Emp No
    int empNo[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

    //array that contains Emp Name
    String empName[] = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};

    //array that contains Department
    String department[] = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};

    //array that contains designation code
    char designationCode[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

    //array that contains Basic
    int basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};

    // array that contains HRA
    int hra[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};

    // array that contains IT
    int it[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

    int designation(char code){
        int DA = 0;
        switch(code){
            case 'e':
                System.out.println("Designation: Engineer");
                DA = 20000;
                break;
            case 'c':
                System.out.println("Designation: Consultant");
                DA = 32000;
                break;
            case 'k':
                System.out.println("Designation: Clerk");
                DA = 12000;
                break;
            case 'r':
                System.out.println("Designation: Receptionist");
                DA = 15000;
                break;
            case 'm':
                System.out.println("Designation: Manager");
                DA = 40000;
                break;
        }
        return DA;
    }

    int salary (int bs, int hs, int its, int das){
        int totalSalary = (bs + hs + das - its);
        return totalSalary;
    }

}

class Project1{
    public static void main(String args[]){

//System.out.println(args[0]);

//converting string to int
        int employeNo = Integer.parseInt(args[0]);
        int x;
        int i;

// creating obj
        EmployeeDetails1 b = new EmployeeDetails1();


        int id = 0;
        for( i=0; i<7; i++){
            id = b.empNo[i];
            if(employeNo == id){
                x = i;
                System.out.println("Emp No.: " + b.empNo[x]);
                System.out.println("Emp Name: " + b.empName[x]);
                System.out.println("Department: " + b.department[x]);
                char d = b.designationCode[x];
                int da = b.designation(d);


                int basicSalary = b.basic[x];
                int hraSalary = b.hra[x];
                int itSalary = b.it[x];

//System.out.println(itSalary);

                System.out.println("Salary: " + b.salary(basicSalary, hraSalary, itSalary, da));

            }
        }
        if (employeNo != id){
            System.out.println("There is no employe with empid: " + args[0]);
        }


    }
}