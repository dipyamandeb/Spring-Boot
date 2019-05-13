package com.blockchain.supplychain.pojo;

public class Transaction {

	private String sourceName;
	private String destinationName;
	private Long item_id;
	private Long price;

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	public Transaction(){
		
	}
	public Transaction(String sourceName, String destinationName, Long item_id, Long price) {
		this.sourceName = sourceName;
		this.destinationName = destinationName;
		this.item_id = item_id;
		this.price = price;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Transaction that = (Transaction) o;

		if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null)
			return false;
		if (destinationName != null ? !destinationName.equals(that.destinationName) : that.destinationName != null)
			return false;
		return (item_id != null ? item_id.equals(that.item_id) : that.item_id == null)
				&& (price != null ? price.equals(that.price) : that.price == null);
	}

	@Override
	public int hashCode() {
		int result = sourceName != null ? sourceName.hashCode() : 0;
		result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
		result = 31 * result + (item_id != null ? item_id.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		return result;
	}
}