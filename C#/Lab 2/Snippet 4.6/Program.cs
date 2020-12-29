using System;

namespace Snippet_4._6
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = "";
            int maths = 0;
            int english = 0;
            int science = 0;
            double total = 0;
            Console.Write("Enter student's name : ");
            name = Console.ReadLine();
            Console.Write("Enter English point : ");
            english = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Maths point : ");
            maths = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Science point : ");
            science = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("\n\n");
            if((english >= 0 && english <= 100) && (maths >=0 && maths <= 100) && (science >=0 && science <= 100))
            {
                total = (maths + english + science) / 3;
                if((english >= 75) && (maths >= 75) && (science) >= 75)
                {
                    Console.WriteLine("Student's name : " + name);
                    Console.WriteLine("Averge point : " + total);
                    Console.WriteLine("Scholarship : 1500$");
                }
                else if((english >= 60 && english < 75) && (maths >= 60 && maths < 75) && (science >= 60 && science < 75))
                {
                    Console.WriteLine("Student's name : " + name);
                    Console.WriteLine("Averge point : " + total);
                    Console.WriteLine("Scholarship : 1000$");
                }
                else if((english >= 35 && english < 60) && (maths >= 35 && maths < 60) && (science >= 35 && science < 60))
                {
                    Console.WriteLine("Student's name : " + name);
                    Console.WriteLine("Averge point : " + total);
                    Console.WriteLine("Scholarship : 0$");
                    Console.WriteLine("PASS!");
                }
                else
                {
                    Console.WriteLine("Student's name : " + name);
                    Console.WriteLine("Averge point : " + total);
                    Console.WriteLine("FAILED!");
                }
            }
            else
            {
                Console.WriteLine("Invalid points . Please try again!");
            }
        }
    }
}
