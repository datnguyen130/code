using System;

namespace Snippet_2._15
{
    class Program
    {
        static void Main(string[] args)
        {
            string userName;
            int age;
            double salary;
            Console.Write("Enter your name : ");
            userName = Console.ReadLine();
            Console.Write("Enter the salary : ");
            salary = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Name : {0}, salary : {1}", userName, salary);
        }
    }
}
