package sample;

/**
 * 魔法使いクラス
 *
 */
public class Magician extends Unit {

	/**
	 * 思考ルーチン
	 */
	protected void analyze() {
	    System.out.println("Magician analyzing...");
	}
	/**
	 * 移動処理
	 */
	protected void move() {
	    System.out.println("Magician moving...");
	}
	/**
	 * 行動処理
	 */
	protected void action() {
	    System.out.println("Magician use Fire Magic!");
	}
}