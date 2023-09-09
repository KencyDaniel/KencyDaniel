 class Longestpalidrome{


public static void main(String args[]){
 String str="cbbd";
 String result="";
for(int i=0;i<str.length();i++){
  String sub1=pal(i,i,str);
  if(sub1.length()>result.length()){
     result=sub1;
  }
  String sub2=pal(i,i+1,str);
  if(sub2.length()>sub1.length()){
     result=sub2;
  }
}
System.out.println(result);
}

static String pal(int l,int  r,String str)
 {
 while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
     l-=1;
     r+=1;
 }
    return str.substring(l+1, r);
 }
}
