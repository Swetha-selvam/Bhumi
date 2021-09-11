/*Create a class named 'Member' having the following members: 
Data members 
1 - Name 
2 - Age 
3 - Phone number 
4 - Address 
5 – Salary 
Create a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both classes and print the same.*/

class Member{
  String name;
  int age;
  String number;
  String address;
  int salary;

  public void printSalary(){
    System.out.println(salary);
  }

}

class Employee extends Member{
  String specialization;
  
  
}

class Manager extends Member{
  String department;
  
  
}

class Main{
  public static void main(String[] args){
    Employee e = new Employee();
    e.name = "Anand";
    e.age = 23;
    e.number = "9865423144";
    e.address = "Salem";
    e.salary = 45000;
    e.specialization = "Trainee";
    e.printSalary();

    Manager m = new Manager();
    m.name = "Shiva";
    m.age = 24;
    m.number = "9868647391";
    m.address = "Chennai";
    m.salary = 80000;
    m.department = "Education";
    m.printSalary();
  }
}	
