package cn.sharesdk.framework.loopshare.watermark;

@Deprecated
/* loaded from: classes.dex */
public interface WaterMarkListener {
    void onCancel();

    void onEnd(int i10);

    void onFailed(String str, int i10);

    void onProgress(int i10);

    void onStart();
}
