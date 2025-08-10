package com.wipro.touristdestmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.touristdestmgmt.entity.TouristPlace;
import com.wipro.touristdestmgmt.service.TouristPlaceService;

@RestController
@RequestMapping("/touristplace")
public class TouristPlaceController {
	@Autowired
	TouristPlaceService touristPlaceService;
	
	@PostMapping
	void save(@RequestBody TouristPlace touristPlace)
	{
		touristPlaceService.save(touristPlace);
	}
	
	@GetMapping
	List<TouristPlace> findAll()
	{
		return touristPlaceService.findAll();
		
	}
	
//	@GetMapping("/p")
//	Page<TouristPlace> findAllPage()
//	{
//		Pageable p= PageRequest.of(0, 10, Sort.by("toristPlaceType").ascending());
//		System.out.println(p.getPageSize());
//		return touristPlaceService.findAll(p);
//		
//	}
	
	
	@GetMapping("/{id}")
	TouristPlace findById(@PathVariable int id)
	{
		return touristPlaceService.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody TouristPlace touristPlace)
	{
		  touristPlaceService.save(touristPlace);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		  touristPlaceService.deleteById(id);
		
	}
	
	@GetMapping("/type")
	List<TouristPlace> findByToristPlaceType(@RequestParam String toristPlaceType)
	{
		return touristPlaceService.findByToristPlaceTypeOrderByToristPlaceNameDesc(toristPlaceType);
		
	}
	@GetMapping("/typepath/{path}")
	List<TouristPlace> findByToristPlaceTypePath(@PathVariable String path)
	{
		return touristPlaceService.findByToristPlaceTypeOrderByToristPlaceNameDesc(path);
		
	}
	
	@GetMapping("/typepath/{type}/{state}")
	List<TouristPlace> findByToristPlaceTypePath(@PathVariable String type,@PathVariable String state)
	{
		return touristPlaceService.findByToristPlaceTypeAndToristPlaceStateOrderByToristPlaceNameDesc(type, state);
		
	}
	@GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
	public Page<TouristPlace> findAllPage(@PathVariable int  pageNum,@PathVariable int  pageSize,@PathVariable int  sortOrder) {
		Pageable p=null;
	  if(sortOrder==0)
	  {
		  p=PageRequest.of(pageNum, pageSize,Sort.by("toristPlaceState").descending());
	  }
	  else
	  {
		    p=PageRequest.of(pageNum, pageSize,Sort.by("toristPlaceState").ascending());
	  }
		
		return touristPlaceService.findAll(p);
	}
 

}
