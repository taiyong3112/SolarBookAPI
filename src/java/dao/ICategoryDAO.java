/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ICategoryDAO {
    public List<Category> getAll();

    public void insert(Category c);

    public void delete(int id);

    public void update(Category c);
}
