/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.control.service;

import com.ca.control.dao.DetalledeclicsxfechaDao;
import com.ca.control.domain.Detalledeclicsxfecha;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalledeclicsxfechaService {
    
    @Autowired
    DetalledeclicsxfechaDao dD;
    
    public List<Detalledeclicsxfecha> Lista(){
        return dD.Lista();
    }
}
