package com.webtintuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webtintuc.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
