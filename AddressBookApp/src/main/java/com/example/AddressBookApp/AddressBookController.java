package com.example.AddressBookApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {
    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("GET: Address Book Data");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable int id) {
        return ResponseEntity.ok("GET: Address Book with ID " + id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody String data) {
        return ResponseEntity.ok("POST: Created Address Book Entry -> " + data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody String data) {
        return ResponseEntity.ok("PUT: Updated ID " + id + " with data -> " + data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok("DELETE: Address Book Entry with ID " + id + " deleted");
    }
}
