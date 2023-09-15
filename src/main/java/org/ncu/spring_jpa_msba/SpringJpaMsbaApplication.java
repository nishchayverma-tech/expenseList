package org.ncu.spring_jpa_msba;

import org.ncu.spring_jpa_msba.dao.ExpenseDao;
import org.ncu.spring_jpa_msba.entity.Expense;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaMsbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMsbaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ExpenseDao expDao) {
		return runner -> callExpense(expDao);
	}
	
	private void callExpense(ExpenseDao expDao) {


		Expense expObj = new Expense(1, "Milk",132, "12/12/22", "white", "a","b");
		expDao.insertRecord(expObj);
		Expense expObj1 = new Expense(2, "Bread",45, "12/12/22", "brown", "a","b");
		expDao.insertRecord(expObj1);
		System.out.println("Expense record inserted successfully!!!");


		

		System.out.println(expDao.fetchById(2));
		System.out.println("Expense record found successfully!!!");

		
		
		Expense expUpObj = new Expense(2, "Bread",45, "12/12/23", "brown", "x","y");
		expDao.updateRecord(expUpObj);
		System.out.println("Expense record updated successfully!!!");
		

		
		
		System.out.println("FetchAll operation initiated!!!");
		System.out.println(expDao.fetchAllRecords());
		System.out.println("Expense records Displayed successfully!!!");
		


		expDao.deleteRecord(2);
		System.out.println("Expense record Deleted successfully!!!");
		


		System.out.println(expDao.fetchAllRecords());
		System.out.println("Expense records Displayed successfully!!!");
		
		
	}
}
