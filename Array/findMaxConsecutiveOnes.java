/*
Для заданного бинарного массива nums верните максимальное количество последовательных 1's в массиве.

Пример 1:

Входные данные: nums = [1,1,0,1,1,1]
Выходные данные: 3
Пояснение: Первые две цифры или последние три цифры — это последовательные единицы.
 Максимальное количество последовательных единиц — 3.

*/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;
    }
}