package com.example.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	
	
	@RequestMapping("/topics")
	public List<Topic> getAlltopics() {
		
		return topicservice.getAlltopics();
	}
	
	 @RequestMapping("topics/{id}")
	 public Topic gettopic(@PathVariable String id) {
		 return topicservice.gettopic(id);
	 }
	 
	 @RequestMapping(method=RequestMethod.POST, value = "/topics")
		 public void addtopic(@RequestBody Topic topic ){
			 topicservice.addtopic(topic); 
		 }
	 
	 @RequestMapping(method=RequestMethod.PUT, value = "topics/{id}")
		 public void updatetopic(@RequestBody Topic topic ,@PathVariable String id) {
			 topicservice.updateTopic(id,topic);
		 }
	 }

