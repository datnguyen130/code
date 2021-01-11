using System;
using System.Collections.Generic;
using System.Text;

namespace Sippet_8._7
{
    class C : A, B
    {
        void A.Eat()
        {
            Console.WriteLine("This is A method");
        }

        void B.Eat()
        {
            Console.WriteLine("This is B method");
        }
        public void AEat()
        {
            A objA;
            objA = this;
            objA.Eat();
        }
        public void BEat()
        {
            B objB;
            objB = this;
            objB.Eat();
        }
        static void Main(string[] args)
        {
            C objC = new C();
            objC.AEat();
            objC.BEat();
        }
    }
}
