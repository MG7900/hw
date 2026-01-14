public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }

    public Loops(){

        countUp();
        countByThrees();
        countDown();
        nestedLoop();
    }

    public void countUp(){
        for(int i=1; i < 6; i++){
            System.out.println(i);
        }
    }

    public void countByThrees(){
        for(int i=3; i < 16; i = i+3){
            System.out.print(i);
        }
    }

    public void countDown(){
        for(int i=10; i > 0; i = --i){
            System.out.print(i + ", ");
        }
        System.out.println("Happy Loop Year!");
    }

    public void nestedLoop(){

        for(int i=1; i<6; i++){
            System.out.println();
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
        }
    }


}
