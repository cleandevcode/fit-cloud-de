package no.nordicsemi.android.dfu;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class DfuServiceController implements DfuController {
    private boolean mAborted;
    private final g2.a mBroadcastManager;
    private boolean mPaused;

    public DfuServiceController(Context context) {
        this.mBroadcastManager = g2.a.a(context);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        if (this.mAborted) {
            return;
        }
        this.mAborted = true;
        this.mPaused = false;
        Intent intent = new Intent(DfuBaseService.BROADCAST_ACTION);
        intent.putExtra(DfuBaseService.EXTRA_ACTION, 2);
        this.mBroadcastManager.c(intent);
    }

    public boolean isAborted() {
        return this.mAborted;
    }

    public boolean isPaused() {
        return this.mPaused;
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        if (this.mAborted || this.mPaused) {
            return;
        }
        this.mPaused = true;
        Intent intent = new Intent(DfuBaseService.BROADCAST_ACTION);
        intent.putExtra(DfuBaseService.EXTRA_ACTION, 0);
        this.mBroadcastManager.c(intent);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        if (this.mAborted || !this.mPaused) {
            return;
        }
        this.mPaused = false;
        Intent intent = new Intent(DfuBaseService.BROADCAST_ACTION);
        intent.putExtra(DfuBaseService.EXTRA_ACTION, 1);
        this.mBroadcastManager.c(intent);
    }
}
