package sample;

/**
 * 僧侶クラス
 *
 */
public class Priest extends Unit {

	/**
	 * 思考ルーチン
	 */
	protected void analyze() {
	    System.out.println("Priest analyzing...");
	}
	/**
	 * 移動処理
	 */
	protected void move() {
	    System.out.println("Priest moving...");
	}
	/**
	 * 行動処理
	 */
	protected void action() {
	    System.out.println("Priest use Recovery Magic!");
	}
}