package com.letscode.MicrosserviceHarryPotter.payloads;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class CasaResponse {
    private String id;
    private String name;
    private String animal;
    private String founder;
    private String values;
}
