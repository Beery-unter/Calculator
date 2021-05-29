public class Calculator {
    private static int result;  
    public void add(int n)
    {
        result=result+n;
    }
    
    public void substract(int n)
    {
        result=result-1;     
    }
    
    public void multiply(int n)
    {
        result *= n;
    }
    
    public void divide(int n)
    {
        result=result/n;
    }
    
    public void square()
    {
        result=(int) Math.sqrt(result);
    }
    
    public void clear()
    {
        result=0; 
    }
    
    public int getResult()
    {
        return result;
    }
}
