package Game;

import static org.junit.jupiter.api.Assertions.assertEquals; // ✅ JUnit의 assertEquals 사용
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class LottoTest {

    @Test
    void testNumberGeneration() {
        int[] lottoNumbers = Lotto.gen_lotto();

        // ✅ 결과 출력
        System.out.println("생성된 로또 번호: " + Arrays.toString(lottoNumbers));

        // ✅ 로또 번호 개수 확인
        assertEquals(6, lottoNumbers.length, "로또 번호 개수 오류");
    }
}