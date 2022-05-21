package com.asgm.MedicalRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalRecordController {
    @Autowired
    private MedicalRecordHardcodedService medicalRecordHardcodedService;

    @GetMapping("/records")
    public List<MedicalRecord> getAllRecords() {
        return medicalRecordHardcodedService.findAll();
    }

    @GetMapping("/patients/{id}/record")
    public MedicalRecord getPatientRecord(@PathVariable String id) {
        return medicalRecordHardcodedService.findById(id);
    }


}
