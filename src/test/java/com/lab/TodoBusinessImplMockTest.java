package com.lab;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.lab.business.TodoBusinessImpl;

public class TodoBusinessImplMockTest {
	
	//What is Mocking?
	// Mocking is creating objects that simulate the behaviour of real objects,
	// Unlike stub, mocks can be dynamically created from code at runtime.
	// Mocks offer more functionality than stubbing.
	// You can verify method calls and a lot of other things.
	
	
	//Dynamic behaviour
	//
	
	@Test
	public void testretrieveTodosRelatedtoSpring_usingAMock() {
		
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
		
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		
		TodoBusinessImpl impl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filterTodos = impl.retrieveTodosRelatedtoSpring("Dummy");
		assertEquals(0, filterTodos.size());
	} 
	
	@Test
	public void usingMockito() {
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedtoSpring("Ranga");
		assertEquals(2, todos.size());
	}
}
