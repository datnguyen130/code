using System;

namespace Snippet_10._19
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                float numOne = 3.14F;
                Object obj = numOne;
                int result = (int)obj;
                Console.WriteLine("Value of numOne = {0}", result);
            }
            catch(InvalidCastException objEx)
            {
                Console.WriteLine("Message : {0}", objEx.Message);
                Console.WriteLine("Error : {0}", objEx);
            }
            catch(Exception objEx)
            {
                Console.WriteLine("Error : {0}", objEx);
            }
        }
    }
}
