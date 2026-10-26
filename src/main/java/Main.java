// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++){
      if(i/2==0){
         System.out.println(i);
        i = i + 1;
      }
      else{
        i = i + 1;
      }
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}