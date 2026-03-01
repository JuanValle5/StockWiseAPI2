package com.JuanValencia.StockWiseAPI.repository;

import com.JuanValencia.StockWiseAPI.model.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovementRepository extends JpaRepository<StockMovement,Long> { }
