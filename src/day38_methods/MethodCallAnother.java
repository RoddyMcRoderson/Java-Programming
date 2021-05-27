package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();
    }
    public static void start(){
            System.out.println("start");
            continues();
        }
        public static void continues(){
            System.out.println("continues");
            end();
        }
        public static void end(){
            System.out.println("end");
        }
        public static void Num(int num) {
            System.out.println(num + " ");
            num++;
            if (num <= 100){
                Num(num);
            }
        }
    }

