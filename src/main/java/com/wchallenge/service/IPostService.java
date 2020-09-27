package com.wchallenge.service;

import java.util.List;

import com.wchallenge.model.PostModel;

public interface IPostService {
	
	public List<PostModel> getAll();
	public List<PostModel> findByUser(long id);

}
