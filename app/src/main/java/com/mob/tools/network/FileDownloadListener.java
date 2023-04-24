package com.mob.tools.network;

import com.mob.tools.proguard.EverythingKeeper;

@Deprecated
/* loaded from: classes.dex */
public abstract class FileDownloadListener implements EverythingKeeper {
    private boolean isCanceled = false;

    public void cancel() {
        this.isCanceled = true;
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }

    public abstract void onProgress(int i10, long j10, long j11);
}
