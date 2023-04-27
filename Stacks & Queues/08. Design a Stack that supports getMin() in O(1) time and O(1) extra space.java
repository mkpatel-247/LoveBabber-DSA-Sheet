/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min = s.peek();
           while(!s.isEmpty()){
               if(s.peek()<min){
                   min = s.peek();
               }
               s.pop();
           }
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size()==n;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.isEmpty()){
               return true;
           }
           return false;
	}
}
