package com.thoughtworks.jigsaw.repo;

import com.thoughtworks.jigsaw.model.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {
}
