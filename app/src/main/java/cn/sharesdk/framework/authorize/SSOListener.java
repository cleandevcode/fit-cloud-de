package cn.sharesdk.framework.authorize;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface SSOListener {
    void onCancel();

    void onComplete(Bundle bundle);

    void onFailed(Throwable th2);
}
