package com.wiciu23.com.repository;

import com.wiciu23.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Paweł");
        speaker.setLastName("Witek");

        speakers.add(speaker);

        return speakers;
    }
}
