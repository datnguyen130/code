using System;

namespace Exercise_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Lion objLion = new Lion(200);

            Tiger objTiger = new Tiger(100);

            objTiger.Show();
            objLion.Show();
        }
    }
}
