using System;

namespace Snippet_6._13
{
    class Program
    {
        static void Depreciation(out int val)
        {
            val = 2000;
            int dep = val * 5 / 100;
            int amt = val - dep;

        }
        static void Main(string[] args)
        {
            int value;
            Depreciation(out value);
            Console.WriteLine(value);
        }
    }
}
