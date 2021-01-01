using System;

namespace Snippet_6._7
{
    class Calculate
    {
        public static void Add(int x1, int x2)
        {
            Console.WriteLine(x1 + x2);
        }
        public void Multi(int x1, int x2)
        {
            Console.WriteLine(x1 * x2);
        }
    }
    class StaticMethod
    {
        static void Main(string[] args)
        {
            Calculate.Add(10, 50);
            Calculate obj = new Calculate();
            obj.Multi(10, 20);
        }
    }
}
