package com.Makersharks.MakersharksApi.Controllers;

import com.Makersharks.MakersharksApi.Entity.filter;
import com.Makersharks.MakersharksApi.Entity.supplier;
import com.Makersharks.MakersharksApi.Service.supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierAPI {
    @Autowired
    private supplierService service;

    @GetMapping
    public List<supplier> getAll(){
        return service.getAll();
    }
    @PostMapping("/query")
    public Page<supplier> filter(@RequestBody filter data,
                                 @RequestParam(defaultValue = "0") int pageNumber,
                                 @RequestParam(defaultValue = "1") int pageSize) {
        return service.filter(data.getLocation(), data.getNatureOfBusiness(), data.getManufacturingProcesses(), pageNumber, pageSize);
    }
}
