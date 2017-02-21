package com.aswini;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String [] args){
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");
      
    SessionFactory factory=cfg.buildSessionFactory();  
      
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();  
          
    Employee employee=new Employee();  
    employee.setFirstName("Pari");  
    employee.setLastName("bb");  
    employee.setMobile(986524141);
      Employee e1=new Employee();
      e1.setId(6);
      Employee e2=(Employee) session.load(Employee.class,new Integer(2));
      e2.setMobile(544563593);
      
   // session.persist(employee); 
      //session.delete(e1);
      session.update(e2);
    t.commit();
    session.close();  
   // System.out.println("successfully Deleted");  
    //System.out.println("successfully saved");  
    System.out.println("successfully Updated");  

}	
}

