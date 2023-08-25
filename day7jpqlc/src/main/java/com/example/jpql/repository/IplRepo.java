package com.example.jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpql.model.IplModel;

import jakarta.transaction.Transactional;

public interface IplRepo extends JpaRepository<IplModel, Integer> {
	//query1
	//native query
	//@Query(value="select * from IplModel", nativeQuery = true)
	//JPQL query
	@Query("select h from IplModel h")
	public List<IplModel> getAllRows();
	
	
	//query2
	//native query
	//@Query(value="select * from IplModel where address=:addr and playername=:name",nativeQuery = true )
	@Query("select h from IplModel h where h.address = :addr and h.playerName = :name")
	public List<IplModel> getSpecRows(@Param("addr") String addr,@Param("name") String name);
	
	
	//delete the query
	// query3
	@Modifying
	@Transactional
	//native query
	//@Query(value = "delete from IplModel where player_id = :id", nativeQuery = true)
	//JPQL query
	@Query("delete from IplModel h where h.playerId=:id")
	public int deletedId(@Param("id") int id);
	
	//query4

	@Modifying
	@Transactional
	//native query
	//@Query(value = "update IplModel set address = :addr where player_id = :id", nativeQuery = true)
	//JPQL query
	@Query("update IplModel h set h.address = :addr where h.playerId = :id")
	public Integer updateByid(@Param("addr") String sddr, @Param("id") int id);
	
	//query5
	
	// For Native SQL Query
	@Query(value = "select * from IplModel where playername like %?1%", nativeQuery = true)
	public List<IplModel> getBynameNative(String name);
	// For JPQL Query
	@Query("select h from IplModel h where h.playerName like %?1%")
	public List<IplModel> getBynameJPQL(String name);

	
	
}
