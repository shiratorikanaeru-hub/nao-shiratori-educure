import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {
    public static void main(String[] args) {
        try {
            // ファイルとフォルダのパス
            Path source = Paths.get("source.txt");
            Path backupFolder = Paths.get("backup");
            Path backupFile = backupFolder.resolve("source.txt");
            Path archiveFolder = Paths.get("archive");
            Path archiveFile = archiveFolder.resolve("source.txt");

            // backupフォルダがなければ作成
            if (!Files.exists(backupFolder)) {
                Files.createDirectory(backupFolder);
            }

            // archiveフォルダがなければ作成
            if (!Files.exists(archiveFolder)) {
                Files.createDirectory(archiveFolder);
            }

            // source.txtをbackupへコピー
            Files.copy(source, backupFile);

            System.out.println("ファイルが 'backup/' にコピーされました。");

            // コピーの確認
            if (Files.exists(backupFile)) {
                System.out.println("コピーの確認：成功");
            } else {
                System.out.println("コピーの確認：失敗");
            }

            // backup/source.txtをarchiveへ移動
            Files.move(backupFile, archiveFile);

            System.out.println("ファイルが 'archive/' に移動されました。");

            // 移動の確認
            if (Files.exists(archiveFile)) {
                System.out.println("移動の確認：成功");
            } else {
                System.out.println("移動の確認：失敗");
            }

        } catch (IOException e) {
            System.out.println("ファイル操作中にエラーが発生しました。");
            e.printStackTrace();
        }
    }
}