class Genric <T>{
T ob;
Genric(T o){
ob=o;
}

T getob(){
return ob;
}

void showType(){
System.out.println("Type od T is:"+ob.getClass().getName());
}

}


class Demo{
public static void main(String args[]){
Genric <Integer>iob;
iob=new Genric<Integer>(88);
iob.showType();

int v=iob.getob();
System.out.println("autoboxed value is:"+v);

}
}