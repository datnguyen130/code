using System;

namespace Pharma
{
    class Medicine
    {
        public string MedicineCode;
        public string MedicineName;
        public string ManuName;
        public double Price;
        public int QuantityOnHand;
        public DateTime ManuDate;
        public DateTime ExpiryDate;
        public int BatchNumber;

        public Medicine() { }
        public Medicine(string MedicineCode, string MedicineName, string ManuName, double UnitPrice, int QuantityOnHand, DateTime ManuDate, DateTime ExpiryDate, int BatchNumber)
        {
            this.MedicineCode = MedicineCode;
            this.MedicineName = MedicineName;
            this.ManuName = ManuName;
            this.Price = UnitPrice;
            this.QuantityOnHand = QuantityOnHand;
            this.ManuDate = ManuDate;
            this.ExpiryDate = ExpiryDate;
            this.BatchNumber = BatchNumber;
        }
        public void Accept()
        {
            Console.Write("Enter Medicine Code : ");
            this.MedicineCode = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Medicine Name : ");
            this.MedicineName = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Manufacturer Name : ");
            this.ManuName = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Unit Price :");
            this.Price = Convert.ToDouble(Console.ReadLine());
            Console.Write("Enter Quantity on Hand : ");
            this.QuantityOnHand = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Manufactured Date [MM/DD/YYYY] : ");
            this.ManuDate = Convert.ToDateTime(Console.ReadLine());
            Console.Write("Enter Expiry Date [MM/DD/YYYY] : ");
            this.ExpiryDate = Convert.ToDateTime(Console.ReadLine());
            Console.Write("Enter the Batch Number : ");
            this.BatchNumber = Convert.ToInt32(Console.ReadLine());
        }
        public void PrintMedicine()
        {
            Console.WriteLine("Medicine Details : ");
            Console.WriteLine("Medicine Code : " + MedicineCode);
            Console.WriteLine("Medicine Name : " + MedicineName);
            Console.WriteLine("Manufacturer Name : " + ManuName);
            Console.WriteLine("Unit Price : " + Price);
            Console.WriteLine("Quantity on Hand : " + QuantityOnHand);
            Console.WriteLine("Manufactured Date [MM/DD/YYYY] : " + ManuDate);
            Console.WriteLine("Expiry Date [MM/DD/YYYY : " + ExpiryDate);
            Console.WriteLine("Batch Number : " + BatchNumber);

        }
        public void PrintMedicine(string Code)
        {
            if (Code.Equals(this.MedicineCode))
            {
                Console.WriteLine("The Medicine Code is \" " + Code + " \" has Quantity on Hand is : " + this.QuantityOnHand);

            }
            else
            {
                Console.WriteLine("Invalid Medicine Code!!!");
            }
        }
        public void PrintMedicine(string Code, string Name)
        {
            if((Code.Equals(this.MedicineCode)) && (Name.Equals(this.MedicineName)))
            {
                Console.WriteLine("The Medicine Code : " + Code);
                Console.WriteLine("The Medicine Name : " + Name);
                Console.WriteLine("HAS QUANTITY ON HAND : " + this.QuantityOnHand);
            }
            else
            {
                Console.WriteLine("Invalid Medicine Code or Name!!!");
            }
        }

        public void Increase()
        {
            if(this.QuantityOnHand == 0)
            {
                this.QuantityOnHand = 50;
                Console.WriteLine("Increase successed!!!");
            }
            else
            {
                Console.WriteLine("Quantity on Hand of this product is not zero!!!");
            }
        }
    }
}
