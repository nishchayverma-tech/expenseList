package org.ncu.spring_jpa_msba.dao;

import java.util.List;

import org.ncu.spring_jpa_msba.entity.Expense;

public interface ExpenseDao {
	public void insertRecord(Expense exp);
	public List<Expense> fetchAllRecords();
	public Expense fetchById(int expId);
	public void updateRecord(Expense exp);
	public void deleteRecord(int expId);
}