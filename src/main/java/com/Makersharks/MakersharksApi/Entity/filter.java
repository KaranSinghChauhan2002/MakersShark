package com.Makersharks.MakersharksApi.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class filter {
    @NonNull
    private String location;
    @NonNull
    private String natureOfBusiness;
    @NonNull
    private List<String> manufacturingProcesses;
}
