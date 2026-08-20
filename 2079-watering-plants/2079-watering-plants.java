class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = plants.length; 
        int water = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (water < plants[i]) {
                steps += 2 * i;
                water = capacity;
            }
            water -= plants[i];
        }
        return steps;
    }
}