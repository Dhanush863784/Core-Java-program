package com.example.shoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingmall.entity.Malladmin;
import com.example.shoppingmall.service.MalladminServ;

@RestController
public class ShoppingMallCont {

    @Autowired
    MalladminServ ms;

    @PostMapping("/save")
    public Malladmin addAdmin(@RequestBody Malladmin m) {
        return ms.addAdmin(m);
    }

    @GetMapping("/alladmin")
    public List<Malladmin> getAllAdmin() {
        return ms.getAllAdmin();
    }

    @PutMapping("/update")
    public Malladmin updateAdmin(@RequestBody Malladmin m) {
        return ms.updateAdmin(m);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable long id) {
        return ms.deleteAdmin(id);
    }
}