public class InvalidScoreException extends GameScoreException {
    // TODO: コンストラクタを実装
    public InvalidScoreException(int score){
        super("Score cannot be negative ",score);

    }
}
