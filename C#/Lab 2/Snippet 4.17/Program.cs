using System;

namespace Snippet_4._17
{
    class Program
    {
        static void Main(string[] args)
        {
            int fact = 1;
            int num = 1;
            Console.WriteLine("Enter the number whose factorial you wish to calcu;ate :");
            num = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i <= num; fact *= i++) ;
            Console.WriteLine(fact);
        }
    }
}
