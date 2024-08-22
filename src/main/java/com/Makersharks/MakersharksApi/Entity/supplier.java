package com.Makersharks.MakersharksApi.Entity;


import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
@ToString
public class supplier {
    @Id
    private ObjectId id;
    private String supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private List<String> manufacturingProcesses;
}
