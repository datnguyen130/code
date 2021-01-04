using System;
using System.Collections.Generic;
using System.Text;

namespace Inventory
{
   class Suppplier
    {
        private int supplierID;
        private string suppplierName;
        private string city;
        private string phoneNo;
        private string email;
        public void AcceptDetails()
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
        public void DisplayDetails()
        {

            Console.WriteLine("Supplier Details : " +
                "\n Supplier ID : " + supplierID + "" +
                "\n Supplier Name : " + suppplierName +
                "\n Supplier city : " + city +
                "\n Phone No : " + phoneNo +
                "\n Emails : " + email);
        }
    }
}
