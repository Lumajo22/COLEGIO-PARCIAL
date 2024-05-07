package com.institution.service;

import java.util.List;

import Clase.Clase;

public interface ClaseService {
	List<Clase> getAllClases();
    Clase getClaseById(Long id);
    Clase saveClase(Clase clase);
    void deleteClase(Long id);
}
