using System;

namespace Bank
{
    public abstract class Account
    {
        private long _accountNumber;
        private string _customerName;
        protected double Balance = 500;
        protected virtual void SetDetails(string name, long number)
        {
            this._accountNumber = number;
            this._customerName = name;
        }
        protected virtual void Withdraw(double amount)
        {
            Balance -= amount;

        }
        protected virtual void Deposit(double amount)
        {
            Balance += amount;
        }
        public virtual void Display()
        {
            Console.WriteLine("Display account number and customer name!");

        }
        protected abstract double BankCharges();
            
    }
}
