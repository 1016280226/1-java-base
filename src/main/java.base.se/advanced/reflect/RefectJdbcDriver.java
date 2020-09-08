package advanced.reflect;

import java.sql.*;

public class RefectJdbcDriver {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 获取加载驱动类
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

        // 通过驱动管理 DriverManager 获取数据库连接
        String mysqlUrl = "jdbc:mysql://localhost:3306/db_test";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(mysqlUrl, username, password);

        String addUserSql = "INSTER user (name, age) value (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addUserSql);
        preparedStatement.setString(1,"Calvin");
        preparedStatement.setInt(2,26);
        preparedStatement.executeUpdate();


        String queryUserSql = "SELECT * FROM user";
        ResultSet resultSet = preparedStatement.executeQuery(queryUserSql);
        // 操作ResultSet结果集
        while (resultSet.next()) {
            // 第一种获取字段方式
            System.out.println(
                    resultSet.getString(1) + " " +
                    resultSet.getString(2) + " " +
                    resultSet.getString(3)
            );
        }

        // 关闭数据库连接
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
