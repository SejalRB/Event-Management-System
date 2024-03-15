package com.example.geeks.repository;

import com.example.geeks.entity.UserInfo; 
import com.example.geeks.service.UserInfoService;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import java.util.Optional; 

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> 
{ 
	Optional<UserInfo> findByName(String username); 
}
