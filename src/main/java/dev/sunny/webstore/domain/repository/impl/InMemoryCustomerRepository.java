package dev.sunny.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import dev.sunny.webstore.domain.Customer;
import dev.sunny.webstore.domain.repository.CustomerRepository;

@Service
public class InMemoryCustomerRepository implements CustomerRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Customer> getAllCustomers() {
		Map<String, Object> params = new HashMap<>();
		return jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());
	}
	
	private static final class CustomerMapper implements RowMapper<Customer> {

		@Override
		public Customer mapRow(ResultSet rs, int rowCount) throws SQLException {
			Customer tempCustomer = new Customer();
			tempCustomer.setCustomerId(rs.getString("id"));
			tempCustomer.setName(rs.getString("name"));
			tempCustomer.setAddress(rs.getString("address"));
			tempCustomer.setNoOfOrdersMade(rs.getLong("no_of_orders"));
			return tempCustomer;
		}
		
	}
}
