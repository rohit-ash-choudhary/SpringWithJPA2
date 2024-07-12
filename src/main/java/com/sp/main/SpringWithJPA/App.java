package com.sp.main.SpringWithJPA;








import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.dao.AccountDao;
import com.sp.entity.Account;
import com.sp.resources.SrpingConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	AccountDao accado=(AccountDao) context.getBean("adi");
    	
    	Account acc=new Account();
    	acc.setEmployee_id(1);
    	acc.setFirst_name("Rohit");
    	acc.setLast_name("Choudhary");
    	acc.setPincode(3434);
    	
    	accado.insertAccountdetail(acc);
    }
    
    
}
