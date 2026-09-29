package com.example;

/**
 * 四則演算クラス
 * @author user01-m
 *
 */
public class Calc {

	/**
	 * コンストラクタ
	 */
	public Calc() {
		
	}

	/**
	 * 加算処理(x + y)
	 * @param x 加算値1
	 * @param y 加算値2
	 * @return 加算結果
	 */
	public int add(int x, int y) {
	
		return x + y;
	}

	/**
	 * 減算処理(x - y)
	 * @param x 減算値1
	 * @param y 減算値2
	 * @return 減算結果
	 */
	public int sub(int x, int y) {

		return x - y;
	}

	/**
	 * 除算処理(x / y)
	 * @param x 除算値1
	 * @param y 除算値2
	 * @return 除算結果
	 */
	public int div(int x, int y)  {
		
		return x / y;
	}

	/**
	 * 乗算処理(x * y)
	 * @param x 乗算値1
	 * @param y 乗算値2
	 * @return 乗算結果
	 */
	public int mul(int x, int y) {
		
		return x * y;
	}
}
