import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        // 正の数同士
        assertEquals(5, calculator.add(2, 3),
                "正の数同士の足し算が正しくありません");

        // 負の数を含む
        assertEquals(4, calculator.add(-1, 5),
                "負の数を含む足し算が正しくありません");

        // ゼロを含む
        assertEquals(4, calculator.add(0, 4),
                "ゼロを含む足し算が正しくありません");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();

        // 正の数同士
        assertEquals(2, calculator.subtract(5, 3),
                "正の数同士の引き算が正しくありません");

        // 負の数を含む
        assertEquals(-3, calculator.subtract(-1, 2),
                "負の数を含む引き算が正しくありません");

        // ゼロを含む
        assertEquals(4, calculator.subtract(4, 0),
                "ゼロを含む引き算が正しくありません");
    }
}