package com.mosque.findmymosques.controller;
import java.util.List;
import com.mosque.findmymosques.datastructure.Mosque;
import com.mosque.findmymosques.logic.MosqueLogic;
import com.mosque.findmymosques.repository.MosqueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MosqueController {

    @Autowired //using to acces the databse
    private MosqueRepo mosqueRepo;


    @GetMapping("/")
    public String getMosques(@RequestParam(value = "q",required = false)String query, Model model) {
        List<Mosque> mosques = mosqueRepo.findAll(); // shows all the mosques
        List<Mosque> searchedMosques; // queried search
        //if search then show filtered results
        if (query != null && !query.trim().isEmpty()) {
            searchedMosques = mosqueRepo.findByNameContainingIgnoreCaseOrAddressContainingIgnoreCase(query, query);
            model.addAttribute("q", query);
        } else {
            searchedMosques = mosques;

        }
        model.addAttribute("mosques", searchedMosques);
        //model.addAttribute("mosques", mosques);
        return "index";
    }
}

