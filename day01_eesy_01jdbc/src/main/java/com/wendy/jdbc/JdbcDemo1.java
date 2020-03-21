package com.wendy.jdbc;

/**
 * Project Name: day01_eesy_01jdbc
 * Package Name: com.wendy.jdbc
 * File Name: JdbcDemo1
 *
 * @author wendy_wan
 * @date 2020/2/25 11:32
 */

import java.sql.*;

/**
 * 程序的耦合：
 *      耦合：程序间的依赖关系
 *          包括：
 *              类之间的依赖、
 *              方法间的依赖
 *
 *      解耦：降低程序间的依赖关系
 *
 *      实际开发中：
 *          应该做到，编译器不依赖，运行时才依赖
 *
 *      解耦的思路：
 *          第一步：使用反射来创建对象，而避免使用new关键字
 *          第二步：通过读取配置文件来获取要创建的对象全限定类名
 * */

//创建连接数据库的步骤
public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1、注册驱动
        /**
         * 没有com.mysql.jdbc.Driver()，程序将无法运行
         *
        */
     // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2、获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","wan");

        //3、获得操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");

        //4、执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();

        //5、遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }

        //6、释放资源
        rs.close();
        pstm.close();
        conn.close();
    }

}
