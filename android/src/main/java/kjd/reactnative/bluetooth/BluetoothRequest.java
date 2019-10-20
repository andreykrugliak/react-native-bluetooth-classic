package kjd.reactnative.bluetooth;

/**
 * Available Bluetooth requests within the Android and React Native Application.
 */
public enum BluetoothRequest {
    ENABLE_BLUETOOTH(1),
    PAIR_DEVICE(2);

    public final int code;
    BluetoothRequest(int code) {
        this.code = code;
    }
}
