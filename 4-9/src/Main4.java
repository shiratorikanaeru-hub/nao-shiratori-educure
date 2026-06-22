public class Main4 {
    public static void main(String[] args) {
        StudentManager manager=new StudentManager();

            manager.addStudent("アリス");
            manager.addStudent("ボブ");
            manager.addStudent("チャーリー");
            manager.addStudent(null);
            manager.addStudent("イヴ");

            try {
                 manager.addStudent("フランク");
            }catch (Exception e) { 
            System.out.println("エラー: " + e.getMessage());
            }
            try {
                System.out.println("学生ID 2:"+manager.getStudent(2));
            }catch (Exception e) {
                System.out.println("エラー:"+e.getMessage());
            }
            try { 
                System.out.println("学生ID 3:"+manager.getStudent(3)); 
            }catch (Exception e) { 
                System.out.println("エラー: " + e.getMessage());
                System.out.println(" 学生ID 3: " +null);
            }
            try { 
                System.out.println("学生ID 10:"+manager.getStudent(10));
            }catch (Exception e) { 
                System.out.println("エラー:"+e.getMessage()); 
                System.out.println(" 学生ID 10: " + null);
            }
            try {
                manager.updateStudent(0, "フランク");
                manager.updateStudent(1, "ボビー");
                System.out.println("更新後の学生ID 1 : " + manager.getStudent(1));
            } catch (Exception e) {
                System.out.println("エラー: " + e.getMessage());
            }
            // 存在しないID 10の更新（エラー）
            try {
                manager.updateStudent(10, "テスト");
            } catch (Exception e) {
                System.out.println("エラー: " + e.getMessage());
            }
    }
}