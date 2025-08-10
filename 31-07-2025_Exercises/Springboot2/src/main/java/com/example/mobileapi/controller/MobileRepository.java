package com.example.mobileapi.controller;
import com.example.mobileapi.dto.MobileDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MobileRepository {
	private final List<MobileDTO> mobileList = new ArrayList<>();

    public void save(MobileDTO mobile) {
        mobileList.add(mobile);
    }
    public List<MobileDTO> findAll() {
        return mobileList;
    }


}
