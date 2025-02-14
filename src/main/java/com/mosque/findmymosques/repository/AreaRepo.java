package com.mosque.findmymosques.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mosque.findmymosques.datastructure.Area;

@Repository

public interface AreaRepo extends JpaRepository<Area, Long> {
}
