class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i = 0;
        int j = plants.length - 1;

        int waterA = capacityA;
        int waterB = capacityB;

        int count = 0;

        while (i < j) {

            // Alice waters from the left
            if (waterA < plants[i]) {
                waterA = capacityA;
                count++;
            }
            waterA -= plants[i];
            i++;

            // Bob waters from the right
            if (waterB < plants[j]) {
                waterB = capacityB;
                count++;
            }
            waterB -= plants[j];
            j--;
        }

        // Both reached the same plant
        if (i == j) {
            // Alice waters if she has more or equal water
            if (waterA >= waterB) {
                if (waterA < plants[i]) {
                    count++;
                }
            } else {
                if (waterB < plants[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}