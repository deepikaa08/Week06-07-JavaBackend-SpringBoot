package com.example.AddressBook.controller;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBookData;
import com.example.AddressBook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @PostMapping
    public ResponseEntity<AddressBookData> create(@RequestBody AddressBookDTO dto)
    {
        return ResponseEntity.ok(service.createEntry(dto));
    }

    @GetMapping
    public ResponseEntity<List<AddressBookData>> getAll()
    {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookData> update(@PathVariable int id, @RequestBody AddressBookDTO dto)
    {
        return ResponseEntity.ok(service.updateEntry(id,dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id)
    {
        service.deleteEntry(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
