package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.ReceptionistPojo;
import sanjeevaniapp.pojo.UserPojo;

public class ReceptionistDao {
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
    public static boolean deleteReceptionists(String id)throws SQLException{
 Connection conn=DBConnection.getConnection();
 PreparedStatement ps=conn.prepareStatement("delete from receptionists where receptionist_id=?");
 ps.setString(1, id);
 return ps.executeUpdate()==1;
    }
     public static String getNewRecpId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(receptionist_id) from receptionists");
  rs.next();
  int recpid=101;
  String id=rs.getString(1);
    if(id!=null){
       String num=id.substring(3);
       recpid=Integer.parseInt(num)+1;
    }
   return "REC"+recpid;
}  
      public static boolean addReceptionist(ReceptionistPojo rec)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into receptionists values(?,?,?)");
     ps.setString(1,rec.getReceptionistId());
     ps.setString(2,rec.getReceptionistName());
     ps.setString(3,rec.getGender());
     
     return ps.executeUpdate()==1;
}
      public static List<ReceptionistPojo> getAllReceptionistDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from receptionists order by receptionist_id");
    List<ReceptionistPojo>recList=new ArrayList<>();
    while(rs.next()){
    ReceptionistPojo recep=new ReceptionistPojo();
    recep.setReceptionistId(rs.getString(1));
    recep.setReceptionistName(rs.getString(2));
    recep.setGender(rs.getString(3));
    recList.add(recep);
    
    }
    return recList;
} 
      public static List<String> getAllRecepId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();         
    ResultSet rs=st.executeQuery("Select receptionist_id from receptionists");
    List<String> empIdList=new ArrayList<>();
    while(rs.next()){
        empIdList.add(rs.getString(1));
    }
    return empIdList;
}
      public static ReceptionistPojo getReceptionistDetails(String recId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from receptionists where receptionist_id=?");
    ps.setString(1,recId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    ReceptionistPojo emp=new   ReceptionistPojo();
   emp.setReceptionistId(rs.getString(1));
   emp.setReceptionistName(rs.getString(2));
   emp.setGender(rs.getString(3));
    return emp;
    
 } 
 public static String getReceptionistsNameById(String id)throws SQLException{
      Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select receptionist_name from receptionists where receptionist_id=?");
    ps.setString(1, id);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    return str;
 }
 public static boolean updateReceptionists(ReceptionistPojo emp)throws SQLException{
   updateNameRecep(emp);
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=?,gender=? where receptionist_id=?");
     ps.setString(1, emp.getReceptionistName());
     ps.setString(2, emp.getGender());
     ps.setString(3, emp.getReceptionistId());
    
     return ps.executeUpdate()==1;
 }
 public static void updateNameRecep(ReceptionistPojo emp)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_name=?");
     ps.setString(1, emp.getReceptionistName());
     ResultSet rs=ps.executeQuery();
     rs.next();
     String currName=rs.getString(1);
   
     //UserDao.updateReceptionists(user,currName);    
 }
 public static boolean DeleteReceptionistsId(String  id)throws SQLException{
     ReceptionistsName(id);
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("delete receptionists where receptionist_id=?");
    ps.setString(1,id );
    return ps.executeUpdate()==1;
}
public static void ReceptionistsName(String id)throws SQLException{
      Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select receptionist_name from receptionists where receptionist_id=?");
    ps.setString(1, id);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String str=rs.getString(1);
    UserDao.deleteUserByName(str);
    EmpDao.DeleteAllRecepId(str);

}
public static boolean updateRecepDetails(ReceptionistPojo recep)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=?,GENDER=? where RECEPTIONIST_ID=?");
     ps.setString(3, recep.getReceptionistId());
     ps.setString(1,recep.getReceptionistName());
     ps.setString(2, recep.getGender());
//     ps.executeUpdate();
     
     ResultSet rs=ps.executeQuery();
//     rs.next();
     if(rs.next())
         return true;
     return false;
}
}