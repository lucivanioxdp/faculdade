package com.luaplicattions.app.view.windows.products;

import com.luaplicattions.app.model.beans.Category;
import com.luaplicattions.app.model.beans.Product;
import java.math.BigDecimal;
//utilizar essa biblioteca para os objetos List
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ProductsTableModel implements TableModel{

    private List <Product> products;
    
    public ProductsTableModel(List <Product> products){
        this.products = products;
    }
    //método para resgatar um produto através de sua linha
    public List<Product> getProduct() {
        return products;
    }

    //adiciona uma Lista de Produtos na Tabela
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    @Override
    //recebe o numero de linhas
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    //da um título para minhas colunas
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0 :
                return "id";
            case 1 :
                return "Categoria";
            case 2 :
                return "Nome";
            case 3 :
                return "Preço Custo";
            case 4 :
                return "Preço Venda";
            case 5 :
                return "medida";
            case 6 :
                return "Quantidade Estoque";
        } return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        //Verifica o tipo da Classe presente em cada coluna
        switch (columnIndex){
            case 0 :
                return Integer.class;
            case 1:
                return Category.class;
            case 2 :
                return String.class;
            case 3 :
                return BigDecimal.class;
            case 4 :
                return BigDecimal.class;
            case 5 :
                return String.class;
            case 6 :
                return Integer.class;
        } return void.class;
    }

    @Override
    //ativa ou desativa a edição das linhas da tabela
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //edição desativada
        return false;
    }

    @Override
    //pega os valores da linha selecionada
    public Object getValueAt(int rowIndex, int columnIndex) {
        //vai pegar os valores do produto que está com a linha selecionada (row Index)
                //produto atual
        Product currentProduct = products.get(rowIndex);
        
        // para cada coluna da linha faça;
        switch (columnIndex){
            case 0 :
                return currentProduct.getIdProduct();
            case 1 :
                return currentProduct.getCategory();
            case 2 :
                return currentProduct.getName();
            case 3 :
                return currentProduct.getCostPrice();
            case 4 :
                return currentProduct.getSalePrice();
            case 5 :
                return currentProduct.getMeasure();
            case 6:
                //mudar depois(irei criar um metodo no estoque que retorne a atde de produtos recebendo como parametro o produto;
                return currentProduct.getIdProduct();
        } return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //vazio
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
       //caso eu queira adicionar algum evento a table model
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //vazio
    }
    
}
