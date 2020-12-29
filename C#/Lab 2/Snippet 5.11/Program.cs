using System;

namespace Snippet_5._11
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] studentName = new string[3] { "ashley", "joe", "mikel" };
            foreach(string studName in studentName)
            {
                Console.WriteLine(studName);
            }
        }
    }
}
