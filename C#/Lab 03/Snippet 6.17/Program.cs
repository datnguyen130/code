using System;

namespace Snippet_6._17
{
    class Employee
    {
        string empName;
        int empAge;
        string deptName;
        Employee(string name, int num)
        {
            empName = name;
            empAge = num;
            deptName = "Research & Development";
        }
        static void Main(string[] args)
        {
            Employee obj = new Employee("John", 10);
            Console.WriteLine(obj.deptName);
        }
    }
}
