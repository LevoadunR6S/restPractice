package com.example.rest.controller;

import com.example.rest.model.CloudVendor;
import com.example.rest.response.ResponseHandler;
import com.example.rest.service.CloudVendorService;
import com.example.rest.service.impl.CloudVendorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
@AllArgsConstructor
public class CloudVendorApiController {

    CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable String vendorId) {
       return ResponseHandler.responseBuilder(
                "Requested Cloud Vendor Details are give here",
                HttpStatus.OK,
                cloudVendorService.getCloudVendor(vendorId));
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorsDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully";
    }
}
