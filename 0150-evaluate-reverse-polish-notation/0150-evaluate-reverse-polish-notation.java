class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++)
    {
      if( tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")  || tokens[i].equals("/") ) {
      int x1 = stack.pop();
      int x2 = stack.pop();
      if( tokens[i].equals("+") ){
       stack.push( x1+x2);
      }
       if( tokens[i].equals("-") ){
         stack.push(x2-x1);
      }
       if(tokens[i].equals("*")  ){
         stack.push(x1*x2);
      }
       if( tokens[i].equals("/") ){
         stack.push(x2/x1);
      }
      }
      else
       stack.push(Integer.parseInt(tokens[i]));

      }
        
        return stack.peek();
    }
}