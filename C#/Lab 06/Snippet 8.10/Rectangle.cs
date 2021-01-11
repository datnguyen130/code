using System;

namespace Snippet_8._10
{
    class Rectangle : A 
    {
        float length;
        float breadth;

        public Rectangle(float one, float two)
        {
            length = one;
            breadth = two;
        }
        static void Main(string[] args)
        {
            Rectangle objRec = new Rectangle(10.2F, 20.3F);
            if(objRec is A)
            {
                Console.WriteLine("Area of rectangle : {0:F2}", objRec.Area());
            }
            else
            {
                Console.WriteLine("interface method not implemented");
            }
        }

        public double Area()
        {
            return length * breadth;
        }
    }
}
