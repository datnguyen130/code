using System;

namespace Snippet_6._3
{
    class Student
    {
        void printName(String firstName, string lastName)
        {
            Console.WriteLine("First Name = {0} , Last Name = {1} ", firstName, lastName);
        }
        static void Main(string[] args)
        {
            Student objStudent = new Student();
            objStudent.printName("Henry", "Parker");
           
        }
    }
}
