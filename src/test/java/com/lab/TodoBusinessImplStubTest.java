package com.lab;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.lab.business.TodoBusinessImpl;

public class TodoBusinessImplStubTest {

	@Test
	public void testretrieveTodosRelatedtoSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl impl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filterTodos = impl.retrieveTodosRelatedtoSpring("Dummy");
		assertEquals(2, filterTodos.size());
	}
	
	@Test
	public void testretrieveTodosRelatedtoSpring_usingAStub2() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl impl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filterTodos = impl.retrieveTodosRelatedtoSpring("Dummy");
		assertEquals(2, filterTodos.size());
	}
}
