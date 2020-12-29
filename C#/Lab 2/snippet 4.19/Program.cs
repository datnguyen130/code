using System;

namespace snippet_4._19
{
    class Program
    {
        static void Main(string[] args)
        {
            int numOne = 17;
            int numTwo = 2;
            while(numTwo < numOne)
            {
                if(numOne % numTwo == 0)
                {
                    Console.WriteLine("not a Prime number");
                    break;
                }
                numTwo++;
            }
            if (numTwo == numOne)
            {
                Console.WriteLine("Prime number");
            }
        }
    }
}
