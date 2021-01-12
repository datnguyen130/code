using System;

namespace Snippet_10._21
{
    class Employee
    {
        static void ThrowException(string name)
        {
            if(name == null)
            {
                throw new ArgumentException();
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Throw Example");
            try
            {
                string name = null;
                ThrowException(name);
            }
            catch(ArgumentException objNull)
            {
                Console.WriteLine("Exception : " + objNull);
            }
        }
    }
}
