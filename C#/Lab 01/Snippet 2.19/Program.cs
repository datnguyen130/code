using System;

namespace Snippet_2._19
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dt = DateTime.Now;
            Console.WriteLine("Short date and short time with seconds (G) : {0:G}", dt);
            Console.WriteLine("Month and dat (m) : {0:m}", dt);
            Console.WriteLine("Short time (t) : {0:t}", dt);
            Console.WriteLine("Short time with seconds(T) : {0:T}", dt);
            Console.WriteLine("year and month (y) : {0:y}", dt);
        }
    }
}
