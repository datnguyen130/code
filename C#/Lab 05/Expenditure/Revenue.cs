using System;
using System.Collections.Generic;
using System.Text;

namespace Company
{
    class Revenue : Expenditure
    {
        private double _totalIncome;
        private double _balance;
        internal override void AcceptDetails()
        {
            Console.WriteLine("\n");
            base.AcceptDetails();
            Console.WriteLine("\nEnter the revenue annually ");
            _totalIncome = Convert.ToDouble(Console.ReadLine());

        }
        internal override void DispalyDetails()
        {
            base.DispalyDetails();
            Console.WriteLine("\nTotal Income \t\t\t" + _totalIncome);
            _balance = _totalIncome - TotalExpenses;
            if(_balance < 0)
            {
                Console.WriteLine("\nNet Loss : " + _balance + "\n");
            }
            else
            {
                Console.WriteLine("\nNet Profit : " + _balance + "\n");
            }
        }
    }
}
