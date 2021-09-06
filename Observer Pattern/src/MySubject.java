import java.util.ArrayList;
import java.util.List;
 

public class MySubject {
	
	private List<MyObsrver> observers = new ArrayList<MyObsrver>();
	   private int state;
	public List<MyObsrver> getObservers() {
		return observers;
	}
	public void setObservers(List<MyObsrver> observers) {
		this.observers = observers;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers(){
	      for (MyObsrver observer : observers) {
	         observer.update();
	      }
	   }
	public void attach(MyObsrver observer) {
		observers.add(observer);		
		
	} 	

}
