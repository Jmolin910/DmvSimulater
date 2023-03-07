
public class DmvSimulater {
    public static void main(String[] args) throws InterruptedException {

        int waitTime = (int)(200 * Math.random() + 1);

        System.out.println("Your call number is " + waitTime + ". Please wait your turn patiently.");

        int counter = waitTime;
        do{
            counter++;
            
            System.out.println("Now serving: " + counter);

            if (counter == 200){
                counter = 0;

            }
            Thread.sleep(100);
        }while (counter != waitTime);

        System.out.println("Hello and welcome to the DMV. Can i please see your completed forms and required information?");
        System.out.println("Sorry this is not the correct information please come back when you have it all.");

    }
}
