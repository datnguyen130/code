using System;

namespace Student
{
    class StudentDetails
    {
        string stuName = "Alexander";
        int stuId = 30;
        public StudentDetails()
        {
            Console.WriteLine("Student name : " + stuName);
            Console.WriteLine("Student ID " + stuId);
        }

    }
}
namespace Examination
{
    class ScoreReport
    {
        public string Subject = "Science";
        public int Marks = 60;
        static void Main(string[] args)
        {
            Student.StudentDetails objStudents = new Student.StudentDetails();
            ScoreReport objReport = new ScoreReport();
            Console.WriteLine("Subject : " + objReport.Subject);
            Console.WriteLine("Marks: " + objReport.Marks);
        }
    }
}
