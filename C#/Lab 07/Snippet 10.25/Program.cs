using System;

namespace Snippet_10._25
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] names = { "john", "james" };
            int numOne = 10;
            int result = 0;
            int index = 0;
            try
            {
                index = 3;
                names[index] = "Smiths";
                result = 130 / numOne;
            }
            catch(DivideByZeroException objDivide)
            {
                Console.WriteLine("Divide by 0 " + objDivide);
            }
            catch(IndexOutOfRangeException objIndex)
            {
                Console.WriteLine("Wrong number of arguments " + objIndex);
            }
            catch(Exception objException)
            {
                Console.WriteLine("ERROR : " + objException);
            }
            Console.WriteLine(result);
        }
    }
}
