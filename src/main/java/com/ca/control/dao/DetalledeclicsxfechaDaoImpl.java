/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;

import com.ca.control.domain.Detalledeclicsxfecha;
import com.ca.control.domain.DetalledeclicsxfechaCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetalledeclicsxfechaDaoImpl implements DetalledeclicsxfechaDao{
    
    @Autowired
    DetalledeclicsxfechaCrud dC;
    
    @Override
    public List<Detalledeclicsxfecha> Lista() {
        return (List<Detalledeclicsxfecha>) dC.findAll();
    }
    
}
