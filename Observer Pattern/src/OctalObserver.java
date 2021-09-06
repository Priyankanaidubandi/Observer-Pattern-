
public class OctalObserver extends MyObsrver {
	
	public OctalObserver(MySubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	@Override
	protected void update() {
		 
		System.out.println( "Octal Value: " + Integer.toOctalString( subject.getState() ) ); 
	}

}
