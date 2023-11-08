package at.ac.htl;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        
    }

    public int getSum() {
        return IntStream.rangeClosed(1, 10).map(n -> n * n).sum();
    }
}
