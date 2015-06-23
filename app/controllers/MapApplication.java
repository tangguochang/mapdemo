package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import play.data.*;
import models.*;

public class MapApplication extends Controller {

	static Form<MapPoint> mapPointForm = Form.form(MapPoint.class);
    
	public static Result maps() {
		//return TODO;
		return ok(views.html.map.render(MapPoint.all(), mapPointForm));
	}
public static Result newMapPoint() {
	Form<MapPoint> filledForm = mapPointForm.bindFromRequest();
  	if(filledForm.hasErrors()) {
    	return badRequest(
      		views.html.map.render(MapPoint.all(), filledForm)
    	);
  	} else {
    	MapPoint.create(filledForm.get());
    	return redirect(routes.MapApplication.maps());  
  	}
}

public static Result deleteMapPoint(Long id) {
		//return TODO;
		MapPoint.delete(id);
		return redirect(routes.MapApplication.maps());
}

}
