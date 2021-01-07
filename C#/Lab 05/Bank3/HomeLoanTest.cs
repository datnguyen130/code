using System;
using System.Collections.Generic;
using System.Text;

namespace Bank3
{
    class HomeLoanTest
    {
        static void Main(string[] args)
        {
            HomeLoan objHomeLoan = new HomeLoan();
            objHomeLoan.AcceptDetails();
            objHomeLoan.SetValues();
            objHomeLoan.DisplayDetails();
        }
    }
}
