using System;

namespace Snippet_12._8
{
    public delegate void Display(string msg);
    public class Parent
    {
        event Display Print;
        protected void InvokeMethod()
        {
            Print += new Display(PrintMessage);
            Print?.Invoke("Welcome to C#");
        }
        void PrintMessage(string msg)
        {
            Console.WriteLine(msg);
        }
    }
    class Child : Parent
    {
        static void Main(string[] args)
        {
            Child objChild = new Child();
            objChild.InvokeMethod();
        }
    }
}
