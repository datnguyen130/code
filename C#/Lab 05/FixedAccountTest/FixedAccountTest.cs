using System;

namespace Bank2
{
    class FixedAccountTest
    {
        static void Main(string[] args)
        {
            FixedAccount objFixed = new FixedAccount();
            Console.WriteLine("Fixed Account Details : ");
            char choice;
            do
            {
                if (!objFixed.AcceptDetails())
                {
                    return;
                }
                else
                {
                    objFixed.Display();
                }
                Console.WriteLine("\n Do you want to continue [Y | N] : ");
                choice = Convert.ToChar(Console.ReadLine());
                Console.WriteLine();
            }
            while ((choice == 'y') || (choice == 'Y'));
        }
    }
}
