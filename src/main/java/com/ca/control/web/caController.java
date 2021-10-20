package com.ca.control.web;



import com.ca.control.domain.Ips;
import com.ca.control.service.DetalledeclicsxfechaService;
import com.ca.control.service.IpsService;
import com.ca.control.service.MesdiahoraService;
import com.ca.control.service.TokService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;




//
//@RestController
//@RequestMapping("/index2")
@Controller
public class caController {
@Autowired
TokService tokS;

@Autowired
IpsService ipsS;

@Autowired
DetalledeclicsxfechaService dS;

@Autowired
MesdiahoraService mdhS;

    /* @GetMapping("/{argumento}")
    public String Formulario(Model model) {

        var comboProvincia = ps.listaProvincia();
        var comboCiudad = cs.listaOrdenada();
        var comboEmpresa = es.listaOrdenada();
        model.addAttribute("AFILIADO", new Afiliado());
        model.addAttribute("PROVINCIA", comboProvincia);
        model.addAttribute("CIUDAD", comboCiudad);
        model.addAttribute("EMPRESA", comboEmpresa);
       return "index2";
   return "redirect:https://es.research.net/r/77LR28C?ToK=1";
    }
*/

    
    @GetMapping(path="/")
    public String Formulario(Model model){
      
        var tokens = tokS.ListaToken();
        var vista = dS.Lista();
        var ips = ipsS.Lista();
        int suma=0;  
      
        for(int i=0; i<tokens.size();i++){
             var tok = tokens.get(i);
            suma += tok.getClic();
           
          }
      
         model.addAttribute("TOTAL", suma);
         model.addAttribute("TOKENS", tokens);
         model.addAttribute("VISTA", vista);
         model.addAttribute("IPS", ips);
         model.addAttribute("HISTORIAL", mdhS.Lista());
 
        return "index" ;
    }
}
