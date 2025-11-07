package com.pavel.autostock.controller.impl;

import com.pavel.autostock.controller.CrudControllerI;
import com.pavel.autostock.domain.dto.request.PaymentRequest;
import com.pavel.autostock.service.impl.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api/v1/payment")
@RequiredArgsConstructor
public class PaymentController implements CrudControllerI<PaymentRequest, Long> {
    private final PaymentServiceImpl paymentService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(paymentService.getAll());
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody PaymentRequest req) {
        try {
            return ResponseEntity.ok(paymentService.add(req));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping("/change/{id}")
    public ResponseEntity<?> change(@PathVariable Long id, @RequestBody PaymentRequest req) {
        try {
            return ResponseEntity.ok(paymentService.change(id, req));
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            paymentService.delete(id);
            return ResponseEntity.ok("Success deleted");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
