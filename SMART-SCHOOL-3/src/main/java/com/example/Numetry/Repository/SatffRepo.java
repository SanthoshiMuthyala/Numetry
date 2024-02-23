package com.example.Numetry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Numetry.Entity.Staff;

@Repository
public interface SatffRepo extends JpaRepository<Staff, Long> {

}
