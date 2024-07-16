package ztgs;

public class NumberToLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=499;
		if(num==0)
			System.out.println("Zero"); 
		
		int count=1;
		String temp="";
		String result="";
		while(num!=0) {
			int mod=num%10;
			if(mod!=0)
			result= word(num%10,count,temp)+" "+ result;
			
			count++;
			num/=10;
			
		}
		System.out.println(result);

	}

	private static String word(int i, int j,String temp) {
		// TODO Auto-generated method stub
		
		switch(i) {
		case 1:
			temp+="One";
			break;
		case 2:
			temp+="Two";
			break;
	
		case 3:
			temp+="Three";
			break;
		case 4:
			temp+="Four";
			break;
		case 5:
			temp+="Five";
			break;
		case 6:
			temp+="Six";
			break;
		case 7:
			temp+="Seven";
			break;
		case 8:
			temp+="Eight";
			break;
		case 9:
			temp+="Nine";
			break;
//			default:
//				temp+="Zero";
//	
		}
		if(j==1)
		return temp;
		else if(j==2)
			return temp+"ty";
		else if(j==3)
			return temp+" "+"Hundread";
		else if(j==4)
			return temp+" "+"Thousand";
		return temp;
		
	}
	}


