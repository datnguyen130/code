using System;
using System.Collections.Generic;
using System.Text;
using IO = System.Console;
using Emp = Bank.Account.EmployeeDetails;
    class AliasExample
    {
    static void Main(string[] args)
    {
        Emp.Employees obj = new Emp.Employees();
        obj.Name = "Peter";
        IO.WriteLine("Employee Name : " + obj.Name);
    }
    }
