package consola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import oracle.jdbc.OracleDriver;

public class App {
		
	public static void main(String[] args) throws SQLException {
//		1) Añadir driver de la BBDD al proyecto
//		2) Cargar el driver en la MVJ
		DriverManager.registerDriver(new OracleDriver() ); 
		
//		forma alternativa de registrar el driver en la MVJ
//		Class.forName("oracle.jdbc.OracleDriver").newInstance(); 
		
//		3)Crear la conexión a BBDD(sesion)
		Connection conexion = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:pcarrier", 
				"JA4BM3ON15", 
				"usuario"); 
		
//		Cierrao conexión a BBDD
		conexion.close(); 
	}
}//fin class consola.App
