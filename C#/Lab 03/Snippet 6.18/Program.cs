using System;

namespace Snippet_6._18
{
    class Program
    {
        static int valueOne = 10;
        static int product;
        static Program()
        {
            Console.WriteLine("static contrctor initialized");
            product = valueOne * valueOne;
        }
        public static void Method()
        {
            Console.WriteLine("value of product = " + product);
        }
        static void Main(string[] args)
        {
            Program.Method();
        }
    }
}
