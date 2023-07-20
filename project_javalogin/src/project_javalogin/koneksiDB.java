/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_javalogin;

/**
 *
 * @author izzan
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksiDB {
        Connection koneksi = null;

        public static Connection koneksiDB() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection koneksi
                        = DriverManager.getConnection("jdbc:mysql://localhost/javalogin", "root", "");
                return koneksi;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
}
