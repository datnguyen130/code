using System;

namespace Snippet_6._14
{
    class Program
    {
        static int Quare(int num)
        {
            return num * num;
        }
        static float Quare(float num)
        {
            return num * num;
        }
        static void Main(string[] args)
        {
            Console.WriteLine(Quare(5) + " ," + Quare(2.5F));
        }
    }
}
