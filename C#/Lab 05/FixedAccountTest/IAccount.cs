using System;
using System.Collections.Generic;
using System.Text;

namespace Bank2
{
    interface IAccount
    {
        bool AcceptDetails();
        double CalculateInterest();
        double GetBalance();
        void Display();

    }
}
