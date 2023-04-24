package cn.sharesdk.framework;

import java.util.HashMap;

/* loaded from: classes.dex */
public interface PlatformActionListener {
    void onCancel(Platform platform, int i10);

    void onComplete(Platform platform, int i10, HashMap<String, Object> hashMap);

    void onError(Platform platform, int i10, Throwable th2);
}
