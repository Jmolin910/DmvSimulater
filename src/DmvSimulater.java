
public class DmvSimulater {
    public static void main(String[] args) throws InterruptedException {

        int waitTime = (int)(200 * Math.random() + 1);
        int miracle = (int)(100 * Math.random());

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

        if (miracle == 83)
        {
            System.out.println("Its your lucky day! you have all your paper work, your request will be processed in about a week.");
        }
        else
        {
            System.out.println("Hello and welcome to the DMV. Can I please see your forms and required information?");
            System.out.println("Don't care.");
        }

    }
}
