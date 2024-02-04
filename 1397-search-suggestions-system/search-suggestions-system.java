class Solution {
    public int FirstOccurenceIndex(String[] products, String letter)
    {   
        int left = 0;
        int right = products.length -1;
        int firstoccurence = 0;

        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if(products[mid].substring(0,0).compareTo(letter) == 0)
            {
                firstoccurence = mid;
                right = mid - 1;
            }
            else if(products[mid].substring(0,0).compareTo(letter) < 0)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return firstoccurence;
    }

    public int LastOccurenceIndex(String[] products, String letter)
    {   
        int left = 0;
        int right = products.length -1;
        int lastoccurence = 0;

        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if(products[mid].substring(0,0).compareTo(letter) == 0)
            {
                lastoccurence = mid;
                left = mid+1;
            }
            else if(products[mid].substring(0,0).compareTo(letter) < 0)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return lastoccurence;
    }


    public List<List<String>> suggestedProducts(String[] products, String searchWord) 
    {
        List<List<String>> searchhistory = new ArrayList<List<String>>();
        Arrays.sort(products);
        int first =  FirstOccurenceIndex(products, searchWord.substring(0,0));
        int last = LastOccurenceIndex(products, searchWord.substring(0,0));
        
        for(int j = 0; j< searchWord.length(); j++ )
        {
            List<String>temp = new ArrayList<String>();
            for(int i = first ; i<= last; i++)
            {
                if(products[i].startsWith(searchWord.substring(0,j+1)))
                {
                    temp.add(products[i]);
                }
                if(temp.size() == 3)
                {
                    break;
                }
            }
            searchhistory.add(temp);
        }
       
 
        return searchhistory;
    }
}