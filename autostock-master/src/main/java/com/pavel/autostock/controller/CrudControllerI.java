package com.pavel.autostock.controller;

import org.springframework.http.ResponseEntity;

public interface CrudControllerI<REQ, ID> {
    ResponseEntity<?> getAll();
    ResponseEntity<?> add(REQ req);
    ResponseEntity<?> change(ID id, REQ req);
    ResponseEntity<?> delete(ID id);

}
