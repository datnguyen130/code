using System;

namespace Snippet_5._4
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] count = new int[10];
            int counter = 0;
            for (int i = 0; i < 10; i++)
            {
                count[i] = counter++;
                Console.WriteLine("The count value is : " + count[i]);

            }
        }
    }
}
