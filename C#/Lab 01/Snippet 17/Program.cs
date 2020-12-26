using System;

namespace Snippet_17
{
    class Program
    {
        static void Main(string[] args)
        {
            int valueOne = 5;
            int valueTwo = 10;
            Console.WriteLine("Value = " + valueOne);
            valueOne += 4;
            Console.WriteLine("Value +=4 = " + valueOne);
            valueOne -= 8;
            Console.WriteLine("value -=8 = " + valueOne);
            Console.WriteLine("Value1 == Value2 : {0}", (valueOne == valueTwo));
        }
    }
}
