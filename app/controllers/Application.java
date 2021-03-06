package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import play.data.*;
import models.*;

public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
public static Result tasks() {
		return ok(views.html.list.render(Task.all(), taskForm));
}
public static Result newTask() {
	Form<Task> filledForm = taskForm.bindFromRequest();
	if(filledForm.hasErrors()) {
		return badRequest(
				views.html.list.render(Task.all(), filledForm)
				);
	} else {
		Task.create(filledForm.get());
		return redirect(routes.Application.tasks());  
  }
}

public static Result deleteTask(Long id) {
		//return TODO;
		Task.delete(id);
		return redirect(routes.Application.tasks());
}

}
