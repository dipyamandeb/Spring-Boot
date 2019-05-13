package com.blockchain.supplychain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blockchain.supplychain.pojo.Block;
import com.blockchain.supplychain.pojo.Transaction;
import com.blockchain.supplychain.pow.POWService;

@Service
public class CustodyService {
	@Autowired
	private POWService powService;

	private static List<Block> blockchainList = new ArrayList<>();

	public Block addBlock(List<Transaction> transactionList) {
		if (blockchainList.isEmpty()) {
			Block genesis = new Block(0, transactionList);
			blockchainList.add(genesis);
			return genesis;
		}

		Block newBlock = new Block(blockchainList.get(blockchainList.size() - 1).hashCode(), transactionList);
		blockchainList.add(newBlock);

		if (!powService.validate(blockchainList)) {
			System.out.println("Removing the invalid block");
			blockchainList.remove(blockchainList.size() - 1);
		}

		System.out.println("The block was added to the chain");
		return newBlock;
	}

	public Block addCheatBlock(List<Transaction> transactionList) {
		Block newCheatBlock = new Block(blockchainList.get(blockchainList.size() - 1).hashCode(), transactionList);
		int index = blockchainList.size()-1;
		blockchainList.remove(index);
		blockchainList.add(newCheatBlock);

		if (!powService.validate(blockchainList)) {
			System.out.println("The Block added is corrupted need to remove it.");
			blockchainList.remove(index);
			System.out.println("The new cheat block is removed from the block chain");
			return null;
		}
		return newCheatBlock;
	}

}
