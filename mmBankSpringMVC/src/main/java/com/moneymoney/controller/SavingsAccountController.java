package com.moneymoney.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.account.service.SavingsAccountService;


@Controller
public class SavingsAccountController {

	@Autowired
	SavingsAccountService savingsAccountService;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
	
//	@RequestMapping("/getAll")
//	public String createNewAccount(Model model) throws ClassNotFoundException, SQLException {
//		
//	List<SavingsAccount> account = savingsAccountService.getAllSavingsAccount();
//	model.addAttribute("account", account);
//		return "accountDetails";
//	}
//	
	
}
