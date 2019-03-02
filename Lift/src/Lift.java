public class  Lift {
    int startFloor = 1;
    int finishFloor = 9;
    int actualFloor = 1;
    boolean liftRun = false;
    boolean doorClosed = false;

    public void pressButton(int num){
        if (!(num >= startFloor && num <= finishFloor)){
            System.out.println("Такого этажа нет");
            return;
        }
        int direction = 1;
        if(num < actualFloor){
            direction = -1;
        }
        doorClosed = true;
        liftRun = true;

        while (Math.abs(num = actualFloor) > 0){
            actualFloor += direction;
            System.out.println("Этаж номер" + actualFlor);
        }
        liftRun = false;
        doorClosed = false;
    }
}
