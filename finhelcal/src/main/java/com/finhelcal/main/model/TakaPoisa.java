package com.finhelcal.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TakaPoisa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int balanceid;
	private int income;
	private int expenses;
	private int debts;
	private int assets;
	public int getBalanceid() {
		return balanceid;
	}
	public void setBalanceid(int balanceid) {
		this.balanceid = balanceid;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getExpenses() {
		return expenses;
	}
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	public int getDebts() {
		return debts;
	}
	public void setDebts(int debts) {
		this.debts = debts;
	}
	public int getAssets() {
		return assets;
	}
	public void setAssets(int assets) {
		this.assets = assets;
	}
	public TakaPoisa(int balanceid, int income, int expenses, int debts, int assets) {
		super();
		this.balanceid = balanceid;
		this.income = income;
		this.expenses = expenses;
		this.assets = assets;
		this.debts=debts;
	}
	public TakaPoisa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
