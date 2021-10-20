/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.dao;

import com.ca.control.domain.Mesdiahora;
import com.ca.control.domain.MesdiahoraCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MesdiahoraDaoImpl implements MesdiahoraDao{
    @Autowired
    MesdiahoraCrud mdhC;

    @Override
    public List<Mesdiahora> Lista() {
        return (List<Mesdiahora>) mdhC.findAll();
    }
    
    
}
