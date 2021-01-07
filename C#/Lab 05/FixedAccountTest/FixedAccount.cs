using System;
using System.Collections.Generic;
using System.Text;

namespace Bank2
{
    class FixedAccount : IAccount
    {
        private string _accountHolder;
        private long _accountNumber;
        private float _interestRate;
        private int _numberOfYears;
        private double _interestEarned;
        private double _totalBanlace;
        private double _deposit;
        public bool AcceptDetails()
        {
            string input;
            Console.Write("Enter the name of the account holder : ");
            _accountHolder = Console.ReadLine();

        Number:
            Console.Write("Enter the account number : ");
            input = Console.ReadLine();
            _accountNumber = Convert.ToInt64(input);
            if(_accountNumber <= 0)
            {
                Console.WriteLine("Account number cannot be rezo or negative\n");
                goto Number;

            }
        Amount:
            Console.Write("Enter the deposit amount ($) :");
            _deposit = Convert.ToDouble(Console.ReadLine());
            if(_deposit <= 0)
            {
                Console.WriteLine("invalid amount");
                goto Amount;
            }
            Console.WriteLine("Choose your option (A (1year) | B (3 years) | C (5 years))");
            char choice = Convert.ToChar(Console.ReadLine());
            switch (choice)
            {
                case 'A':
                case 'a':
                    _numberOfYears = 1;
                    break;
                case 'B':
                case 'b':
                    _numberOfYears = 3;
                    break;
                case 'c':
                case 'C':
                    _numberOfYears = 5;
                    break;
                default:
                    Console.WriteLine("Invalid choice");
                    return false;

            }
            return true;

        }

        public double CalculateInterest()
        {
            if(_deposit <= 5000)
            {
                if(_numberOfYears == 1)
                {
                    _interestRate = 3.5F;
                }
                else if(_numberOfYears == 3)
                {
                    _interestRate = 4;
                }
                else
                {
                    _interestRate = 4.5F;
                }
            }else if((_deposit > 5000) && (_deposit <= 20000))
            {
                if(_numberOfYears == 1)
                {
                    _interestRate = 5;
                }
                else if (_numberOfYears == 3)
                {
                    _interestRate = 5.5F;
                }
                else
                {
                    _interestRate = 6;
                }
            }
            else
            {
                if (_numberOfYears == 1)
                {
                    _interestRate = 6.5F;
                }
                else if (_numberOfYears == 3)
                {
                    _interestRate = 7;
                }
                else
                {
                    _interestRate = 7.5F;
                }
            }
            return ((_deposit * _numberOfYears * _interestRate) / 100);
        }

        public void Display()
        {
            _totalBanlace = GetBalance();
            Console.WriteLine("here is display all elements of object")
        }

        public double GetBalance()
        {
            _interestEarned = CalculateInterest();
            return (_deposit + _interestEarned);
        }

    }
}
