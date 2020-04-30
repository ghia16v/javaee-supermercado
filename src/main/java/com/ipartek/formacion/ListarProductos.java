package com.ipartek.formacion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ListarProductos {

	public static void main(String[] args) {
		
		//credenciales de acceso a BBDD
		final String usuario = "debian-sys-maint";
		final String pass = "o8lAkaNtX91xMUcV";
		final String URL = "jdbc:mysql://localhost/supermercado";
		
		try {
			
			//Comprobación de que existe el JAR de mysql
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("El jar para mysql está operativo");
			
			//Conectar a la bbdd supermercado
			Connection conexion = DriverManager.getConnection(URL, usuario, pass);
			System.out.println("Conexión con éxito");
		}
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Ha ocurrido algún error");
		}
		
		//Sentencias a ejecutar
		String SQL = "Select id, nombre from producto";
	}

}
