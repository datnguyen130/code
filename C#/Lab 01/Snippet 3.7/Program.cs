using System;

namespace Snippet_3._7
{
    class Program
    {
        static void Main(string[] args)
        {
            int valueOne = 10;
            int valueTwo = 2;
            int add = valueOne + valueTwo;
            int sub = valueOne - valueTwo;
            int mult = valueOne * valueTwo;
            int div = valueOne / valueTwo;
            Console.Write("Addition : {0}\n" +
                "Subtraction : {1}\n" +
                "Multiplication : {2}\n" +
                "Division : {3}", add, sub, mult, div);
        }
    }
}
