package app;

class NumberChecker {

    boolean isRightNumber(double number){
        if(!isTooLarge(number) && !isTooSmall(number) && !isNotDivisibileByThree(number)) {
            printSuccessMessage();
            return true;
        }
        else{
            printErrorMessage(number);
            return false;
        }
    }

    private void printSuccessMessage(){
        System.out.println("Twoja liczba jest ok. Naciśnij enter aby kontynuuować");
    }

    private void printErrorMessage(double number){
        if(isNotDivisibileByThree(number)) System.out.println("Liczba nie jest podzielna przez 3.");
        if(isTooLarge(number)) System.out.println("Liczba jest za duża.");
        else if(isTooSmall(number)) System.out.println("Liczba jest za mała.");
    }

    private boolean isTooLarge(double number){
        return number > 200;
    }

    private boolean isTooSmall(double number){
        return number < 100;
    }

    private boolean isNotDivisibileByThree(double number){
        return number % 3 != 0;
    }

}
