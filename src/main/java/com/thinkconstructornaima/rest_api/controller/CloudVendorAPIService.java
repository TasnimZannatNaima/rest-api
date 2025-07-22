package com.thinkconstructornaima.rest_api.controller;

import com.thinkconstructornaima.rest_api.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return cloudVendor;
        //new CloudVendor("N1","Naima","Gazipur","01624989480");
    }

    @PostMapping
    public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor Deleted";
    }
}
