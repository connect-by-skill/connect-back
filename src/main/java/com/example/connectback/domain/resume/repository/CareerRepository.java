package com.example.connectback.domain.resume.repository;

import com.example.connectback.domain.resume.entity.Career;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerRepository extends JpaRepository<Career, Long> {
}
