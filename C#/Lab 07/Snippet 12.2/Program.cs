using System;

namespace Snippet_12._2
{
    public delegate int Calculation(int numOne, int numTwo);
    class Program
    {
        static int Addition(int numOne, int numTwo)
        {
            return (numOne + numTwo);
        }
        static int Subtraction(int numOne, int numTwo)
        {
            return (numOne - numTwo);
        }
        static void Main(string[] args)
        {
            int valOne = 5;
            int valTwo = 23;
            Calculation objCal = new Calculation(Addition);
            Console.WriteLine(valOne + " + " + valTwo + " = " + objCal(valOne, valTwo));
            objCal = new Calculation(Subtraction);
            Console.WriteLine("Subtract : " + objCal(valOne, valTwo));
            Console.WriteLine(objCal.Method);
        }
    }
}
