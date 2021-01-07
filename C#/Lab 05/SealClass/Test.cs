using System;
using System.Collections.Generic;
using System.Text;

namespace SealClass
{
    class Test
    {
        static void Main(string[] args)
        {
            Worker objWorker = new Worker();
            
            if (objWorker.InputDetails())
            {
                objWorker.DisplayDetaisl();
            }
        }
    }
}
