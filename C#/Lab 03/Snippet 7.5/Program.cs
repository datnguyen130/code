using System;

namespace Snippet_7._5
{
    class Employees
    {
        int empId = 1;
        string empName = "James Anderson";
        int age = 25;
        public void Display()
        {
            Console.WriteLine("Employee ID : " + empId);
            Console.WriteLine("Enployee Name : " + empName);
        }
        
    }
    class Department : Employees
    {
        int deptId = 501;
        string deptName = "Sales";
        int empId = 2;
        new void Display()
        {
            base.Display();
            Console.WriteLine("Department ID : " + deptId);
            Console.WriteLine("Department Name : " + deptName);
            Console.WriteLine("Department empID :" + empId);
        }
        static void Main(string[] args)
        {
            Department obj = new Department();
            obj.Display();
        }
    }

}
