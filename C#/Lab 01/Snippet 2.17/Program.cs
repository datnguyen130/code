using System;

namespace Snippet_2._17
{
    class Program
    {
        static void Main(string[] args)
        {
            double loanAmount = 15590;
            float interest = 0.09F;
            double intersetAmount = 0;
            double totalAmount = 0;
            intersetAmount = loanAmount * interest;
            totalAmount = loanAmount + intersetAmount;
            Console.WriteLine("Loan amount : ${0:#,###.#0", loanAmount);
            Console.WriteLine("Interest rate : {0:0#%", interest);
            Console.WriteLine("total amount : ${0:#,###.#0}", totalAmount);
        }
    }
}
