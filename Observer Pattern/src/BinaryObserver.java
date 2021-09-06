public class BinaryObserver extends MyObsrver{

		   public BinaryObserver(MySubject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Binary value: " + Integer.toBinaryString( subject.getState() ) ); 
		   }
		}
 
