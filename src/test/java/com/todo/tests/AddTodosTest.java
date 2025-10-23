package com.todo.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todo.page.TodosPage;
import com.todo.utils.Setup;

public class AddTodosTest extends Setup{

	public AddTodosTest() throws IOException {
		super();


	}
	
	TodosPage todosPage;
	
	@Test(priority = 1)
	public void iAddTodos() throws IOException {
		todosPage = new TodosPage();
		
		//step1
		boolean fieldTodo = todosPage.isElementDisplayed(TodosPage.inputField);
	    Assert.assertTrue(fieldTodo);
	    
		//step2
		todosPage.submitTodo(prop.getProperty("todos1"));
		
		//step3
		String todoText = todosPage.checkElementContain(TodosPage.textTodo);
		Assert.assertTrue(todoText.contains(prop.getProperty("todos1")));
		
		//step4
		boolean box = todosPage.isElementSelected(TodosPage.checkbox);
		Assert.assertFalse(box);
	}
	

}
