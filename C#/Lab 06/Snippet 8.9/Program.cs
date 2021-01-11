using System;

namespace Snippet_8._9
{
    class Program : BClass
    {
        double AreaOfSphere;

        public override void Area()
        {
            base.Area();
            AreaOfSphere = Areas * 4;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
    }
}
