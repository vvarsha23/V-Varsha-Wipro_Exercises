package com.wipro.touristdestmgmt.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.touristdestmgmt.entity.TouristPlace;
@Repository
public interface TouristPlaceRepo extends JpaRepository<TouristPlace, Integer> {
   List<TouristPlace> findByToristPlaceTypeOrderByToristPlaceNameDesc(String toristPlaceType);
   
   List<TouristPlace> findByToristPlaceTypeAndToristPlaceStateOrderByToristPlaceNameDesc(String toristPlaceType,String toristPlaceState);

   Page<TouristPlace>  findAll(Pageable p); 


}
