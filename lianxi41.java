public class lianxi41 { 
public static void main (String[] args) { 
int i,m,j=0,k,count; 
for(i=4;i<10000;i+=4) 
   { count=0; 
     m=i; 
     for(k=0;k<5;k++) 
        { 
         j=i/4*5+1; 
         i=j; 
         if(j%4==0) 
            count++; 
            else break; 
       } 
    i=m; 
if(count==4) 
{System.out.println("原有桃子 "+j+" 个"); 
break;} 
} 
} 
} 
