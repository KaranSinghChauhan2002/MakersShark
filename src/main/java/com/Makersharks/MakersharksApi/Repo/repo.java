package com.Makersharks.MakersharksApi.Repo;

import com.Makersharks.MakersharksApi.Entity.supplier;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface repo extends MongoRepository<supplier, ObjectId> {
    Page<supplier> findByLocationAndNatureOfBusiness(String location, String natureOfBusiness, Pageable pageable);

}
