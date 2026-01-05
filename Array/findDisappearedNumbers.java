
/*
Дан массив nums из n целых чисел, где nums[i] находится в диапазоне [1, n], 
верните массив всех целых чисел в диапазоне [1, n] которые не встречаются в nums.


Пример 1:

Входные данные: nums = [4,3,2,7,8,2,3,1]
Выходные данные: [5,6]
Пример 2:

Ввод: nums = [1,1]
Вывод: [2] */



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}