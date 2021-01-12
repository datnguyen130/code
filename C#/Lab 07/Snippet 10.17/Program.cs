using System;

namespace Snippet_10._17
{
    class Program
    {
        static void Main(string[] args)
        {
            byte numOne = 200;
            byte numTwo = 5;

            byte result = 0;
            try
            {
                result = checked( (byte)(numOne * numTwo));
                Console.WriteLine("Result = {0}", result);
            }
            catch(OverflowException objEx)
            {
                Console.WriteLine("Message : {0}", objEx.Message);
                Console.WriteLine("Source : {0}", objEx.Source);
                Console.WriteLine("TargetSite : {0}", objEx.TargetSite);
                Console.WriteLine("StackTrace : {0}", objEx.StackTrace);


            }
            catch(Exception objEx)
            {
                Console.WriteLine("Error : {0}", objEx);
            }
        }
    }
}
