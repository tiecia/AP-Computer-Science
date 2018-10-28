
public class Unit1 {
	public static void main(String[] args) {
		//check9();
		exercise15();
	}
	
	public static void exercise2() {
		int senior = 13;
		int junior = 4;
		int sophomore = 2;
		int freshman = 1;
		int total = senior+junior+sophomore+freshman;
		double seniorp = ((double)senior/total)*100;
		double juniorp = ((double)junior/total)*100;
		double sophomorep = ((double)sophomore/total)*100;
		double freshmanp = ((double)freshman/total)*100;
		
		System.out.println("APCS has " + senior + " Seniors, which is " + (int)seniorp + "% of the class.");
		System.out.println("APCS has " + junior + " Juniors, which is " + (int)juniorp + "% of the class.");
		System.out.println("APCS has " + sophomore + " Sophomores, which is " + (int)sophomorep + "% of the class.");
		System.out.println("APCS has " + freshman + " Freshman, which is " + (int)freshmanp + "% of the class.");
		System.out.println("------------------------------");
		System.out.println("| APCS has " + total + " students total |");
		System.out.println("------------------------------");
	}
	
	public static void exercise2b() {
//		int Seniors = 13;
//		int Juniors = 4;
//		int Sophomores = 2;
		int Freshman = 1;
//		int total = Seniors+Juniors+Sophomores+Freshman;
		getCount("Seniors");
		getCount("Juniors");
		getCount("Sophomores");
		getCount("Freshman");
		getCount("Total");

	}
	
	public static void getCount(String grade){
		int gradecount = 0;
		if(grade == "Seniors") {
			gradecount = 13;
		}
		else if(grade == "Juniors") {
			gradecount = 4;
		}
		else if(grade == "Sophomores") {
			gradecount = 2;
		}
		else if(grade == "Freshman") {
			gradecount = 1;
		}
		else {
			gradecount = 13+4+2+1;
		}
		System.out.println("APCS has " + gradecount + " " + grade);
	}
	
	public static void exercise4() {
		String Str1 = "Exercise3String";
		System.out.println(Str1.substring(0,5) + " " + Str1.substring(10,15));
	}
	
	public static void exercise5() {
		double f = 55;
		System.out.println(f + " degrees F is " + (float)((f-32)*(5.0/9.0)) + " in degrees C.");
	}
	
	public static void exercise6() {
		int order = 506;
		int first = order/100;
		int second = (order%100)/10;
		int third = order%10;
		System.out.println(order + " backwards is " + third + "" + second + "" + first);
	}
	
	public static void exercise7() {
		int one = 1;
		int two = 2;
		int three = 3;
		int sub = (one+two+three);
		//int avg = sub /= 3;
		sub /= 3;
		//System.out.println("                                    ------");
		System.out.println("The average of " + one + ", " + two + ", and " + three + " is | " + sub + " |");
		//System.out.println("                                    ------");
	}
	
	public static void exercise8() {
		double pone, ptwo, pthree, pfour, pfive, total, subtotal, add;
		pone = 5;
		ptwo = 2;
		pthree = 9;
		pfour = 5;
		pfive = 1;
		add = pone+ptwo+pthree+pfour+pfive;
		subtotal = ((0.1*add)+add);
		//total = add += 7.95;
		subtotal += 7.95;
		System.out.println("The total is $"+subtotal);
	}
	
