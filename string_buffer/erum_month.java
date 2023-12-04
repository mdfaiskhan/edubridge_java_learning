package string_buffer;

public class erum_month {
	enum month {
		january,
		febuaru,
		march,
		april,
		may,
		june,
		july,
		augest,
		september,
		october,
		november,
		december;
		
	}
	enum season{
		summer,
		winter,
		monsoon,
		spring;
	}
	enum restaurant_dishes{
		samosa,
		kachori,
		biryani,
		kabab,
		naan,
		
	}

	public static void main(String[] args) {
		month a=month.april;
		System.out.println("This month is "+a);
		season b=season.winter;
		System.out.println("current "+b+" "+"season is going on");
		restaurant_dishes c=restaurant_dishes.biryani;
		System.out.println(c);

	}

}
