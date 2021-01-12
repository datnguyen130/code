using System;
using System.Collections.Generic;
using System.Text;

namespace Automotive
{
    public class Category
    {
        string category;
        public Category()
        {
            category = "Multi";
        }
        public void Display()
        {
            Console.WriteLine("Category " + category);
        }
    }
}
