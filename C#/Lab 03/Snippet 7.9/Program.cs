using System;

namespace Snippet_7._9
{
    class Student
    {
        string stuName = "James";
        string address = "Cali";
        public virtual void PrintDetails()
        {
            Console.WriteLine("Student Name : {0} \n Student address : {1}", this.stuName, this.address);

        }
    }
    class Grade : Student
    {
        string classs = "four";
        float percent = 71.25F;
        public override void PrintDetails()
        {
            base.PrintDetails();
            Console.WriteLine("Class : {0} \n Percentage : {1}", this.classs, this.percent);
        }
        static void Main(string[] args)
        {
            Student objStudent = new Student();
        Grade objGrade = new Grade();
            objStudent.PrintDetails();
            objGrade.PrintDetails();
        }
    }
}
