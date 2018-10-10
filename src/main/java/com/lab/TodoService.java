package com.lab;

import java.util.List;

//Create Todoservicestub
//Test TodoBusinessImpl using TodoServiceStub

// 2 main problems - DisAdv
// 1. Coding is huge chunks
// 2. Maintain is difficult

public interface TodoService {
	// External Service - Lets say this comes from WunderList
	public List<String> retrieveTodos(String user);
	
}
