public class Test {
    
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int a = 5; 
        int b = 10;
        for(int i = 0; i < 10; i++) {
            a = i + a* b;
        }
        System.out.println(a);
    }
}
