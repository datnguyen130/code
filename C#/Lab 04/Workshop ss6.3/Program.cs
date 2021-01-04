using System;

namespace Inventory
{
    class Product
    {
        private int productID;
        private string productName;
        private float price;
        private int stock;
        public Product()
        {
            productID = 101;
            productName = "Refrigerator";
            price = 420.5F;
            stock = 30;
        }
        public Product(int id)
        {
            productID = id;
            productName = "Washing machine";
            price = 677.3F;
            stock = 25;
        }
        public Product(int id, string name, float price, int stock)
        {
            productID = id;
            productName = name;
            this.price = price;
            this.stock = stock;
        }
        public void DisplaDetails()
        {
            Console.WriteLine("Product Details : ");
            Console.WriteLine("Product ID : " + productID);
            Console.WriteLine("Product name : " + productName);
            Console.WriteLine("Product price : " + price);
            Console.WriteLine("Product stock : " + stock);
        }
    }
}
