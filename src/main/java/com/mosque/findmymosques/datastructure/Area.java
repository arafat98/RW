package com.mosque.findmymosques.datastructure;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "area") //table name area in the databse

public class Area {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // cannont be null name of the area

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    @JsonIgnore // this ignores this field during serialisation
    private List<Mosque> mosques;

    public Area(){

    }
    public Area(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Mosque> getMosques() {
        return mosques;
    }
    public void setMosques(List<Mosque> mosques) {
        this.mosques = mosques;
    }



}
