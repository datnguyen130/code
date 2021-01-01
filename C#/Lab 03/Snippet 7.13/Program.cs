using System;

namespace Snippet_7._13
{
    class Circle
    {
        protected const double PI = 3.14;
        protected double Radius = 14.9;
        public virtual double Area()
        {
            return PI * Radius * Radius;
        }

    }
    class Cone : Circle
    {
        protected double Side = 10.2;
        public override double Area()
        {
            return PI * Radius * Side;
        }
        static void Main(string[] args)
        {
            Circle objRunOne = new Circle();
            Console.WriteLine(objRunOne.Area());
            Circle objRunTwo = new Cone();
            Console.WriteLine(objRunTwo.Area());
        }
    }
}
