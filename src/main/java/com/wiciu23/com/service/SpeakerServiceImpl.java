package com.wiciu23.com.service;

import com.wiciu23.Speaker;
import com.wiciu23.com.repository.HibernateSpeakerRepositoryImpl;
import com.wiciu23.com.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
