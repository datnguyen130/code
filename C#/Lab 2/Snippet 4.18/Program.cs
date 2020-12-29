using System;

namespace Snippet_4._18
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] employeeNames = ["Maria", "Wilson", "Elton", "Garry"];
            Console.WriteLine("EmployeeNames");
            foreach(string names in employeeNames)
            {
                Console.WriteLine("{0}", names);
            }
        }
    }
}
