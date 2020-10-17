public class Main {

public static void main(String[] args) {
// TODO code application logic here
int[] arry1= {2,1,4,7};
int[] array2= {3,-3,-8,0};
int[] array3= {-1,-4,-7,6};

int i,j,k,sum=0;
for(i=0;i<arry1.length;i++)
{

for(j=0;j<array2.length;j++)
{
for(k=0;k<array3.length;k++)
{
sum=arry1[i]+array2[j]+array3[k];
if(sum==0){
System.out.println("array element found");
System.out.println("\t"+arry1[i]+"\t"+array2[j]+"\t"+array3[k]);
// break;
}

}
if(sum==0)
continue;
}
if(sum==0)
continue;
}

}

}