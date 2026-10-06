package com.example.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingmall.entity.Malladmin;
import com.example.shoppingmall.repository.MalladminRepo;

@Service
public class MalladminServ {

    @Autowired
    MalladminRepo mr;

    // Add
    public Malladmin addAdmin(Malladmin m) {
        return mr.save(m);
    }

    // Get all
    public List<Malladmin> getAllAdmin() {
        return mr.findAll();
    }

    // Update
    public Malladmin updateAdmin(Malladmin m) {
        return mr.save(m);
    }

    // Delete
    public String deleteAdmin(long id) {
        mr.deleteById(id);
        return "Malladmin deleted successfully";
    }
}