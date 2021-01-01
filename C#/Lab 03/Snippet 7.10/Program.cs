using System;

namespace Snippet_7._10
{
    class ITSystem
    {
       public virtual void Print()
        {
            Console.WriteLine("The sustem should be handled carefully");
        }
    }
    class Company : ITSystem
    {
        public sealed override void Print()
        {
            Console.WriteLine("The system information is confidential");
        }
    }
    //class sealedsystem : company
    //{

    //}
}
