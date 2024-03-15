package lesson8;

public class Packer {
    public boolean canPack (int bigPack, int smallPack, int totalWeight) {
        /*
         * find total given packs
         * find total required packs
         * compare given and required packs
         * */

        int bigPackSize = 5; //kgs
        int smallPackSize = 1; //kg

        int requiredBigPack = totalWeight / bigPackSize; // 12 / 5 = 2
        int requiredSmallPack = (totalWeight %  bigPackSize) / smallPackSize; // 12 % 5 / 1 = 2

        int totalRequiredPack = requiredSmallPack + requiredBigPack;
        int totalGivenPack = bigPack + smallPack;
        boolean success = true;

        if (bigPack < 0 || smallPack < 0 || totalWeight < 0){
            return !success;
        } else if (totalGivenPack < totalRequiredPack) {
            return !success;
        }
        return success;

//        Solution with ternary operator.

//        return (bigPack < 0 || smallPack < 0 || totalWeight < 0) ? !success :
//                (totalGivenPack < totalNeededPack) != success;

    }
}
