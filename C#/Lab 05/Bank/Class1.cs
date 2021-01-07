using System;
using System.Collections.Generic;
using System.Text;

namespace Bank
{
    class Class1
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
