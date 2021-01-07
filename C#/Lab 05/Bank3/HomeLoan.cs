using System;
using System.Collections.Generic;
using System.Text;

namespace Bank3
{
    public class HomeLoan : Loan, IDetails
    {
        private string borrowerName;
        private string city;
        private double annualIncome;
        private double maxAmount;

        public void AcceptDetails()
        {
            Console.WriteLine("Housing loan details");
            Console.Write("Enter the borrower's name ");
            borrowerName = Console.ReadLine();
            Console.Write("Enter the city");
            city = Console.ReadLine();
        Income:
            Console.Write("Enter the annual income");
            annualIncome = Convert.ToDouble(Console.ReadLine());
            if(annualIncome <= 0)
            {
                Console.WriteLine("Invalid");
                goto Income;
            }
            LoanEligibility(annualIncome);
            Console.WriteLine("Maxinum loan amount available : " + maxAmount + "\n");
        Amount:
            Console.WriteLine("Enter the amount of loan you want : ");
            LoanAmount = Convert.ToInt32(Console.ReadLine());
            if(LoanAmount <= 5000)
            {
                Console.WriteLine("you cannot take a loan of less than 5000$");
                goto Amount;
            }
            if(LoanAmount >= maxAmount)
            {
                Console.WriteLine("Loan amount cannot be more than limit");
                goto Amount;
            }
        }

        public override void LoanEligibility(double value)
        {
            if(value <= 50000)
            {
                maxAmount = 0;
            }
            else
            {
                maxAmount = (value - 50000) * 4;
            }
        }
        double CalculateAmount()
        {
            return (LoanAmount * InterestAmount);
        }
        public override double CalculateInterest()
        {
            if((LoanAmount >= 5000) && (LoanAmount <= 25000))
            {
                InterestRate = 9.5F;
            }
            else if((LoanAmount > 25000) && (LoanAmount <= 250000))
            {
                InterestRate = 10;
            }
            else
            {
                InterestRate = 10.5F;
            }
            return ((LoanAmount * Duration * InterestRate) / 100);
        }
        public void DisplayDetails()
        {
            InterestAmount = CalculateInterest();
            Console.WriteLine("Printing all members....");
        }
        public override void SetValues()
        {
            base.SetValues();
            InterestRate = 15;
        }
    }
}
