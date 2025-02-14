package com.mosque.findmymosques.logic;
import com.mosque.findmymosques.datastructure.Mosque;
import com.mosque.findmymosques.repository.MosqueRepo;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class MosqueLogic {
    private final MosqueRepo mosqueRepo;


    public MosqueLogic(MosqueRepo mosqueRepo) {
        this.mosqueRepo = mosqueRepo;

    }

    public List<Mosque> getAllMosques() {
        return mosqueRepo.findAll();
    }

    public Mosque saveMosque(Mosque mosque) {
        return mosqueRepo.save(mosque);
    }

}
