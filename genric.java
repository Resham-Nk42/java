class Gen<T>
{
 T ob;
 Gen(T O)
{
 ob=O;
}

T getob()
{
 return ob;
}
void showType()
{
System.out.println("Type f T is"+ob.getClass().getName());
}
}

class GenDemo{
public static void main(String args[])
{
Gen<Integer>iob;
iob=new Gen<Integer>(88);
iob.showType();
int v=iob.getob();
System.out.println("Auto-unboxed value is"+" "+v);
Gen<Float>fob;
fob=new Gen<Float>(88.0f);
fob.showType();
float u=fob.getob();
System.out.println("Auto-unboxed value is"+" "+u);
Gen<Double>dob;
dob=new Gen<Double>(85.7);
dob.showType();
double x=dob.getob();
System.out.println("Auto-unboxed value is"+" "+x);

}
}