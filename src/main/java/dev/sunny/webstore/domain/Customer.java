package dev.sunny.webstore.domain;

import java.util.Objects;

public class Customer {
	private String customerId;
	private String name;
	private String address;
	private long noOfOrdersMade;	
	
	public Customer() {}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(long noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=").append(customerId).append(", name=").append(name).append(", address=")
				.append(address).append(", noOfOrdersMade=").append(noOfOrdersMade).append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, name, noOfOrdersMade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(name, other.name) && Objects.equals(noOfOrdersMade, other.noOfOrdersMade);
	}

}
