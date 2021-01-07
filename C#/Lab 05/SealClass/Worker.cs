using System;
using System.Collections.Generic;
using System.Text;

namespace SealClass
{
    class Worker
    {
        private string _WorkerName;
        private int _WorkerID;
        private string _designation;
        private double _salary;
        private double _amount;
        private int _yearsOfService;
        public Appralsal objApp = new Appralsal();
        public bool InputDetails()
        {
            Console.Write("Enter the worker name : ");
            _WorkerName = Console.ReadLine();
            Console.Write("Enter the worker id : ");
            _WorkerID = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the designation [1-3] :");
            int value = Convert.ToInt32(Console.ReadLine());
            switch (value)
            {
                case 1:
                    _designation = "Manager";
                    _salary = 5000;
                    break; 
                case 2:
                    _designation = "Engineer";
                    _salary = 4000;
                    break;
                case 3:
                    _designation = "Technicaian";
                    _salary = 3000;
                    break;
                default:
                    Console.WriteLine("Invalid option selected ");
                    break;
            }
        Service:
            Console.WriteLine("Enter the year of service : ");
            _yearsOfService = Convert.ToInt32(Console.ReadLine());
            if(_yearsOfService < 0)
            {
                Console.WriteLine("year of service cannot be negative");
                goto Service;
            }
            return true;
        }
        public void DisplayDetaisl()
        {
            _amount = objApp.CalculateBonus(_designation, _yearsOfService, _salary);
           
        }
    }
}
