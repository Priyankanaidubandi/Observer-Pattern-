
public class MainTestdemo {
   public static void main(String[] args) {
      MySubject subject = new MySubject();

      
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 05");	
      subject.setState(05);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}
