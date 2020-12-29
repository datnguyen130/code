using System;

namespace Snippet_4._8
{
    class Program
    {
        static void Main(string[] args)
        {
         int num = 1;
        Console.WriteLine("Even Number");
        while (num <= 11)
            {
                if((num % 2) == 0)
                {
                    Console.WriteLine(num);
                }
                num++;
            }
        }
    }
}
