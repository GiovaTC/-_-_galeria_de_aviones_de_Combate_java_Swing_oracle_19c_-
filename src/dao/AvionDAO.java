package dao;

import db.OracleConnection;
import model.Avion;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDAO {

    public List<Avion> obtenerAviones() throws Exception {
        List<Avion> lista = new ArrayList<>();

        String sql = "SELECT * FROM AVIONES_COMBATE";

        try (Connection con = OracleConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                InputStream is = rs.getBlob("IMAGEN").getBinaryStream();
                Image img = ImageIO.read(is);

                lista.add(new Avion(
                        rs.getString("NOMBRE"),
                        rs.getString("PAIS"),
                        rs.getString("TIPO"),
                        rs.getString("VELOCIDAD"),
                        img
                ));
            }
        }
        return lista;
    }
}   
