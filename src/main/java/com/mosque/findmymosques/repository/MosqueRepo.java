package com.mosque.findmymosques.repository;
import com.mosque.findmymosques.datastructure.Mosque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface MosqueRepo extends JpaRepository<Mosque, Long> {
    List<Mosque> findByAreaId(Long id); // find the mosques by their area id

    // search feature return the mosque where it matches
    List<Mosque> findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(String name, String address);


}
