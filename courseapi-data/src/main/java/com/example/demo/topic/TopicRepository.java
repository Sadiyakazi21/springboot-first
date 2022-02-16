package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

	void delete(String id);

	Topic findOne(String id);




}
