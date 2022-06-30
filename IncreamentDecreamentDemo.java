class IncrementDecrementDemo {
	public static void main(String args[]){
		int number = 10;

		System.out.println(number++);
		System.out.println(++number);

		System.out.println(number--);
		System.out.println(--number);
		number = 10;
		System.out.println(number++ + " " + ++number + " " +
		++number + " " + number++ + " " + ++number + " ");
                     }
               }