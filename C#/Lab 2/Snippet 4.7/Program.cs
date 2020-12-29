using System;

namespace Snippet_4._7
{
    class Program
    {
        static void Main(string[] args)
        {
            string pattern = "dd/MM/yyyy";
            Console.WriteLine("Enter date of birth (dd/mm/yyyy) : ");
            DateTime DoB = DateTime.ParseExact(Console.ReadLine(),pattern,null);
            int age = (DateTime.Today.Subtract(DoB).Days) / 365;
            Console.WriteLine(age);
        }
    }
}
