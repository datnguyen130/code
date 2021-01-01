using System;

namespace Snippet_6._19
{
    class Rectangle
    {
        double length;
        double breadth;
        public Rectangle()
        {
            length = 13.5;
            breadth = 20.5;
        }
        public Rectangle(double length, double breadth)
        {
            this.length = length;
            this.breadth = breadth;
        }
        public double Area()
        {
            return length * breadth;
        }
        static void Main(string[] args)
        {
            Rectangle objRect1 = new Rectangle();
            Console.WriteLine(objRect1.Area());
            Rectangle objRect2 = new Rectangle(2.5, 6.9);
            Console.WriteLine(objRect2.Area());
        }
    }
}
