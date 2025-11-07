package com.pavel.autostock.controller.impl;

import com.pavel.autostock.controller.CrudControllerI;
import com.pavel.autostock.domain.dto.request.SellRequest;
import com.pavel.autostock.domain.dto.request.TestDriveRequest;
import com.pavel.autostock.service.impl.TestDriveServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/testdrive")
@RequiredArgsConstructor
public class TestDriveController implements CrudControllerI<TestDriveRequest, Long> {
    private final TestDriveServiceImpl testDriveService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(testDriveService.getAll());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody TestDriveRequest req) {
        try {
            return ResponseEntity.ok(testDriveService.add(req));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping("/change/{id}")
    public ResponseEntity<?> change(@PathVariable Long id, @RequestBody TestDriveRequest req) {
        try {
            return ResponseEntity.ok(testDriveService.change(id, req));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            testDriveService.delete(id);
            return ResponseEntity.ok("Success deleted");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
