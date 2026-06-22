public class ScoreOverflowException extends GameScoreException {
    // TODO: コンストラクタを実装
    public ScoreOverflowException(int score){
        super("Score cannot exceed 100 ", score);
    }
}