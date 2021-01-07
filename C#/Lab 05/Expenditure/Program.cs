using System;
using System.Collections.Generic;
using System.Text;

namespace Company
{
    class Program
    {
        static void Main(string[] args)
        {
            Expenditure objExpend = new Expenditure();
            Revenue objReve = new Revenue();
            objExpend.AcceptDetails();
            objExpend.DispalyDetails();
            objReve.AcceptDetails();
            objReve.AcceptDetails();

        }
    }
}

