class Solution {
    public boolean isValid(String s) 
    {
       char[] ch = s.toCharArray();
       boolean check = false;
      Stack<Character> stack = new Stack<Character>();
      
      for(int i = 0; i<ch.length; i++)
      {
          if(ch.length % 2 !=0)
          {
              return false;
          }

          if(ch[i] == ')')
          {
              if(!stack.isEmpty() && stack.peek() == '(')
              {
                  stack.pop();
              }
              else
              {
                  return false;
              }
          }
          else if(ch[i] == '}')
          {
               if(!stack.isEmpty() && stack.peek() == '{')
              {
                  stack.pop();
              }
              else
              {
                  return false;
              }
          }
           else if(ch[i] == ']')
          {
               if(!stack.isEmpty() && stack.peek() == '[')
              {
                  stack.pop();
              }
              else
              {
                  return false;
              }
          }
          else
          {
              stack.push(ch[i]);
          }
      }
      if(stack.isEmpty())
      {
          return true;
      }
      else
      {
          return false;
      }

    }
}
