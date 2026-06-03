package com.geovigil.repository;

import com.geovigil.model.Satelite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SateliteRepository extends JpaRepository<Satelite, Long> {
}