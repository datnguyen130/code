using System;
using static System.Console;
namespace Company
{
    class Expenditure
    {
        protected string[] expenditureType = { "Maintenance", "Salary Paid", "Miscellaneous" };
        protected double[] expenditureAmount = new double[3];
        protected double TotalExpenses = 0;
        internal virtual void AcceptDetails()
        {
            WriteLine("Enter the expenditure for the following heads : ");
            for(int i = 0; i < expenditureType.Length; i++)
            {
                Write(expenditureType[i] + " ; ");
                expenditureAmount[i] = Convert.ToDouble(ReadLine());
                TotalExpenses += expenditureAmount[i];
            }
        }
        internal virtual void DispalyDetails()
        {
            for(int i = 0; i < expenditureType.Length; i++)
            {
                WriteLine(expenditureType[i] + "\t\t\t" + expenditureAmount[i]);
            }
            WriteLine("Total expenditure : " + TotalExpenses);
        }
    }
}
