package lesson8;

public class Packer {
    public boolean canPack (int bigPack, int smallPack, int totalWeight) {
        /*
         * find total given packs
         * find total required packs
         * compare given and required packs
         * */

        int bigPackSize = 5;
        int smallPackSize = 1;

        int needBigPack = totalWeight / bigPackSize;
        int needSmallPack = totalWeight %  5 / smallPackSize;

        int totalNeededPack = needSmallPack + needBigPack;
        int totalGivenPack = bigPack + smallPack;
        boolean success = true;

        if (bigPack < 0 || smallPack < 0 || totalWeight < 0){
            return !success;
        } else if (totalGivenPack < totalNeededPack) {
            return !success;
        }
        return success;

//        Solution with ternary operator

//        return (bigPack < 0 || smallPack < 0 || totalWeight < 0) ? !success :
//                (totalGivenPack < totalNeededPack) != success;
    }
}
