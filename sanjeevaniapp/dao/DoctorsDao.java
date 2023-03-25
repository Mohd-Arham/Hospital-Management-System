package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.DoctorsPojo;

public class DoctorsDao {
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
   public static boolean deleteDoctor(String id)throws SQLException{
 Connection conn=DBConnection.getConnection();
 PreparedStatement ps=conn.prepareStatement("delete from  where receptionists_id=?");
 ps.setString(1, id);
 return ps.executeUpdate()==1;
    } 
   public static boolean addDoctors(DoctorsPojo dc)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into doctors values(?,?,?,?,?,?,?)");
    ps.setString(1, dc.getDoctorId());
    ps.setString(2, dc.getDoctorName());
    ps.setString(3, dc.getEmailId());
    ps.setString(4, dc.getContactNo());
    ps.setString(5, dc.getQualification());
    ps.setString(6, dc.getGender());
    ps.setString(7, dc.getSpecialist());
    return ps.executeUpdate()==1;
   }
   public static String getNewDocId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(doctor_id) from doctors");
  rs.next();
  int docid=101;
  String id=rs.getString(1);
    if(id!=null){
       String num=id.substring(3);
       docid=Integer.parseInt(num)+1;
    }
   return "DOC"+docid;
}  
   public static List<String> getAllDoctorId()throws SQLException{
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select doctor_id from doctors");
       List<String> list=new ArrayList<>();
       while(rs.next()){
          list.add(rs.getString(1));
       }
       return list;
   }
   public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
     ps.setString(1, docId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);
     EmpDao.DeleteAllRecepId(docName);
     ps=conn.prepareStatement("Delete from doctors where doctor_id=?");
     ps.setString(1, docId);
     return ps.executeUpdate()==1;
}
   public static List<DoctorsPojo>getDoctorsAllDetails()throws SQLException{
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from doctors  order by doctor_id");
       List<DoctorsPojo> list=new ArrayList<>();
       while(rs.next()){
       DoctorsPojo doc=new DoctorsPojo();
       doc.setDoctorId(rs.getString("doctor_id"));
       doc.setDoctorName(rs.getString("doctor_name"));
       doc.setEmailId(rs.getString("email_id"));
       doc.setContactNo(rs.getString("contact_no"));
       doc.setQualification(rs.getString("qualification"));
       doc.setGender(rs.getString("gender"));
       doc.setSpecialist(rs.getString("specialist"));
       list.add(doc);
     }
       return list;
   }
   public static DoctorsPojo getDoctorDetails(String docId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from doctors where doctor_id=?");
    ps.setString(1,docId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    DoctorsPojo emp=new DoctorsPojo();
    emp.setDoctorId(rs.getString(1));
    emp.setDoctorName(rs.getString(2));
    emp.setEmailId(rs.getString(3));
    emp.setContactNo(rs.getString(4));
    emp.setQualification(rs.getString(5));
    emp.setGender(rs.getString(6));
    emp.setSpecialist(rs.getString(7));
    return emp;
    
 }
   public static String GetDocNameById(String patId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
    ps.setString(1, patId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    String name=rs.getString(1);
    return name;
   }
   public static boolean updateDoctors(DoctorsPojo emp)throws SQLException{
   updateNameDoc(emp);
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update doctors set doctor_name=?,email_id=?,contact_no=?,qualification=?,gender=?,specialist=? where doctor_id=?");
     ps.setString(1, emp.getDoctorName());
     ps.setString(2, emp.getEmailId());
     ps.setString(3, emp.getContactNo());
     ps.setString(4, emp.getQualification());
     ps.setString(5, emp.getGender());
     ps.setString(6, emp.getSpecialist());
     ps.setString(7, emp.getDoctorId());
    
     return ps.executeUpdate()==1;
 }
   public static void updateNameDoc(DoctorsPojo emp)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_name=?");
     ps.setString(1, emp.getDoctorName());
     ResultSet rs=ps.executeQuery();
     rs.next();
     String currName=rs.getString(1);
   
     //UserDao.updateDoctors(currName);  
 }
}
