package com.blockchain.supplychain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.blockchain.supplychain.pojo.Transaction;

@Service
public class CustodyService {
	@Value("${app.title}")
	private int MAX_SIZE;
	
	public String addBlock(Transaction transaction){
		
		return "Hello";
	}
}
