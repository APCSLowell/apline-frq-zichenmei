public class APLine
{
  /* your code here */
  private int a;
  private int b;
  private int c;
  
  public APLine(int d, int e, int f){
    a=d;
    b=e;
    c=f;
  }
  public double getSlope(){
    double slope=(double)((0-a)/b);
    return slope;
  }
  public boolean inOnLine(int x, int y){
    int first=a*x;
    int sec=b*y;
    if((first+sec+c)==0){
      return true;
    }
    return false;
  }
}
