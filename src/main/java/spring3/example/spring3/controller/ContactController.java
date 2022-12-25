package spring3.example.spring3.controller;

import lombok.AllArgsConstructor;
import spring3.example.spring3.entity.Contact;
import spring3.example.spring3.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contacts")
@AllArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;

    @GetMapping
    public List<Contact> listContacts() {
        return  contactRepository.findAll();
    }
}
