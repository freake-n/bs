class search
  {
    

int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+high/2;
            if(arr[mid]==target)
            {
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(arr[mid]<target)
            {
                high=mid+1;
            }
            else
            {
                low=mid-1;
            }
        }
}
