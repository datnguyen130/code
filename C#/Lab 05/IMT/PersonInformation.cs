using System;
using System.Collections.Generic;
using System.Text;

namespace IMT
{
    class PersonInformation
    {
        public string PersonName;
        public int Age;
        public string Adress;
        public DateTime DateOfBirth;
        public string HealthHistory;
        public virtual void AcceptInformation()
        {
            Console.Write("Enter Person Name : ");
            this.PersonName = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Age :");
            this.Age = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Address :");
            this.Adress = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Date of birth : ");
            this.DateOfBirth = Convert.ToDateTime(Console.ReadLine());
            Console.Write("Enter Health History : ");
            this.HealthHistory = Convert.ToString(Console.ReadLine());

        }
    }
}
