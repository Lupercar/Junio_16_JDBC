package consola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import oracle.jdbc.OracleDriver;

public class App {
		
	public static void main(String[] args) throws SQLException {
//		1) Añadir driver de la BBDD al proyecto
//		2) Cargar el driver en la MVJ
		DriverManager.registerDriver(new OracleDriver() ); 
		
//		3) Crear conexion a BBDD
		Connection conexion = DriverManager.getConnection( 
				"jdbc:oracle:thin:@localhost:1521:pcarrier", 
				"JA4BM3ON15", 
				"usuario"); 
		
		List<Cliente> clientes = new ArrayList<>(); 
		
//		4) Hacer operaciones con la BBDD
		Statement comando = conexion.createStatement(); //creamos un comando nuevo 
		String sql = "SELECT id, nombre FROM cliente"; 
		ResultSet resultados = comando.executeQuery(sql); 
		
//		Cierrao conexión a BBDD
		conexion.close(); 
	}
}//fin class consola.App
