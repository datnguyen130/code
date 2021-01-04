using System;

namespace Student
{
    class Program
    {
        static void Main(string[] args)
        {
            //Student obj = new Student();
            //obj.Display(obj.ReadInformation());
            Student obj1 = new Student(101);
            Student obj2 = new Student(102, "dat");
            Console.WriteLine(obj2.ToString());
            Console.WriteLine(obj1.ToString());
        }
    }
    class Student
    {
        private int id = 0;
        public int Id
        {
            get { return id; }
            set { id = value; }
        }
        private string name = "";
        public string Name 
        {
            get { return name; }
            set { name = value; }
        }
        private DateTime dob;
        public DateTime DoB
        {
            get { return dob;}
            set { dob = value; }
        }

        public Student() { }

        public Student(int id)
        {
            Id = id;
        }
        public Student(int id, string name) : this(id)
        {
            Name = name;
        }

        public Student(int id, string name, DateTime dob) : this(id,name)
        {
            this.DoB = dob;
        }
        public override string ToString()
        {
            return "ID : " + id + " Name : " + name + " Date of Birth : " + dob;
        }
        public Student ReadInformation()
        {
            Console.Write("Enter student ID : ");
            int id = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter student Name : ");
            string name = Convert.ToString(Console.ReadLine());
            Console.Write("Enter student Date of Birth : ");
            DateTime dob = Convert.ToDateTime(Console.ReadLine());
            Student obj = new Student(id: id, name: name,dob:  dob);
            return obj;
        }
        public void Display(Student obj) => Console.WriteLine(obj.ToString());

        
    }
}
