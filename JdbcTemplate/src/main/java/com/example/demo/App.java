package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = context.getBean("accountService",AccountServiceImpl.class);
        Account account = context.getBean("account",Account.class);
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
	        System.out.println("1.Create account");
	        System.out.println("2.Get all accounts");
	        System.out.println("3.Find by account number");
	        System.out.println("4.Delete by account number");
	        System.out.println("5.Update balance");
	        System.out.println("6.Delete all");
	        System.out.println("7.Exit");
	        System.out.println("Enter choice");
	        choice = sc.nextInt();
	        switch(choice)
	        {
	         case 1:
	        	 String str[] = UUID.randomUUID().toString().split("-");
	        	 account.setAccountNumber(str[0]);
	        	 System.out.println("Enter account type");
	        	 String accountType = sc.next();
	        	 account.setAccountType(accountType);
	        	 account.setInitialBalance(100.50f);
	        	 service.createAccount(account);
	        	 System.out.println("created");
	        	 break;
	         case 2:
	        	 List<Account> account1 = service.displayAccount();
	        	 Iterator<Account> iter = account1.iterator();
	        	 while(iter.hasNext())
	        	 {
	        		 System.out.println(iter.next());
	        	 }
	        	 break;
	         case 3:
	        	 System.out.println("Enter account number");
	        	 String accountNumber = sc.next();
	        	 Account list = service.findByAccountNumber(accountNumber);
	        	 System.out.println(list);
	        	 break;
	         case 4:
	        	 System.out.println("Enter account number");
	        	 String accountNumber1 = sc.next();
	        	 service.deleteByAccountNumber(accountNumber1);
	        	 System.out.println("Deleted");
	        	 break;
	         case 5:
	        	 System.out.println("Enter account number");
	        	 String accountNumber3 = sc.next();
	        	 System.out.println("Enter balance");
	        	 float balance = sc.nextFloat();
	        	 service.updateBalance(accountNumber3, balance);
	        	 System.out.println("Updated");
	        	 break;
	         case 6:
	        	 service.deleteAll();
	        	 System.out.println("deleted all data");
	        	 break;
	         default:
	        	 System.exit(0);
	        }
        }while(choice!=7);
    }
}
