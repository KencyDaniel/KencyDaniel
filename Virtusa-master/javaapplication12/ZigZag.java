import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class main {
static void zigzag(int numrows)
{
String str="paypalishiring";
int index=0;
int step=0;
String arr[]=new String[]{"","",""};
for(int i=0;i<str.length();i++){
String temp=arr[index];
temp+=str.charAt(i);
arr[index]=temp;
if(index==0)
   step=1;
else if(index==numrows-1)
    step=-1;
index+=step;
}
System.out.println(Arrays.toString(arr));
}   
  
  
public static void main(String args[]){
    zigzag(3);
  }
    
}

