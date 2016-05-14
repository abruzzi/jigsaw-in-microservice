package com.thoughtworks.jigsaw.repo;

import com.thoughtworks.jigsaw.model.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String>, PagingAndSortingRepository<Staff, String> {
    Staff findByLoginName(String loginName);
}
