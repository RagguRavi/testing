package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.microsoft.sqlserver.jdbc.Geography;

public class Test1 {

	public static void main(String[] args) {
		try{  
			/*
			 * Class.forName("com.mysql.jdbc.Driver"); Connection
			 * con=DriverManager.getConnection(
			 * "jdbc:mysql://localhost:3306/beepermd_test","root","root"); //here sonoo is
			 * database name, root is username and password Statement
			 * stmt=con.createStatement();
			 */ 
			
			/*
			LocalContainerEntityManagerFactoryBean emfBean = new LocalContainerEntityManagerFactoryBean();
			emfBean.setDataSource(dataSource);
			emfBean.setPackagesToScan("com.beepermd.domain"); // Here mention JPA entity path / u can leave it scans all packages
			emfBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
			
			emfBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
			Map<String, String> properties = new HashMap<>();

			properties.put("hibernate.hbm2ddl.auto", "create");
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.spatial.dialect.mysql.MySQLSpatialDialect");
			emfBean.setJpaPropertyMap(properties);
			emfBean.setPersistenceUnitName(dataSource.toString());
			emfBean.afterPropertiesSet();
			
			emfBean.destroy();
			*/
			
			DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
			dataSource1.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource1.setSchema("beepermd_test");
			dataSource1.setUrl("jdbc:mysql://localhost:3306/beepermd_test4");
			dataSource1.setUsername("root");
			dataSource1.setPassword("root");
			
			Connection con =  dataSource1.getConnection();
			
			Statement statment1 = con.createStatement();
			statment1.addBatch("drop table user_info;");
			statment1.addBatch("drop table user_info_role;");
			statment1.addBatch("drop table role;");

			statment1.addBatch("drop table access_token;");
			statment1.addBatch("drop table apiLog;");
			statment1.addBatch("drop table doctorInvoice;");
			statment1.addBatch("drop table lead_table;");
			statment1.addBatch("drop table client_info;");
			
			
			
			
			System.out.println(statment1.executeBatch());
			con.close();  
		}catch(Exception e){ System.out.println(e);
			e.printStackTrace();
		}  
	}
	

	
	public static void test() {
		try{  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:sqlserver://localhost:1433;databaseName=beepermd_shared","sa","Admin@123");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			
			String polygentWKT = "POLYGON ((-81.35885137348568 25.65473051813954, -81.35885137348568 27.162013272177962, -82.67073068895138 27.162013272177962, -82.67073068895138 25.65473051813954, -81.35885137348568 25.65473051813954))";
			String polygentWKT2 = "POLYGON((1 2,1 4,3 4,3 2,1 2))";
			Geography geo = Geography.STGeomFromText(polygentWKT,4326);
			
			System.out.println(con.getClientInfo());
			con.close();  
		}catch(Exception e){ System.out.println(e);
			e.printStackTrace();
		}  
	}
}

