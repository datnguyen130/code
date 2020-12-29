using System;

namespace Snippet_4._21
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
        display:
            Console.WriteLine("Hello");
            i++;
            if(i < 5)
            {
                goto display;
            }
        }
    }
}
