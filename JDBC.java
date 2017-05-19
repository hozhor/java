package hozhor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;



public class JDBC {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/hozhor";//hozhor是数据库名称
	String user="root";//数据库用户名
	String password="root";//数据库密码
	Connection con;
	Statement stmt;
	ResultSet rs;
	/*用构造方法来连接数据库（目的是为了一次链接到处用）*/
	JDBC(){
			try {
				Class.forName(driver);//1.加载驱动
				con =DriverManager.getConnection(url, user, password);//2.连接数据库
				stmt=con.createStatement();//sql语句执行语句
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	/*查询语句（返回值是一个集合类）*/
	ArrayList<HashMap<String, String>> query(String sql){
		try {
			rs=stmt.executeQuery(sql);
			ResultSetMetaData mt=rs.getMetaData();//结果集结构对象
			int count =mt.getColumnCount();//字段个数
			ArrayList<HashMap<String, String>> list =new ArrayList<HashMap<String,String>>();
			while (rs.next()) {
				HashMap<String, String> map = new HashMap<String,String>();
				for (int i = 1; i <= count; i++) {
					String name=mt.getColumnName(i);
					map.put(name, rs.getString(name));
				} 
				list.add(map);
			}
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}	
	
	//查询部分
	ArrayList<HashMap<String, String>> queryByPage(String sql,int page,int pageSize){
	/*	page 1 start=0
		page 2 start=pageSize
		page 3 start=pageSize*2
		page 4 start=pageSize*3*/
		
		int start=(page-1)*pageSize;
		sql=sql+"LIMIT"+start+","+pageSize;//拼出来的（limit index ,langth）
		return query(sql);
	}
	
	
	
	/*增删改*/
	void update(String sql){
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	void close(){
		try {
			if(rs!=null){
			rs.close();
			}
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
/*批处理（目的是为了提高效率，原理是把多个SQL语句存到缓冲区，最后一次性提交）	*/
	void batch(String[] sqls){
		try {
		for (int i = 0; i < sqls.length; i++) {
			
				stmt.addBatch(sqls[i]);//加入到批处理
		}	
			stmt.executeBatch();//执行批处理
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	//执行事务（目的是为了把多个语句看成一条语句最后提交，原理是关掉自动提交功能，执行完所有的语句在提交）
	void excqutetranstion(String[] sqls ){
		
			try {
				con.setAutoCommit(false);//关掉自动提交
				for (int i = 0; i < sqls.length; i++) {
				stmt.executeUpdate(sqls[i]);
				}
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					con.rollback();//回滚（当提交失败时把把所有的SQL语句清理掉）
					con.commit();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
	}
}

