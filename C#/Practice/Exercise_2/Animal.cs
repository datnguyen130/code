using System;
using System.Collections.Generic;
using System.Text;

namespace Exercise_2
{
    class Animal
    {
        string name;
        double weight;

        public Animal() { }

        public Animal(string Name, double Weight)
        {
            name = Name;
            weight = Weight;
        }

        public void Show()
        {
            Console.WriteLine("Name : {0} , Weight : {1}", name, weight);
        }

        public void SetMe(string Name, double Weight)
        {
            this.name = Name;
            this.weight = Weight;
        }
    }
}
