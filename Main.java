class Main {
    public static void main(String[] args) {
        int nums[] = {3, 7, 11, 99, 33};
        int item  = 11;

        int result = linearSearch(nums, item);
        if(result != -1)
            System.out.println("Element at index : " + result);
        else
            System.out.println("Element not found");

    }

    public static int linearSearch(int nums [], int item){
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == item)
                return i;
        }
        return - 1;
    }
}
