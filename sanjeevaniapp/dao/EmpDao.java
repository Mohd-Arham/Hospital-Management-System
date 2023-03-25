package sanjeevaniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmpPojo;

public class EmpDao {
 public static String getNextEmpId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select max(emp_id) from employees");
    rs.next();
    String str=rs.getString(1);
    int empId=101;
    if(str!=null){
        String id=str.substring(1);
        empId=Integer.parseInt(id);
        empId++;
    }
    String newId="E"+empId;
    return newId;
}  
public static boolean addEmp(EmpPojo emp)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?,?)");
    ps.setString(1, emp.getEmpId());
    ps.setString(2, emp.getEmpName());
    ps.setString(3, emp.getEmpDept());
    ps.setDouble(4,emp.getEmpSal());
    return ps.executeUpdate()==1;
} 
public static List<String> getAllemployeeId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();         
    ResultSet rs=st.executeQuery("Select emp_id from employees");
    List<String> empIdList=new ArrayList<>();
    while(rs.next()){
        empIdList.add(rs.getString(1));
    }
    return empIdList;
}       
 public static EmpPojo getEmployeeDetails(String empId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from employees where emp_id=?");
    ps.setString(1,empId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    EmpPojo emp=new EmpPojo();
    emp.setEmpId(rs.getString(1));
    emp.setEmpName(rs.getString(2));
    emp.setEmpDept(rs.getString(3));
    emp.setEmpSal(rs.getDouble(4));
    return emp;
    
 } 
 
 public static boolean updateEmployee(EmpPojo emp)throws SQLException{
     updateName(emp);
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update employees set emp_name=?,emp_salary=? where emp_id=?");
     ps.setString(1, emp.getEmpName());
     ps.setDouble(2, emp.getEmpSal());
     ps.setString(3, emp.getEmpId());
     return ps.executeUpdate()==1;
 }
 public static void updateName(EmpPojo emp)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select emp_name from employees where emp_id=?");
     ps.setString(1, emp.getEmpId());
     ResultSet rs=ps.executeQuery();
     rs.next();
     String currName=rs.getString(1);
     String newName=emp.getEmpName();
     UserDao.updateName(currName,newName);
     if(emp.getEmpDept().equalsIgnoreCase("Receptionist"))
         ReceptionistDao.updateName(currName,newName);
     else if(emp.getEmpDept().equalsIgnoreCase("Doctor"))
         DoctorsDao.updateName(currName,newName);
     
 }
 public static List<EmpPojo> getAllEmployeeDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from employees order by emp_id");
    List<EmpPojo>empList=new ArrayList<>();
    while(rs.next()){
    EmpPojo emp=new EmpPojo();
    emp.setEmpId(rs.getString(1));
    emp.setEmpName(rs.getString(2));
    emp.setEmpDept(rs.getString(3));
    emp.setEmpSal(rs.getDouble(4));
    empList.add(emp);
    }
    return empList;
    
 } 
 public static List<String> getAllids()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();         
    ResultSet rs=st.executeQuery("Select emp_id from employees");
    List<String> empIdList=new ArrayList<>();
    while(rs.next()){
        empIdList.add(rs.getString(1));
    }
    return empIdList;
 }
 public static boolean DeleteAllemployeeId(String id)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("delete employees where emp_id=?");
    ps.setString(1, id);
    return ps.executeUpdate()==1;
}
 public static boolean deleteName(String id)throws SQLException{
      Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select emp_department form employees where emp_id=?");
    ps.setString(1, id);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        return false;
    }
    String depart=rs.getString(1);
    if(depart.equalsIgnoreCase("Receptionist"))
    return ReceptionistDao.deleteReceptionists(id);
    else if(depart.equalsIgnoreCase("Doctors"))
    DoctorsDao.deleteDoctor(id);
    return false;
    
 }
 public static Map<String,String> getUnRegisteredDoctors()throws SQLException{
 Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("select emp_id,emp_name from employees where emp_department='DOCTOR'and emp_name not in (select user_name from users where user_type='DOCTOR')order by emp_id");
   Map<String,String> unreg=new HashMap<>();
   
     while(rs.next()){
         String id=rs.getString(1);
       
         String name=rs.getString(2);
         unreg.put(id, name);
     }
     return unreg;
 }
 public static Map<String,String> getUnReceptionists()throws SQLException{
 Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("select emp_id,emp_name from employees where emp_department='RECEPTIONIST' and emp_name not in (select user_name from users where user_type='RECEPTIONIST')order by emp_id");
   Map<String,String> unreg=new HashMap<>();
     System.out.println(unreg);
     while(rs.next()){
         String id=rs.getString(1);
         System.out.println(id);
         String name=rs.getString(2);
         unreg.put(id, name);
     }
     return unreg;
 }
 public static void updateNameRecep(EmpPojo emp)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select emp_name from employees where emp_id=?");
     ps.setString(1, emp.getEmpId());
     ResultSet rs=ps.executeQuery();
     rs.next();
     String currName=rs.getString(1);
     String newName=emp.getEmpName();
     UserDao.updateName(currName,newName);
     if(emp.getEmpDept().equalsIgnoreCase("Receptionist"))
         ReceptionistDao.updateName(currName,newName);
     else if(emp.getEmpDept().equalsIgnoreCase("Doctor"))
         DoctorsDao.updateName(currName,newName);
     
 }
 public static boolean DeleteAllRecepId(String id)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("delete employees where emp_name=?");
    ps.setString(1, id);
    return ps.executeUpdate()==1;
}
  public static boolean updateEmpName(String Name,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update employees set emp_name=? where emp_name=?");
     ps.setString(2, Name);
     ps.setString(1, newName);
     ResultSet rs=ps.executeQuery();
//     rs.next();
     if(rs.next())
         return true;
     return false;    
   }
}
