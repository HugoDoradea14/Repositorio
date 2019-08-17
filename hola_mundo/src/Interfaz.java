import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Interfaz extends javax.swing.JFrame{

    private ResultSet rs = null;
    private Statement s = null;

    public Interfaz(){
       //holi
    }
    public static void coneccion(){
        Connection connection = null;
        if( connection != null){
            return;
        }
        String url = "jdbc:postgresql://localhost:5432/poo2019";
        String password ="my_postgres_password";
        try{
            Class.forName("org.postgresql.Driver");

            connection= DriverManager.getConnection(url,"postgres",password);

            if(connection != null){
                System.out.println("successful connection");
            }
        }catch(Exception e){
            System.out.println("problemas de conexion");
        }


    }
}
