using System;

namespace IMT
{
    class MedicinesAvailable : Location
    {
        public string MedicineName;
        public int TotalNumberMedicine;
        public DateTime ExpiryMedicine;

        public void AcceptMedicines()
        {
            base.AcceptStatusTeam();
            Console.Write("Enter Medicine Name : ");
            this.MedicineName = Convert.ToString(Console.ReadLine());
            Console.Write("Enter Total number Medicines : ");
            this.TotalNumberMedicine = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Expiry date of medicine : ");
            this.ExpiryMedicine = Convert.ToDateTime(Console.ReadLine());

        }
    }
}
