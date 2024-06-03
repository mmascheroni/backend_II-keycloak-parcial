package com.elaparato.controller;


import com.elaparato.model.Venta;
import com.elaparato.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {


    @Autowired
    private IVentaService ventServ;

    //crear una nueva venta
    @PostMapping("/create")
    @PreAuthorize("hasAnyRole('ROLE_vendedor', 'ROLE_administrador')")
    public String createVenta(@RequestBody Venta vent) {
        ventServ.saveVenta(vent);
        return "Venta creada correctamente";
    }

    //obtener todas las ventas
    @GetMapping("/getall")
    @PreAuthorize("hasAnyRole('ROLE_vendedor', 'ROLE_administrador')")
    public List<Venta> getVentas() {
        return ventServ.getVentas();
    }


    //Modificar los datos de una venta
    @PutMapping("/edit")
    @PreAuthorize("hasAnyRole('ROLE_vendedor', 'ROLE_administrador')")
    public String editVenta(@RequestBody Venta vent) {
        ventServ.editVenta(vent);
        return "Venta editada correctamente";
    }


}
