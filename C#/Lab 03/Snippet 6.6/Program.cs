using System;

namespace Snippet_6._6
{
    static class Product
    {
        static int productID;
        static double price; 
        static Product()
        {
            productID = 10;
            price = 156.32;
        }
        public static void display()
        {
            Console.WriteLine(productID + " " + price);
        }

    }
    class medicine
    {
        static void Main(string[] args)
        {
            Product.display();
        }
    }
}
