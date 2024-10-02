import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f=(n)->{
            int fact=1, i;
            for(i=1;i<=n;i++)
              fact=fact*i;
             return fact;
        };
        
        System.out.println(f.apply(3));

	}

}
