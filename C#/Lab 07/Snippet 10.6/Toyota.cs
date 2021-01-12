using System;
using System.Collections.Generic;
using System.Text;

namespace Automotive
{
    class Toyota
    {
        static void Main(string[] args)
        {
            Category objCategory = new Category();
            SpareParts objSpare = new SpareParts();
            objCategory.Display();
            objSpare.Display();
        }
    }
}
