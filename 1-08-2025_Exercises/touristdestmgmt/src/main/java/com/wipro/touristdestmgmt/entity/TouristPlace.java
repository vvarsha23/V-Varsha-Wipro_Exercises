package com.wipro.touristdestmgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tourist_place")
public class TouristPlace {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="tourist_place_name")
	String toristPlaceName;
	
	@Column(name="tourist_place_state")
	String toristPlaceState;
	
	@Column(name="tourist_place_type")
	String toristPlaceType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToristPlaceName() {
		return toristPlaceName;
	}

	public void setToristPlaceName(String toristPlaceName) {
		this.toristPlaceName = toristPlaceName;
	}

	public String getToristPlaceState() {
		return toristPlaceState;
	}

	public void setToristPlaceState(String toristPlaceState) {
		this.toristPlaceState = toristPlaceState;
	}

	public String getToristPlaceType() {
		return toristPlaceType;
	}

	public void setToristPlaceType(String toristPlaceType) {
		this.toristPlaceType = toristPlaceType;
	}

	@Override
	public String toString() {
		return "TouristPlace [id=" + id + ", toristPlaceName=" + toristPlaceName + ", toristPlaceState="
				+ toristPlaceState + ", toristPlaceType=" + toristPlaceType + "]";
	}
	
	
	

}
