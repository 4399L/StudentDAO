package demo;
import bean.Student;
import dao.StudentDAO;
import daoIMP.StudentDAOIMP;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connection.DataBaseConnection;

public class test {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOIMP();
        //1.findAll()
        ArrayList<Student> stu1 = dao.findAll();
        for(Student s:stu1) {
            System.out.println(s);}

        //2.findByID()
        //System.out.println(dao.findByID(1910300127));

        //3.insert()
//        Student s3 = new Student();
//        s3.setID(1910300133);
//        s3.setName("小王");
//        dao.insert(s3);
//        ArrayList<Student> stu2 = dao.findAll();
//        for (Student s : stu2) {
//            System.out.println(s);
//        }

        //4.delete()
//        dao.delete(1910300127);
//        ArrayList<Student> stu3 = dao.findAll();
//        for(Student s:stu3) {
//            System.out.println(s);}

        //5.update()
//        s3.setID(1910300130);
//        s3.setName("小李");
//        dao.update(s3);
//        ArrayList<Student> stu4 = dao.findAll();
//        for (Student s : stu4) {
//            System.out.println(s);
//        }
    }
}