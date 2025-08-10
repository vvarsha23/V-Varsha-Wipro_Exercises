package com.example.mobileapi.controller;
import com.example.mobileapi.dto.MobileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile")

public class MobileController {
	private final MobileService mobileService;

    @Autowired
    public MobileController(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    @PostMapping
    public String addMobile(@RequestBody MobileDTO mobile) {
        mobileService.addMobile(mobile);
        return "Mobile saved successfully!";
    }

    @GetMapping
    public List<MobileDTO> getAllMobiles() {
        return mobileService.getAllMobiles();
    }

}
