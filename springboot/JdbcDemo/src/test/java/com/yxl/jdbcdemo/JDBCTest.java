package com.yxl.jdbcdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCTest {

    /**
     * 编写JDBC程序, 查询数据
     */
    @ParameterizedTest
    @CsvSource({"daqiao,123456"})
    public void testJdbc(String _username, String _password) throws Exception {
        // 获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
        // 创建预编译的PreparedStatement对象
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
        // 设置参数
        pstmt.setString(1, _username); // 第一个问号对应的参数
        pstmt.setString(2, _password); // 第二个问号对应的参数
        // 执行查询
        ResultSet rs = pstmt.executeQuery();
        // 处理结果集
        while (rs.next()) {
            int id = rs.getInt("id");
            String uName = rs.getString("username");
            String pwd = rs.getString("password");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            System.out.println("ID: " + id + ", Username: " + uName + ", Password: " + pwd + ", Name: " + name + ", Age: " + age);
        }
        // 关闭资源
        rs.close();
        pstmt.close();
        conn.close();
    }

    @ParameterizedTest
    @CsvSource({"qqqq,123456,杨小龙,17"})
    public void testInsert(String newUsername, String newPassword, String newName, int newAge) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO user(username, password, name, age) VALUES (?, ?, ?, ?)");

        pstmt.setString(1, newUsername); // 设置用户名
        pstmt.setString(2, newPassword); // 设置密码
        pstmt.setString(3, newName); // 设置姓名
        pstmt.setInt(4, newAge); // 设置年龄

        int rowsAffected = pstmt.executeUpdate(); // 执行插入
        System.out.println(rowsAffected + " 行被插入。");

        pstmt.close();
        conn.close();
    }
    @ParameterizedTest
    @CsvSource({"2"})
    public void testDelete(int userId) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM user WHERE id = ?");

        pstmt.setInt(1, userId); // 设置要删除的用户ID

        int rowsAffected = pstmt.executeUpdate(); // 执行删除
        System.out.println(rowsAffected + " 行被删除。");

        pstmt.close();
        conn.close();
    }
    @ParameterizedTest
    @CsvSource({"3,cxk,123456,蔡徐坤,25"})
    public void testUpdate(int userId, String newUsername, String newPassword, String newName, int newAge) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
        PreparedStatement pstmt = conn.prepareStatement("UPDATE user SET username = ?, password = ?, name = ?, age = ? WHERE id = ?");

        pstmt.setString(1, newUsername); // 新用户名
        pstmt.setString(2, newPassword); // 新密码
        pstmt.setString(3, newName); // 新姓名
        pstmt.setInt(4, newAge); // 新年龄
        pstmt.setInt(5, userId); // 要更新的用户ID

        int rowsAffected = pstmt.executeUpdate(); // 执行更新
        System.out.println(rowsAffected + " 行被更新。");

        pstmt.close();
        conn.close();
    }
    @ParameterizedTest
@CsvSource({"666888,关羽,32,4"})
public void testUpdateUser(String newPassword, String newName, int newAge, int userId) throws Exception {
    // 获取数据库连接
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");

    // 准备预编译SQL语句
    PreparedStatement pstmt = conn.prepareStatement("UPDATE user SET password = ?, name = ?, age = ? WHERE id = ?");

    // 设置参数
    pstmt.setString(1, newPassword); // 设置新密码
    pstmt.setString(2, newName);     // 设置新名字
    pstmt.setInt(3, newAge);         // 设置新年龄
    pstmt.setInt(4, userId);         // 设置用户ID

    // 执行更新操作
    int rowsAffected = pstmt.executeUpdate();
    System.out.println(rowsAffected + " 行被更新。");

    // 关闭资源
    pstmt.close();
    conn.close();
}
@ParameterizedTest
@CsvSource({"20,4"})
public void testQueryByAgeAndId(int minAge, int maxId) throws Exception {
    // 获取数据库连接
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");

    // 准备预编译SQL语句
    PreparedStatement pstmt = conn.prepareStatement("SELECT id, username, password, name, age FROM user WHERE age >= ? AND id <= ?");

    // 设置参数
    pstmt.setInt(1, minAge);  // 设置最小年龄
    pstmt.setInt(2, maxId);   // 设置最大ID

    // 执行查询
    ResultSet rs = pstmt.executeQuery();

    // 处理结果集并输出
    while (rs.next()) {
        int id = rs.getInt("id");
        String username = rs.getString("username");
        String password = rs.getString("password");
        String name = rs.getString("name");
        int age = rs.getInt("age");

        System.out.println("ID: " + id + ", Username: " + username + ", Password: " + password + ", Name: " + name + ", Age: " + age);
    }

    // 关闭资源
    rs.close();
    pstmt.close();
    conn.close();
}



}