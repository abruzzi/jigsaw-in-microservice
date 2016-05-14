package com.thoughtworks.jigsaw.controller;

import com.thoughtworks.jigsaw.repo.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/staffs")
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List fetchAll() {
        return staffRepository.findAll();
    }
}
