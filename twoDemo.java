class Genric <T,V>
{
T ob1;
V ob2;

Genric(T o1,V o2){
ob1=o1;
ob2=o2;
}

T getob1(){
return ob1;
}

V getob2(){
return ob2;
}

void showType(){
System.out.println("Type of T is:"+ob1.getClass().getName());
System.out.println("Type of V is:"+ob2.getClass().getName());
}

}


class twoDemo{
public static void main(String args[]){
Genric <Integer,Double>tgiob;
tgiob=new Genric<Integer,Double>(8,12.0);
tgiob.showType();

int i=tgiob.getob1();
System.out.println("autoboxed value is:"+i);

double d=tgiob.getob2();
System.out.println("autoboxed value is:"+d);

}
}