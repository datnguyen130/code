using System;
using System.Collections.Generic;
using System.Text;

namespace Bank
{
    public class SavingsAccount : Account
    {
        private float _minBalance;
        private float _bankCharge;
        private bool Flag = true;
        public bool AcceptDetails()
        {
            string name;
            long number;
            double amount;
            Console.Write("Enter the customer name : ");
            name = Console.ReadLine();
        First:
            Console.Write("Enter the account number :");
            number = Convert.ToInt64(Console.ReadLine());
            if(number <= 0)
            {
                Console.WriteLine("Invalid account number ");
                goto First;
            }
            else
            {
                SetDetails(name, number);
            }
            Console.WriteLine("\nInitial balance available : " + Balance + "\n\n");
            Console.WriteLine("Select the type of transaction ");
            Console.WriteLine("1. Withdraw \n2.Deposit ");
            Console.WriteLine("SElect your choice : ");
            int choice = Convert.ToInt32(Console.ReadLine());
            switch (choice)
            {
                case 1:
                    Console.WriteLine("Minium balance to be matained : " + _minBalance + " $\n");
                    Console.Write("Enter the amount to be withdraw : ");
                    amount = Convert.ToDouble(Console.ReadLine());
                    Withdraw(amount);
                    break;
                case 2:
                    Console.Write("Enter the amount tobe deposeited : ");
                    amount = Convert.ToDouble(Console.ReadLine());
                    Deposit(amount);
                    break;
                default:
                    Console.WriteLine("Invalid Choice");
                    return false;
            }
            if (!Flag)
            {
                return false;
            }
            else
            {
                return true;

            }
        }
        protected override void SetDetails(string name, long number)
        {
            base.SetDetails(name, number);
            _minBalance = 500;
        }
        protected override double BankCharges()
        {
            if(Balance < _minBalance)
            {
                _bankCharge = 200;
                
            }
            return _bankCharge;
        }
        protected override void Withdraw(double amount)
        {
            if(amount <= Balance)
            {
                base.Withdraw(amount);

            }
            else
            {
                Console.WriteLine("you do not have sufficient balance in your amount");
                Flag = false;
                return;
            }
        }
    }
}
