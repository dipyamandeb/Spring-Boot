package com.blockchain.supplychain.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blockchain.supplychain.pojo.Transaction;
import com.blockchain.supplychain.service.CustodyService;

@RestController
@RequestMapping(value = "/custody", method = RequestMethod.GET)
public class CustodyController {
	@Autowired
	private CustodyService customerService;
	
	@RequestMapping(value = "/test")
	public String displayData() {
		return "Test Success";

	}
	
	@RequestMapping(value = "/addBlock",method = RequestMethod.POST)
	public Response  addCustody(@RequestBody Transaction transaction, @RequestBody(required = false) Boolean publish,
			HttpServletResponse response) {
		String result = customerService.addBlock(transaction);
		
		if (publish) {
			//publish the block chain in network
		}
		
		return null;

	}

	



}

