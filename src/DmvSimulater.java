
public class DmvSimulater {
    public static void main(String[] args) throws InterruptedException {

        int waitTime = (int)(100 * Math.random() + 1);

        System.out.println("Your call number is " + waitTime + ". Please wait your turn patiently.");

        int counter = waitTime;
        do{
            counter++;
            
            System.out.println("Now serving: " + counter);

            if (counter == 100){
                counter = 0;

            }
            Thread.sleep(100);
        }while (counter != waitTime);

        System.out.println("Hello and welcome to the DMV. Can I please see your forms and required information?");
        System.out.println("Don't care.");

    }
}
