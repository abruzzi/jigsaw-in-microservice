package com.thoughtworks.jigsaw.controller;

import com.thoughtworks.jigsaw.repo.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/staffs")
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List fetchAll(
        @RequestParam(value = "page", defaultValue = "0", required = false) int page,
        @RequestParam(value = "count", defaultValue = "10", required = false) int count,
        @RequestParam(value = "order", defaultValue = "ASC", required = false) Sort.Direction direction,
        @RequestParam(value = "sort", defaultValue = "loginName", required = false) String loginName) {

        Page result = staffRepository.findAll(new PageRequest(page, count, new Sort(direction, loginName)));
        return result.getContent();
    }
}
