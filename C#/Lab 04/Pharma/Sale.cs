using System;
using System.Collections.Generic;
using System.Text;

namespace Pharma
{
    class Sales
    {
        public string MedicineCode;
        public int QuantitySold;
        public int PlannedSale;
        public int ActualSale;
        public string Region;

        public Sales() { }
        public Sales(string Code, int quan, int planned, int actual, string region)
        {
            MedicineCode = Code;
            QuantitySold = quan;
            PlannedSale = planned;
            ActualSale = actual;
            Region = region;
        }
        public void Accept()
        {
            Console.Write("Enter Medicine Code : ");
            this.MedicineCode = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Quantity Sold : ");
            this.QuantitySold = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Planned Sales : ");
            this.PlannedSale = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Actual Sales : ");
            this.ActualSale = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Region : ");
            this.Region = Convert.ToString(Console.ReadLine());

        }
        public void Display()
        {
            Console.WriteLine("Sales Details : ");
            Console.WriteLine("Medicine Code : " + this.MedicineCode);
            Console.WriteLine("Quantity Sold : " + this.QuantitySold);
            Console.WriteLine("Planned Sales : " + this.PlannedSale);
            Console.WriteLine("Actual Sales : " + this.ActualSale);
            Console.WriteLine("Region : " + this.Region);
        }
        public void Display(string Code)
        {
            if (Code.Equals(this.MedicineCode))
            {
                Console.WriteLine("Planned Sales : " + this.PlannedSale);
                Console.WriteLine("Actual Sales : " + this.ActualSale);

            }
            else
            {
                Console.WriteLine("Invalid Medicine Code !!!");
            }
        }
    }
}
