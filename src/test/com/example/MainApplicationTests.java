public class MainApplicationTests{

    public static void shouldEqual() throws Exception {
       if(!(1==2+2)) throw new Exception("test failed!");
    }

    public static void main(String Args[]) throws Exception {
        shouldEqual();
    }

}