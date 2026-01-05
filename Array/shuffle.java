/*Дан массив nums, состоящий из 2n элементов в виде [x1,x2,...,xn,y1,y2,...,yn].

Вернуть массив в таком виде [x1,y1,x2,y2,...,xn,yn].

 

Пример 1:

Ввод: nums = [2,5,1,3,4,7], n = 3
Вывод: [2,3,5,4,1,7]   */ 


class Solution {
    public int[] shuffle(int[] nums, int n) {
            int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }   
        
    }
