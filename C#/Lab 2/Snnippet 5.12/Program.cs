using System;

namespace Snnippet_5._12
{
    class Program
    {
        static void Main(string[] args)
        {
            Array objArray = Array.CreateInstance(typeof(string), 5);
            objArray.SetValue("one", 0);
            objArray.SetValue("two", 1);
            objArray.SetValue("three", 2);
            objArray.SetValue("four", 3);
            objArray.SetValue("five", 4);
            for(int i=0; i <= objArray.GetUpperBound(0); i++)
            {
                Console.WriteLine(objArray.GetValue(i));
            }
        }
    }
}
