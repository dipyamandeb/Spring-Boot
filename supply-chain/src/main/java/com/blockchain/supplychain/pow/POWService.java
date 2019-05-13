package com.blockchain.supplychain.pow;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blockchain.supplychain.pojo.Block;

@Service
public class POWService {

	 public boolean validate(List<Block> blockChain) {
	        boolean result = true;
	        Block lastBlock = null;
	        for(int i = blockChain.size() -1; i >= 0; i--) {
	            if(lastBlock == null) {
	                lastBlock = blockChain.get(i);
	            }
	            else {
	                Block current = blockChain.get(i);
	                if(lastBlock.getPreviousHash() != current.hashCode()) {
	                    result = false;
	                    break;
	                }
	                lastBlock = current;
	            }
	        }
	        return result;
	    }
}
