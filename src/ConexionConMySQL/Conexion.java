package ConexionConMySQL;

    import java.sql.Connection;
    import java.sql.DriverManager;
import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;


public class Conexion { 
    
    public static final String URL = "jdbc:mysql://localhost:3306/bdnegocio";
    public static final String USER = "root";
    public static final String CLAVE = "";
    private Connection con = null;
     
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USER, this.CLAVE);
        }catch(ClassNotFoundException | SQLException e){
           System.err.println(e);
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }
}

