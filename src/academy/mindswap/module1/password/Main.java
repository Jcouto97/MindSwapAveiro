package academy.mindswap.module1.password;

public class Main {

    public static void main(String[] args) {
        String lowCase = "abcdefghijklmnopqrstuvxyz";
        String upCase = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String numbers = "0123456789";
        String specialChar = "£$&()*+[]@#^-_!?";

        String lowCaseSplit[] = lowCase.split("");
        String upCaseSplit[] = upCase.split("");
        String numbersSplit[] = numbers.split("");
        String specialCharSplit[] = specialChar.split("");

        //criar booleans para ter a certeza que existem todos os tipos

        boolean usedLow = false;
        boolean usedUp = false;
        boolean usedNumbers = false;
        boolean usedChar = false;


        int passLength = 8;
        int sets = 4;
        int chooseType;
        int rand;
        String password = "";

        for (int i = 0; i < passLength; i++) {
            chooseType = (int) (Math.random() * sets) + 1;

            if(usedLow == false){
                chooseType = 1;
            }else if(usedUp == false){
                chooseType = 2;
            }else if(usedNumbers == false){
                chooseType = 3;
            }else if(!usedChar ){
                chooseType = 4;
            }

            switch (chooseType) {
                case 1:
                    rand = (int) (Math.random() * lowCaseSplit.length);
                    password = password + lowCaseSplit[rand];
                    usedLow = true;
                    break;
                case 2:
                    rand = (int) (Math.random() * upCaseSplit.length);
                    password = password + upCaseSplit[rand];
                    usedUp = true;
                    break;
                case 3:
                    rand = (int) (Math.random() * numbersSplit.length);
                    password = password + numbersSplit[rand];
                    usedNumbers = true;
                    break;
                case 4:
                    rand = (int) (Math.random() * specialCharSplit.length);
                    password = password + specialCharSplit[rand];
                    usedChar = true;
                    break;
            }
        }

        //randomizar array

        String randArr[] = password.split("");

        for(int i= 0; i<randArr.length; i++){
            int randomizer = (int)(Math.random() * randArr.length);

            String temp = randArr[i];
            randArr[i] = randArr[randomizer];
            randArr[randomizer] = temp;

        }

        //passar para string

        String randPass = "";

        for(int i=0; i<randArr.length; i++){
            randPass+= randArr[i];
        }
        System.out.println(randPass);
    }
}
