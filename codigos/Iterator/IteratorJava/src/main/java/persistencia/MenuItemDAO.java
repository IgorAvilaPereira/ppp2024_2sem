/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import negocio.MenuItem;

/**
 *
 * @author iapereira
 */
public class MenuItemDAO {
    
    public Collection<MenuItem> listar() throws SQLException{
        String sql = "select * from menu_item";
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        Collection<MenuItem> itens = new ArrayList();
        while(rs.next()){
            MenuItem item = new MenuItem();
            item.setDescricao(rs.getString("descricao"));
            item.setNome(rs.getString("nome"));
            item.setEhVegetariano(rs.getBoolean("eh_vegetariano"));
            item.setPreco(rs.getDouble("preco"));
            itens.add(item);
        }
        
        conexao.close();
        return itens;
    }
    
}
