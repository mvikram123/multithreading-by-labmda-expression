// Normal method
//class MyRunnable implements Runnable{
//
//    public void run(){
//
//        for(int i=0; i<10; i++){
//
//            System.out.println("child thread");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        MyRunnable r=new MyRunnable();
//        Thread t =new Thread(r);
//        t.start();
//        for(int i=0; i<10; i++){
//            System.out.println("Main thread");
//
//        }
//
//    }
//}



// by lambda expression , we don't need to implement Runnable interface its implemented by compiler automatically


public class Main{
    public static void main(String args[]){

        Runnable r=()->{
            for(int i=0; i<10; i++){
                System.out.println("child thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=0; i<10; i++){
            System.out.println("main thread");
        }

    }

        }



        // out will come randomly because two thread run simultaneously like main thread
     //   main thread
//main thread
//main thread
//main thread
//main thread
//main thread
//main thread
//main thread
//main thread
//main thread
//child thread
//child thread
//child thread
//child thread
//child thread
//child thread

