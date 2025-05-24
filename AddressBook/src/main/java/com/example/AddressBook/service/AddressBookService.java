package com.example.AddressBook.service;


import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBookData;

import java.util.List;

public interface AddressBookService {
    AddressBookData createEntry(AddressBookDTO dto);
    AddressBookData updateEntry(int id, AddressBookDTO dto);
    AddressBookData getEntry(int id);
    List<AddressBookData>  getAll();
    void deleteEntry(int id);
}
