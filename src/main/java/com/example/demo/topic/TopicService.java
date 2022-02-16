package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
   @Autowired 
	private TopicRepository topicRepository;
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			 
			new Topic("sadiya","kazi","jkrwOOOJXNMN"),	
			new Topic("sadiya","kazi","jkrwOOOJXNMN"),
			new Topic("sadiya","kazi","jkrwOOOJXNMN")
			
			
			)); */
	
	public List<Topic> getAlltopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	



	




	public Topic gettopic(String id) {
		// TODO Auto-generated method stub
		return topicRepository.findOne(id);
		
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	
	}

	public void  addtopic(Topic topic) {
		// TODO Auto-generated method stub
		 topicRepository.save(topic);
		//topics.add(topic);
		
		
		
		
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		
		
		/*for(int i =0 ; i<topics.size();i++) {
			Topic t = topics.get(i);
			
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return; 
			}
			
			
		} */
		
		topicRepository.save(topic);
		
	}
	
	public void deleteTopic(String id) {
		
		topicRepository.delete(id);;
		
		
	}
}
