import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class RPGCharacterTest {

    @Test
    void testInitialStatus() {
        RPGCharacter character = new RPGCharacter();

        assertEquals(1, character.getLevel(), "初期レベルは1であるべきです");
        assertEquals(100, character.getHP(), "初期HPは100であるべきです");
        assertEquals(50, character.getMP(), "初期MPは50であるべきです");
    }

    @Test
    void testNormalLevelUp() {
        RPGCharacter character = new RPGCharacter();

        character.levelUp();

        assertEquals(2, character.getLevel(), "レベルが1上がるべきです");
        assertEquals(110, character.getHP(), "HPが10増えるべきです");
        assertEquals(55, character.getMP(), "MPが5増えるべきです");
    }

    @Test
    void testMaxLevel() {
        RPGCharacter character = new RPGCharacter();

        // レベル98まで上げる
        for (int i = 1; i < 98; i++) {
            character.levelUp();
        }

        // レベル98 → 99
        character.levelUp();
        assertEquals(99, character.getLevel(), "レベル98から99に上がるべきです");

        // レベル99でさらに上げようとすると例外
        try {
            character.levelUp();
            fail("レベル99でレベルアップすると例外が発生するはずです");
        } catch (IllegalStateException e) {
            assertEquals(
                "最大レベルに達しています",
                e.getMessage(),
                "例外メッセージが正しくありません"
            );
        }
    }
}