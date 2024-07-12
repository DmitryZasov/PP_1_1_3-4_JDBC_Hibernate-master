package jm.task.core.jdbc.dao;


import com.mysql.cj.jdbc.DatabaseMetaData;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//public class UserDaoJDBCImpl implements UserDao {
//    public UserDaoJDBCImpl() {
//
//    }
//
//    @Override
//    public void createUsersTable() {
//        try (Connection connection = Util.getConnect();Statement statement =connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users" +
//                    "(id INT AUTO_INCREMENT PRIMARY KEY, " +
//                    "name VARCHAR(60) NOT NULL, " +
//                    "lastName VARCHAR(60) NOT NULL, " +
//                    "age INT NOT NULL)");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//            }
//    }
//
//    @Override
//    public void dropUsersTable() {
//        try (Connection connection = Util.getConnect();PreparedStatement preparedStatement = connection.
//                prepareStatement("DROP TABLE IF EXISTS users")) {
//
//        preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void saveUser(String name, String lastName, byte age) {
//        try (Connection connection = Util.getConnect();PreparedStatement preparedStatement = connection.
//                prepareStatement("INSERT INTO users(name, lastName, age) VALUES (?,?,?)")) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void removeUserById(long id) {
//        try (Connection connection = Util.getConnect();PreparedStatement statement = connection
//                .prepareStatement("DELETE FROM users WHERE id = ?")) {
//            statement.setLong(1, id);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List<User> allUser = new ArrayList<>();
//
//        try (Connection connection = Util.getConnect();Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("SELECT id, name, lastName, age FROM users");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                allUser.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return allUser;
//    }
//
//    @Override
//    public void cleanUsersTable() {
//        try (Connection connection = Util.getConnect();Statement statement = connection.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}