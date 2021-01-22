using System;

namespace Exercise_1
{
    class Cylinder
    {
        double Radius;
        double Height;
        double BaseArea;
        double LateralArea;
        double TotalArea;
        double Volume;

        public void Process()
        {
            Console.WriteLine("Enter the dimenstions of the cylinder : ");
            Console.Write("Radius : ");
            Radius = Convert.ToDouble(Console.ReadLine());
            Console.Write("Height : ");
            Height = Convert.ToDouble(Console.ReadLine());

            BaseArea = Radius * Radius * Math.PI;
            LateralArea = 2 * Math.PI * Radius * Height;
            TotalArea = 2 * Math.PI * Radius * (Height + Radius);
            Volume = Math.PI * Radius * Radius * Height;

        }

        public void Result()
        {
            Console.WriteLine("Cylinder Characterist ics : ");
            Console.WriteLine("Radius : {0:F2} . Height : {1:F2}", Radius, Height);
            Console.WriteLine("Base : {0:F2} , Lateral : {1:F2}, Total : {2:F2}, Volume : {3:F2}", BaseArea, LateralArea, TotalArea, Volume); 
        }

        static void Main(string[] args)
        {
            Cylinder obj = new Cylinder();

            obj.Process();
            obj.Result();
        }

    }
}
