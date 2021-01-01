using System;

namespace Snippet_6._4
{
    class TestProgram
    {
        void Count (int boys, int girls)
        {
            Console.WriteLine(boys + girls);
        }
        static void Main(string[] args)
        {
            TestProgram obj = new TestProgram();
            obj.Count(16, 24);
        }
    }
}