	public static void exercise9() {
		System.out.println(2.0 + 3); //an equation with a double and int promotes the int to a double and the answer is a double.
		System.out.println(3/2 + 1.0); //same rule as before but the math seems strange
		System.out.println(1.0 + 3 / 2); //?
		System.out.println("1" + "2"); //combining string 1 and string 2 to make 12.
		System.out.println("abc" + 1 + 2); //since the 1+2 is after the string it adds the numbers onto the string and the output is abc12 as a string.
		System.out.println(1 + 2 + "abc"); //here since the 1+2 is before the string it adds them like they are in an equation then puts the string on after the answer to the equation.
		System.out.println(1 + "abc" + 2); //adds 1 on the beginning and 2 on the end of the string ABC since there is nothing else for 1 to add to and since 2 comes after the equation it gets stuck on to the end like it is a string.
		System.out.println('a' + 1); //this equals 98 because a in ascii is 97 and 97+1 is 98. The char converts to an int using ascii when mixed with an int
		System.out.println('A' + 1); //Again, the char converts to int using ascii when mixed with an int. This equals 66 because A from ascii to int is 65 and 65+1 is 66
		System.out.println('e' - 'a'); //e = 101 using ascii and a = 97. 101-97 = 4. When doing math with chars they convert to ins using the ascii table.
		System.out.println('e' - 'A'); //the same as the line before but this time we have an A and A = 65.
	}
	
	public static void exercise10() {
		System.out.print("My Favorite 10 Integers: ");
		for (int i = 1; i<=10; i++) {
			System.out.print(i +" ");
		}
	}
	
	public static void exercise11() {
		long calc = 5;
		for (long i = calc-1; i > 0; i--) {
			calc = calc*i;
		}
		System.out.println(calc);
	}
	
	public static void exercise12() {
		for (int n = 1; n <=5; n++) {
			for (int i = 1; i<=5; i++) {
				System.out.print(n*i + " ");
			}
			System.out.println();
		}
	}
	
	public static void exercise13() {
		for(int i = 1; i<=5; i++) {
			for(int n = 1; n <=5; n++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void exercise14() {
		for(int i = 1; i<=5; i++) {
			for(int n = 1; n<=i; n++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void exercise14b() {
		int number = 5;
		for(int i = 1; i<=5; i++) {
			for(int n = 5; n>=i; n--){
				System.out.print(number);
			}
			System.out.println();
			number--;
		}
	}
    public static void check7() {
        int b = 1;
        for(int i = 1; i<=5; i++) {
             for(int n = 4; n>=b; n--) {
                  System.out.print(" ");
             }
             b++;
             //System.out.println();
             System.out.println(i);
        }
  }
  
  public static void check8() {
        int space = 4;
        int after = 5;
        for(int n = 5; n>=1; n--) {
             for(int i = 1; i<=space; i++) {
                  System.out.print(" ");
             }
             space--;
             for(int a = 5; a>=after; a--) {
                  System.out.print(n);
             }
             after--;
             System.out.println();
        }
  }
  
  public static void check9() {
        for(int i = 1; i<=40; i++) {
             System.out.print("-");
        }
        System.out.println();
        for(int n = 1; n<=10; n++) {
             System.out.print("_-^-");
        }
        System.out.println();
        for(int t = 1; t<=2; t++) {
             for(int b = 1; b<=9; b++) {
                  System.out.print(b);
                  System.out.print(b);
             }
             System.out.print("00");
        }
        System.out.println();
        for(int m = 1; m<=40; m++) {
             System.out.print("-");
        }
  }
  
  public static int scale = 7;
  
  public static void exercise15(){
        scale = scale-7;
        top();
        middle();
        bottom();
  }
  public static void top() {
        int plus = 7 + scale;
        for(int i = 1; i<=plus; i++) {
             System.out.print("+");
        }
        System.out.println();
  }
  public static void middle() {
        int space = 1;
        int star = 5 + scale;
        int lines = 4 + scale;
        for(int l = 1; l<=lines; l++) {
             for(int i=1; i <= star; i++) {
                  System.out.print("*");
             }
             for(int s = 1; s <= space; s++) {
                  System.out.print(" ");
             }
             System.out.println("*");
             space++;
             star--;
        }
  }
  public static void bottom() {
        int dots = 7 + scale;
        for(int d = 1; d <= dots; d++) {
             System.out.print(":");
        }
	
  }
}
