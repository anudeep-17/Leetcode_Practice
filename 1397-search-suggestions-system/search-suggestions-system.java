class Solution {
    public int FirstOccurenceIndex(String[] products, String letter)
    {   
        int left = 0;
        int right = products.length -1;
        int firstoccurence = -1;
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            int length = 0;
            if(products[mid].length() < letter.length())
            {
                length = products[mid].length();
            }
            else
            {
                length = letter.length();
            }
            if(products[mid].substring(0,length).compareTo(letter) == 0)
            {
                firstoccurence = mid;
                right = mid - 1;
            }
            else if(products[mid].substring(0,length).compareTo(letter) < 0)
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

    public List<List<String>> suggestedProducts(String[] products, String searchWord) 
    {
        List<List<String>> searchhistory = new ArrayList<List<String>>();
        Arrays.sort(products);
      

        for(int i = 0; i<searchWord.length(); i++)
        {
            ArrayList<String> temp = new ArrayList<>();
            String target = searchWord.substring(0,i+1);
            int first =  FirstOccurenceIndex(products, target);
            
            if(first < 0)
            {
                searchhistory.add(temp);
                continue;
            }

            temp.add(products[first]);

           for(int j = first+1; j< first+3 && j < products.length; j++)
            {
                if(products[j].length() >= target.length() && products[j].startsWith(target))
                {
                    temp.add(products[j]);
                }
            } 
            searchhistory.add(temp);
        }
 
        return searchhistory;
    }
}