using System;

namespace Snippet_4._3
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = 13;
            if(num < 0)
            {
                Console.WriteLine("The number is negative");
            }
            else if ((num % 2) == 0)
            {
                Console.WriteLine("The number is even");
            }
        }
    }
}
