/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;



public class MetodoPool {


    public DataSource dataSource;

    public String db = "ods_db";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "1234";

   


    public MetodoPool(){

        inicializaDataSource();
        

    }



    private void inicializaDataSource(){


        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);


        dataSource = basicDataSource;
        

    }
    



}

