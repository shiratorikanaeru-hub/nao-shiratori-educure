public class ScoreManager {
    // TODO: validateScoreメソッドを実装
    // 1. 負の値の場合はInvalidScoreExceptionをスロー
    // 2. 100点超過の場合はScoreOverflowExceptionをスロー
    // 3. それ以外の場合は正常終了
    public static void validateScore(int score)
    throws InvalidScoreException,ScoreOverflowException{
        if (score<0) {
            throw new InvalidScoreException(score);
        }
        if (score>100) {
            throw new ScoreOverflowException(score);
        }
    }
}