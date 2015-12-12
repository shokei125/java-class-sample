package sample;

/**
 * ユニット基底クラス
 */
public abstract class Unit {
	/**
	 * 実行メソッド
	 */
	public final void execute() {
	    analyze();
	    move();
	    action();
	}

	/**
	 * 思考ルーチン
	 */
	protected abstract void analyze();
	/**
	 * 移動処理
	 */
	protected abstract void move();
	/**
	 * 行動処理
	 */
	protected abstract void action();

}