using System;

namespace Snippet_10._16
{
    class Student
    {
        string[] names = { "A", "B", "C" };
        static void Main(string[] args)
        {
            Student obj = new Student();
            try
            {
                obj.names[4] = "Michael";
            }
            catch(Exception objEx)
            {
                Console.WriteLine("ERROR : " + objEx);
            }
        }
    }
}
