using System;

namespace Snippnet_6._15
{
    class Program
    {
        double length;
        double breadth;
        public double Area(double length, double breadth)
        {
            this.length = length;
            this.breadth = breadth;
            return length * breadth;
        }
        static void Main(string[] args)
        {
            Program obj = new Program();
            Console.WriteLine(obj.Area(10.5, 12.5));
        }
    }
}
