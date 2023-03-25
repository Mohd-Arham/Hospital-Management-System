package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.pojo.UserPojo;

public class UserDao {
     public static String validateUser(User use) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, use.getLoginId());
         ps.setString(2,use.getPassword());
         ps.setString(3, use.getUserType());
         ResultSet rs=ps.executeQuery();
         String name=null;
         if(rs.next()){
             name=rs.getString(1);
             System.out.println(name); //namr is print in the output screen
         }
         return name;
   }
      public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
  public static boolean addUser(UserPojo emp) throws SQLException{
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?)");
      ps.setString(1, emp.getLoginid());
      ps.setString(2, emp.getUserName());
      ps.setString(3, emp.getPassword());
      ps.setString(4, emp.getUserType());
      return ps.executeUpdate()==1;
  }       
  public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}
    public static UserPojo getReceptionistDetails(String re)throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement ps=conn.createStatement();
   
    ResultSet rs=ps.executeQuery("select login_id,user_name from users where receptionist_id=?");
    rs.next();
    UserPojo emp=new UserPojo();
  emp.setLoginid(rs.getString(1));
 
  emp.setUserName(rs.getString(2));

  
    return emp;
    
 }
    public static String getUserLoginId(String name)throws SQLException{
      Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select login_id from users where user_name=?");
    ps.setString(1, name);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
 }
    public static boolean updateReceptionists(UserPojo user,String currName )throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set login_id=?,user_name=?,user_password=? where user_name=?");
     ps.setString(1,user.getLoginid());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, currName);
    return ps.executeUpdate()==1;   
}
    public static boolean updateDoctors(UserPojo user,String currName )throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set login_id=?,user_name=?,user_password=? where user_name=?");
     ps.setString(1,user.getLoginid());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, currName);
    return ps.executeUpdate()==1;   
}
    public static boolean  DeleteUserId(String name)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("delete users where user_name=?");
    ps.setString(1, name);
    return ps.executeUpdate()==1;
}
    public static UserPojo getUserDetails(String userName)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from USERS where USER_NAME=?");
    ps.setString(1,userName);
    ResultSet rs=ps.executeQuery();
    rs.next();
    UserPojo user=new UserPojo();
    user.setLoginid(rs.getString(1));
    user.setUserName(rs.getString(2));
    user.setPassword(rs.getString(3));
    user.setUserType(rs.getString(4));
    
    return user;
    
 }
     public static boolean updateUserDetails(UserPojo user,String oldName)throws SQLException
  {
      Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update USERS set USER_NAME=?,LOGIN_ID=?,PASSWORD=? where USER_NAME=?");
     ps.setString(2, user.getLoginid());
     ps.setString(1, user.getUserName());
     ps.setString(3, user.getPassword());
     ps.setString(4, oldName);
     ResultSet rs = ps.executeQuery();
//     rs.next();
     if(rs.next())
         return true;
     return false;
  }
    }


