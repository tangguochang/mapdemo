package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;
@Entity
public class MapPoint extends Model{
  
  @Id
  public Long id;
  //@Required
  public String label;
  //@Required
  public String longitude;
  //@Required
  public String latitude;
  //@Required
  public String info;
  public static Finder<Long,MapPoint> find = new Finder(Long.class, MapPoint.class);
  public static List<MapPoint> all() {
	return find.all();
  }
  
  public static void create(MapPoint point) {
  	  point.save();
  }
  
  public static void delete(Long id) {
  	  find.ref(id).delete();
  }
    
}