using System;

namespace Inventory
{
    class Supplier
    {
        private int supplierID;
        private string suppplierName;
        private string city;
        private string phoneNo;
        private string email;

        internal void AcceptDetails()
        {
            Console.WriteLine("Enter the ID of supplier : ");
            supplierID = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the name of supplier : ");
            suppplierName = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter the name of city : ");
            city = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter phone No : ");
            phoneNo = Console.ReadLine();
            Console.WriteLine("Enter email address : ");
            email = Console.ReadLine();
        }

        internal void DisplayDetails(int supplierID)
        {
            Console.WriteLine("Supplier ID : " + supplierID);
        }
        internal void DisplayDetails(string supplierName)
        {
            Console.WriteLine("Supplier Name : " + supplierName);

        }
        internal void DisplayDetails(int supplierID, string supplierName)
        {
            Console.WriteLine("Supplier ID : " + supplierID);
            Console.WriteLine("Supplier Name : " + supplierName);

        }
    }

  
}
