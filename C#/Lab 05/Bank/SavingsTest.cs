using System;
using System.Collections.Generic;
using System.Text;

namespace Bank
{
    class SavingsTest
    {
        static void Main(string[] args)
        {
            SavingsAccount objSavingsAccount = new SavingsAccount();
            if (objSavingsAccount.AcceptDetails())
            {
                objSavingsAccount.Display();
            }
            else
            {
                return;
            }
        }
    }
}
