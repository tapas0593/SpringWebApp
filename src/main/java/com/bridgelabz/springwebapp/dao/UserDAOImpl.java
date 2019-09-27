package com.bridgelabz.springwebapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bridgelabz.springwebapp.model.Login;
import com.bridgelabz.springwebapp.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into user values(?,?,?,?,?,?,?)";
		Object[] object = new Object[] { user.getUserName(),
				user.getPassword(),user.getFirstName(), user.getLastName(), user.getEmail(), user.getAddress(), user.getPhone() };
		jdbcTemplate.update(sql, object);
	}

	public User validateUser(Login login) {
		String sql = "select * from user where username='" + login.getUserName() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, (rs, rowNum) -> {
			User user = new User();
			user.setFirstName(rs.getString("firstname"));
			user.setLastName(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setUserName(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getLong("phone"));

			return user;
		});
		return (users.isEmpty() ? null : users.get(0));
	}
}

