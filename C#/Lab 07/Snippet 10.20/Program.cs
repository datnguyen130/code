using System;

namespace Snippet_10._20
{
    class Program
    {
        private string name;
        private int id;

        public Program()
        {
            name = "David";
            id = 101;
        }
        static void Main(string[] args)
        {
            Program obj1 = new Program();
            Program obj2 = obj1;
            obj1 = null;
            try
            {
                Console.WriteLine("Employee name : " + obj1.name);
                Console.WriteLine("Employee ID : " + obj1.id);
            }
            catch(NullReferenceException objEx)
            {
                Console.WriteLine("Error : " + objEx);
            }
            catch(Exception objEx)
            {
                Console.WriteLine("Error : " + objEx);
            }
        }
    }
}
