package string_buffer;

public class string_buffer {
	public static void main(String[] args) {
		StringBuffer abc=new StringBuffer("hello ");
		StringBuffer def=new StringBuffer("hello ");
		abc.append(def);
		def.append("faisal");//append()
		System.out.println(abc);
		System.out.println(def);
		
		//equals
		
		StringBuffer aaa=new StringBuffer("hello");
		StringBuffer bbb=new StringBuffer("hello");
		boolean ddd=aaa.equals(bbb);
		System.out.println(ddd);
		
		//==
		
		boolean ccc = aaa==bbb;
		System.out.println(ccc);
		
		
		//insert()
		StringBuffer qqq=new StringBuffer("qwerty");
		System.out.println(qqq.insert(3,"a"));
		
		//delete()
		StringBuffer rty=new StringBuffer("qwerty");
		System.out.println(rty.delete(3,4));
		
		//replace()
		StringBuffer ahs=new StringBuffer("qwerty");
		System.out.println(ahs.replace(3,4,"i"));
		
		//reverse()
		StringBuffer zai=new StringBuffer("qwerty");
		System.out.println(zai.reverse());
		
		//capacity()
		StringBuffer ppp=new StringBuffer("qwerty");
		System.out.println(ppp.capacity());
		
}
}