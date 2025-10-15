class World extends Thread {
    @Override
    public void run() {
        for(; ; ){
            System.out.println("world");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Test {
    public static void main(String[] args){
        World world = new World();
        world.start();
        for(int i=1;i<11 ;i++ ){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}