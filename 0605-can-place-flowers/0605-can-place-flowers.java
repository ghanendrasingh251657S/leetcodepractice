class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        boolean a = true;
        int want = n;

        for(int i = 0; i < flowerbed.length; i++) {

            if(flowerbed[i] == 0) {

                if((i == 0 || flowerbed[i - 1] == 0) &&
                   (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        int need = count;

        if(want <= need) {
            a = true;
        } else {
            a = false;
        }

        return a;
    }
}