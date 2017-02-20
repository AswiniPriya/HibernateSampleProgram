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
      
    session.persist(employee); 
      
    t.commit();
    session.close();  
      
    System.out.println("successfully saved");  
      
}	
}
