package com.carproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carproject.model.car;

public interface carRepositroy extends JpaRepository<car, Integer> {

}
