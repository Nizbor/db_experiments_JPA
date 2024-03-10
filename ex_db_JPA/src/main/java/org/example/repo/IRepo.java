package org.example.repo;
import java.sql.*;
import java.util.List;

public interface IRepo<T> {
    Integer Insert(T object) throws SQLException;
    void Delete(T object) throws SQLException;
    void Update(T object) throws SQLException;
    void executeRequest(String request) throws SQLException;


    List<T> getList() throws SQLException;
    Connection connectToDB() throws SQLException;
    Statement getStatement(Connection conn) throws SQLException;
}

