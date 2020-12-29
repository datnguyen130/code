using System;

namespace Snippet_4._14
{
    class Program
    {
        static void Main(string[] args)
        {
            int investment;
            int returns;
            int expenses;
            int profit;
            int counter = 0;
            for(investment = 1000, returns = 0; returns < investment;)
            {
                Console.WriteLine("Enter the monthly expenditure");
                expenses = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the monthly profit");
                profit = Convert.ToInt32(Console.ReadLine());
                investment += expenses;
                returns += profit;
                counter++;
            }
            Console.WriteLine("number of month to break even : " + counter);
        }
    }
}
