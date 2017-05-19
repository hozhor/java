import java.util.ArrayList;
public class ArrayListDemo01{
public static void main(String []args){
	ArrayList<String> arraylist=new ArrayList<String>();
	arraylist.add("aaaa");//向List的尾部添加一个元素obj
	arraylist.add("bbb");
	arraylist.add(0,"hello");//向List中索引i 的位置添加元素obj
	arraylist.add("world");
	for(int i=0;i<arraylist.size();i++)//list名.size()来获取list的长度	
		System.out.println(arraylist.get(i));//返回索引i 指定位置的元素。
	System.out.println("size:"+arraylist.size());
	System.out.println("--------------第二位置的bbb改成my后的list:--------------");
	arraylist.set(2,"my");//使用元素obj替换索引i 位置的元素，并返回被替换的元素
	for(int i=0;i<arraylist.size();i++)//list名.size()来获取list的长度	
		System.out.println(arraylist.get(i));//返回索引i 指定位置的元素。
	System.out.println("size:"+arraylist.size());
	System.out.println("--------------删除索引1 指定位置的元素，并返回被删元素-------------------");
	System.out.println("索引2指定的元素"+arraylist.remove(1)+"已被删除了...\n\t删除后的List:");
	for(int i=0;i<arraylist.size();i++)//list名.size()来获取list的长度	
		System.out.println(arraylist.get(i));//返回索引i 指定位置的元素。
	System.out.println("size:"+arraylist.size());
}	

}
