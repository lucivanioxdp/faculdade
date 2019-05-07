package com.luaplicattions.app.dao.product;

import com.luaplicattions.app.dao.DaoException;
import com.luaplicattions.app.model.beans.Product;
import java.util.List;

public interface ProductDao {
    
    public void upadate (Product product)throws DaoException;
    
    public void add (Product product) throws DaoException;
    
    public void delete (Product product) throws DaoException;
    
    public List <Product> getPorID (Integer id) throws DaoException;
    
    public List <Product> getForName (String name) throws DaoException;
    
    public List <Product> getAll () throws DaoException;
}
