using System;

namespace Snippet_12._3
{
    public delegate double CalculateArea(double val);
    public delegate double CalculateVolume(double val);
    class Cube
    {
        static double Area(double val)
        {
            return 6 * (val * val);
        }
        static double Volume(double val)
        {
            return (val * val);
        }
        static void Main(string[] args)
        {
            CalculateArea objArea = new CalculateArea(Area);
            CalculateVolume objVolume = new CalculateVolume(Volume);
            Console.WriteLine(objArea(200.32));
            Console.WriteLine(objVolume(20.56));
        }
    }
}
