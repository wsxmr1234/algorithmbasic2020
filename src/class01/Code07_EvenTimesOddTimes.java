package class01;


/**
 * 认识异或运算
 * 异或运算：相同为0，不同为1
 * 同或运算：相同以1，不同为0
 * 能长时间记住的概率接近0%
 * 所以，异或运算就记成无进位相加！
 *
 *
 * 异或运算的性质
 * 1)0^N==N  N^N==0
 * 2)异或运算满足交换律和结合率
 * 上面的两个性质用无进位相加来理解就非常的容易
 */

public class Code07_EvenTimesOddTimes {
	/*
	一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么
找到并打印这种数
	 */
	public static void printOddTimesNum1(int[] arr) {
		int eO = 0;
		for (int cur : arr) {
			eO ^= cur;
		}
		System.out.println(eO);
	}

	public static void printOddTimesNum2(int[] arr) {
		int eO = 0, eOhasOne = 0;
		for (int curNum : arr) {
			eO ^= curNum;
		}
		int rightOne = eO & (~eO + 1);
		for (int cur : arr) {
			if ((cur & rightOne) != 0) {
				eOhasOne ^= cur;
			}
		}
		System.out.println(eOhasOne + " " + (eO ^ eOhasOne));
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

	}

}
