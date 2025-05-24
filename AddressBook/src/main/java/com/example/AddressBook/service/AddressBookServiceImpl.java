package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBookData;
import com.example.AddressBook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Override
    public AddressBookData createEntry(AddressBookDTO dto)
    {
        AddressBookData data = new AddressBookData();
        data.setName(dto.getName());
        data.setCity(dto.getCity());
        data.setState(dto.getState());
        data.setPhone(dto.getPhone());
        return repository.save(data);
    }

    @Override
    public AddressBookData updateEntry(int id, AddressBookDTO dto)
    {
        AddressBookData data = repository.findById(id).orElseThrow();
        data.setName(dto.getName());
        data.setCity(dto.getCity());
        data.setState(dto.getState());
        data.setPhone(dto.getPhone());
        return repository.save(data);
    }

    @Override
    public AddressBookData getEntry(int id)
    {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<AddressBookData> getAll()
    {
        return repository.findAll();
    }

    @Override
    public void deleteEntry(int id)
    {
        repository.deleteById(id);
    }
}
