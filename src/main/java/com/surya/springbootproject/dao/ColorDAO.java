/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.surya.springbootproject.dao;

import com.surya.springbootproject.entity.Color;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface ColorDAO {
    List<Color>getAll();
    int insert(Color color);
    int update(Color color);
    int delete(int id) ;
    Color getById(int id) ;
  
}
