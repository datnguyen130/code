using System;
using System.Collections.Generic;
using System.Text;

namespace Pharma
{
    class Test
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Work with class Medicine first : ");
            Medicine objMedicine = new Medicine("Code001", "Vitamin C", "Vina Medicine", 100.25F,100,new DateTime(2021,01,01),new DateTime(2022,12,31),1102) ;
            objMedicine.PrintMedicine();
            Console.WriteLine();
            objMedicine.PrintMedicine("Code001");
            Console.WriteLine();
            objMedicine.PrintMedicine("Code002");
            Console.WriteLine();
            objMedicine.Accept();
            Console.WriteLine();
            objMedicine.PrintMedicine();
            Console.WriteLine();
            objMedicine.Increase();

        }
    }
}
