package connection;

import java.sql.*;

public class DataBaseConnection{
    private final String DBDriver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DBURL ="jdbc:sqlserver://localhost:1433;DatabaseName=student";
    private final String DBUSER ="sa";
    private final String DBPASSWORD ="123";
    private Connection conn = null;
    //构造器
    public DataBaseConnection(){
        try{
            Class.forName(DBDriver);
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        }
        catch(Exception e){
            System.out.println("加载失败");
        }
    }

    //获得连接
    public Connection getConnection(){
        return this.conn; }

    //关闭连接
    public void close() throws SQLException{
        this.conn.close(); }
} 
