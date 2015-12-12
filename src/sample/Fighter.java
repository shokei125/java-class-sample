package sample;

/**
 * 戦士クラス
 *
 */
public class Fighter extends Unit {

	/**
	 * 思考ルーチン
	 */
	protected void analyze() {
	    System.out.println("Fighter analyzing...");
	}
	/**
	 * 移動処理
	 */
	protected void move() {
	    System.out.println("Fighter moving...");
	}
	/**
	 * 行動処理
	 */
	protected void action() {
	    System.out.println("Fighter attacking!");
	}
}
