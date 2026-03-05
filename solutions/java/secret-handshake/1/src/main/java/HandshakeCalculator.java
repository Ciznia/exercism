import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new java.util.ArrayList<>();

        // if ((number & (2 << 0)) != 0) {
        // signals.add(Signal.WINK);
        // }
        // if ((number & (2 << 1)) != 0) {
        // signals.add(Signal.DOUBLE_BLINK);
        // }
        // if ((number & (2 << 2)) != 0) {
        // signals.add(Signal.CLOSE_YOUR_EYES);
        // }
        // if ((number & (2 << 3)) != 0) {
        // signals.add(Signal.JUMP);
        // }
        // if ((number & (2 << 4)) != 0) {
        // signals.sort(Collections.reverseOrder());
        // }

        if (number % 2 == 1) {
            signals.add(Signal.WINK);
        }
        if (number % 4 >= 2) {
            signals.add(Signal.DOUBLE_BLINK);
        }
        if (number % 8 >= 4) {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if (number % 16 >= 8) {
            signals.add(Signal.JUMP);
        }
        if (number % 32 >= 16) {
            signals.sort(Collections.reverseOrder());
        }

        return signals;
    }

}
