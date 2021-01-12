using System;

namespace Snippet_10._15
{
    class DivisionERRor
    {
        static void Main(string[] args)
        {
            int num = 122;
            int numTwo = 0;
            int result;
            try
            {
                result = num / numTwo;
            }
            catch(DivideByZeroException obj)
            {
                Console.WriteLine("Exception Caught : " + obj);
            }
        }
    }
}
