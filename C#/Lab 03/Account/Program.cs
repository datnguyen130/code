using System;

namespace Account
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nameID = new int[3];
            int[] AcNo = new int[3];
            char[] Gender = new char[3];
            DateTime[] OpenDate = new DateTime[3];
            Double[] Deposit = new Double[3];

            for(int i=0; i<nameID.Length; i++)
            {
                Console.Write("Enter the ID of customer : ");
                nameID[i] = Convert.ToInt32(Console.ReadLine());
                Console.Write("Enter account number : ");
                AcNo[i] = Convert.ToInt32(Console.ReadLine());
                Console.Write("Enter account type [Fixed / Savings]: [F/S] ");
                Gender[i] = Convert.ToChar(Console.ReadLine());
                Console.Write("Enter the date of opening account [MM/DD/YYYY] :");
                OpenDate[i] = Convert.ToDateTime(Console.ReadLine());
                Console.Write("Enter the amount deposited : ");
                Deposit[i] = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine();
            }

            Console.WriteLine("Account Details : ");
            Console.WriteLine("ID \t\t A/C No.\t\t\t A/C Type \t\t\t Opening Date \t\t\t\t Deposit($)\t\t\t");
            for(int i =0; i <nameID.Length; i++)
            {
                Console.Write("{0} \t\t {1} \t\t\t {2} \t\t\t {3} \t\t\t\t {4} \t\t\t \n", nameID[i], AcNo[i], Gender[i], OpenDate[i], Deposit[i]);
            }
        }
    }
}
