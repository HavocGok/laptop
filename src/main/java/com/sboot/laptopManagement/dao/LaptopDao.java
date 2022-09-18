package com.sboot.laptopManagement.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sboot.laptopManagement.entity.Laptop;

public interface LaptopDao extends JpaRepository<Laptop,Integer>{

}
