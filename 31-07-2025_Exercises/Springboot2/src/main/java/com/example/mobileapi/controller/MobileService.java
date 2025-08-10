package com.example.mobileapi.controller;
import com.example.mobileapi.dto.MobileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {
	private final MobileRepository mobileRepository;

    @Autowired
    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }
    public void addMobile(MobileDTO mobile) {
        System.out.println("Saving Mobile: ID=" + mobile.getId() +
                           ", Make=" + mobile.getMake() +
                           ", Model=" + mobile.getModelNumber() +
                           ", Price=" + mobile.getPrice());

        mobileRepository.save(mobile);
    }
    public List<MobileDTO> getAllMobiles() {
        return mobileRepository.findAll();
    }

}
