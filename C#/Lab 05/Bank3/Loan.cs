using System;

namespace Bank3
{
    public abstract class Loan
    {
        protected double LoanAmount;
        protected double InterestAmount;
        protected float InterestRate;
        protected int Duration;
        public virtual void SetValues()
        {
        Duration:
            Console.Write("Enter the pay back period for the loan: ");
            Duration = Convert.ToInt32(Console.ReadLine());
            if (Duration <= 0)
            {
                Console.WriteLine("Invalid Duation");
                goto Duration;
            }
        }
        public abstract double CalculateInterest();
        public abstract void LoanEligibility(double value);
    }
    
}
