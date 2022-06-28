package day01;

public class BinarySearch {
    public static void main(String[] args) {

        BinarySearch b1 = new BinarySearch();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(b1.binarySearch(nums, 9));
    }

    public BinarySearch() {
    }

    public int binarySearch(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;
        int media;
        while(i <= j){
            media = (i + j)/2;
            int tmp_num = nums[media];
            if (tmp_num == target) return media;
            else{
                if (tmp_num < target) i = media + 1;
                else j = media - 1;
            }
        }
        return -1;
    }
}
