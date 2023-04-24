package com.topstep.fitcloud.sdk.v2.dfu;

import android.app.Activity;
import ij.w;
import kotlin.Metadata;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
/* loaded from: classes2.dex */
public final class Dfu6621Service extends DfuBaseService {
    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public final Class<? extends Activity> getNotificationTarget() {
        return null;
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public final boolean isDebug() {
        return w.f17085b;
    }
}
