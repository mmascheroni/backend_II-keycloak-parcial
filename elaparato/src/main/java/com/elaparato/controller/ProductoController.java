package com.elaparato.controller;
import com.elaparato.model.Producto;
import com.elaparato.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService prodServ;

    //crear un nuevo producto
    @PostMapping("/create")
    @PreAuthorize("hasAnyRole('ROLE_repositor', 'ROLE_administrador')")
    public String createProducto(@RequestBody Producto prod) {
        prodServ.saveProducto(prod);
        return "Producto creado correctamente";
    }

    //obtener todos los productos
    @GetMapping("/getall")
    @PreAuthorize("hasAnyRole('ROLE_repositor', 'ROLE_administrador')")
    public List<Producto> getProductos() {
        return prodServ.getProductos();
    }

   //Modificar los datos de un producto
    @PutMapping("/edit")
    @PreAuthorize("hasAnyRole('ROLE_repositor', 'ROLE_administrador')")
    public String editProducto(@RequestBody Producto prod) {
        prodServ.editProducto(prod);
        return "Producto editado correctamente";
    }
}
