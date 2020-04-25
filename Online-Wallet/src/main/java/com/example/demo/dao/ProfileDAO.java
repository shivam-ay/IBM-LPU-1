package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProfileDTO;
import com.example.demo.entity.Profile;

@Repository(value = "profileDAO")
public interface ProfileDAO extends CrudRepository<Profile,Integer>
{
	@Query
	public Optional<ProfileDTO> findByPhoneNumber(long phoneNumber);
}
