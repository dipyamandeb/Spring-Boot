package com.blockchain.supplychain.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blockchain.supplychain.pojo.Block;
import com.blockchain.supplychain.pojo.Transaction;
import com.blockchain.supplychain.service.CustodyService;

@RestController
@RequestMapping(value = "/custody")
public class CustodyController {
	@Autowired
	private CustodyService customerService;

	@RequestMapping(value = "/test")
	public String displayData() {
		return "Test Success";

	}

	@RequestMapping(value = "/addBlock", method = RequestMethod.POST)
	public int addCustody(@RequestBody List<Transaction> transactionList, HttpServletResponse response) {
		if (transactionList.isEmpty()) {
			return Response.SC_BAD_REQUEST;
		}
		Block result = customerService.addBlock(transactionList);
		if (result == null) {
			return Response.SC_NOT_ACCEPTABLE;
		}
		return Response.SC_ACCEPTED;

	}

	@RequestMapping(value = "/addCheatBlock", method = RequestMethod.POST)
	public int addCheatCustody(@RequestBody List<Transaction> transactionList, HttpServletResponse response) {
		if (transactionList.isEmpty()) {
			return Response.SC_BAD_REQUEST;
		}
		Block result = customerService.addCheatBlock(transactionList);
		if (result == null) {
			return Response.SC_NOT_ACCEPTABLE;
		}
		return Response.SC_ACCEPTED;

	}

}
