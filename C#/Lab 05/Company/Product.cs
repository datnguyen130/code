using System;
using System.Collections.Generic;
using System.Text;

namespace Company
{
    class Product : Invoice
    {
        private string _productName;
        private int _quantity;
        private double _price;
        private double _totalValue;

        public override void SetDetails()
        {
            base.SetDetails();
            Console.Write("Enter the product name : ");
            _productName = Console.ReadLine();
        Sale:
            Console.Write("Enter the quantity sold : ");
            _quantity = Convert.ToInt32(Console.ReadLine());
            if(_quantity < 0)
            {
                goto Sale;
            }

            _totalValue = _quantity * _price;
        }
        public override void Display()
        {
            base.Display();
            Console.WriteLine("This is overide method in product class.");
        }
    }
}
