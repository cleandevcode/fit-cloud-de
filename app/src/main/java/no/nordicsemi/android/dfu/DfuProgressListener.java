package no.nordicsemi.android.dfu;

/* loaded from: classes2.dex */
public interface DfuProgressListener {
    void onDeviceConnected(String str);

    void onDeviceConnecting(String str);

    void onDeviceDisconnected(String str);

    void onDeviceDisconnecting(String str);

    void onDfuAborted(String str);

    void onDfuCompleted(String str);

    void onDfuProcessStarted(String str);

    void onDfuProcessStarting(String str);

    void onEnablingDfuMode(String str);

    void onError(String str, int i10, int i11, String str2);

    void onFirmwareValidating(String str);

    void onProgressChanged(String str, int i10, float f10, float f11, int i11, int i12);
}
