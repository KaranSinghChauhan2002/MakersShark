package com.Makersharks.MakersharksApi.Service;

import com.Makersharks.MakersharksApi.Entity.supplier;
import com.Makersharks.MakersharksApi.Repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Component
public class supplierService {
    @Autowired
    private repo repo;

    public List<supplier> getAll() {
        return repo.findAll();
    }

    public Page<supplier> filter(String location, String natureOfBusiness, List<String> manufacturingProcesses, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<supplier> initialPage = repo.findByLocationAndNatureOfBusiness(location, natureOfBusiness, pageable);

        List<supplier> filteredList = new ArrayList<>();
        for (supplier supplier : initialPage.getContent()) {
            if (new HashSet<>(supplier.getManufacturingProcesses()).containsAll(manufacturingProcesses)) {
                filteredList.add(supplier);
            }
        }

        return new PageImpl<>(filteredList, pageable, initialPage.getTotalElements());
    }
}
