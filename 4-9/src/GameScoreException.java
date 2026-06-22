public abstract class GameScoreException extends Exception {
    private int score;
    
    // TODO: コンストラクタを実装
    // TODO: getScoreメソッドを実装
    public GameScoreException(String message,int score){
        super(message);
        this.score=score;
    }
    public int getScore(){
        return score;
    }
}