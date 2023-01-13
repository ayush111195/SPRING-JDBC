package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.student;

public class App 
{
    public static void main( String[] args )
    {
            System.out.println( "program started........");
            //spring jdbc==>>jdbctemplate 
//          ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//          JdbcTemplate temp = (JdbcTemplate) con.getBean("jdbctemplate");
//          // insert query--->>>
//          String query="insert into student (id,name,city) values(?,?,?)";
//          //fire the query--->>
//          int result = temp.update(query,458,"arpit","lucknow");
//          System.out.println("number of record insertes"+result);
 
        
        //2nd method---->>>>
        
              ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
              StudentDao st=    (StudentDao) con.getBean("studentdao");
    
//            student s=new student();
//            s.setId(24);
//            s.setName("akash");
//            s.setCity("nakra");
//            int result=  st.insert(s);
//            System.out.println("student added"+result);
        
        //for update--->>>
//            student s1=new student();
//            s1.setId(24);
//            s1.setName("ankit");
//            s1.setCity("u.s.a.");
//            int result2 = st.change(s1);
//            System.out.println("student update"+s1);
    
        // for delete--->>
//            student s2=new student();
//            s2.setId(2435);
//            int result3 = st.dlt(s2);
//            System.out.println("studentdlt"+result3);
    
        //for single student dara----->>>
//            student result4= st.getstudent(24);
//            System.out.println(result4);
        
        //for all student data------->>>
              List<student> result5 = st.getAllStudent();
              for(student s:result5)
              {
            	System.out.println(s);
              }
}
}