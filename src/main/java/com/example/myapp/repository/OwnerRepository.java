package com.example.myapp.repository;

/**
 * Created by Gudilin on 26.02.2024.
 */
import com.example.myapp.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
// Здесь можно добавить дополнительные методы для запросов к базе данных, если необходимо
}