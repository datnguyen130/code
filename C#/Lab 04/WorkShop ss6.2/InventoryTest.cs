using System;
using System.Collections.Generic;
using System.Text;

namespace Inventory
{
    class InventoryTest
    {
        static void Main(string[] args)
        {
            Supplier obj = new Supplier();
            obj.AcceptDetails();
            int id = 0;
            string name = "";
            Console.WriteLine("Enter the id of the supplier : ");
            id = Convert.ToInt32(Console.ReadLine());
            obj.DisplayDetails(id);
            Console.WriteLine("Enter the name od the supplier : ");
            name = Console.ReadLine();
            obj.DisplayDetails(name);


        }
    }
}
