/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcOracleConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.OracleConnection;

public class conn {

  
    private Connection conn;
    
    public Connection GetConnect(){
        return conn;
    }
    public boolean open(String strUser,String strPassWord){
        boolean kq=false;
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");  
          String dbURL = "jdbc:oracle:thin:@localhost:1521:QLST" ;
          conn = DriverManager.getConnection(dbURL,strUser,strPassWord);
          if(conn!=null)
          {
              kq=true;
          }
       }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return kq;
    }
    public void close()
    {
        try
        {
            this.conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public ResultSet executeQuery  (String sql)
    {
        ResultSet rs=null;
        try
        {
            Statement sm= conn.createStatement();
            rs=sm.executeQuery(sql);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return rs;
        
    }
    public  int executeUpdate(String sql)
    {
        int n=-1;
        try
        {
            Statement sm=conn.createStatement();
            n=sm.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return n;   
    }

    public PreparedStatement prepareStatement(String sqlSelect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}