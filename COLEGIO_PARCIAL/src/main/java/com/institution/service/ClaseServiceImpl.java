package com.institution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institution.repository.ClaseRepository;

import Clase.Clase;

@Service
public class ClaseServiceImpl implements ClaseService {

    @Autowired
    private ClaseRepository claseRepository;

    @Override
    public List<Clase> getAllClases() {
        return claseRepository.findAll();
    }

    @Override
    public Clase getClaseById(Long id) {
        return claseRepository.findById(id).orElse(null);
    }

    @Override
    public Clase saveClase(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public void deleteClase(Long id) {
        claseRepository.deleteById(id);
    }
}

