import java.util.Arrays;

public class CodigoS103 {

    public static void main(String[] args) {

        byte[] stream = new byte[1024];

        stream[0] = 123;
        stream[1] = 64;
        stream[2] = 55;
        // ...
        stream[1022] = 45;
        stream[1023] = 99;

        System.out.println(Arrays.toString(stream));

    }

}
