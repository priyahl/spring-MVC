package com.aruparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aruparking.model.ParkingFee;

public interface ParkingFeeRepository extends JpaRepository<ParkingFee, Long> {
	public ParkingFee findById(long id);
}
