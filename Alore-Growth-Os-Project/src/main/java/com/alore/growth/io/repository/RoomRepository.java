package com.alore.growth.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alore.growth.io.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	
	
}

