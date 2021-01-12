using System;

namespace Snippet_10._22
{
    class Program
    {
        static void Evaluate(string arg)
        {
            var val = arg ?? throw new ArgumentException("Invalid argument");
            Console.WriteLine("Reached this point");
        }
        static void Main()
        {
            Evaluate("number");
            Evaluate(null);
        }
    }
}
