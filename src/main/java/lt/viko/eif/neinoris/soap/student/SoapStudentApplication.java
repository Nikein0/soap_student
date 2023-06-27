package lt.viko.eif.neinoris.soap.student;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Country/Student service endpoint
//
@SpringBootApplication
public class SoapStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapStudentApplication.class, args);
		DatabaseConfig databaseConfig = new DatabaseConfig();
		try{
			String q = "SELECT * FROM `student`";
			PreparedStatement pat = DatabaseConfig.connect().prepareStatement(q);
			pat.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
