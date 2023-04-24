package com.topstep.fitcloud.pro.function;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class NLSWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NLSWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x006b, code lost:
        if (r8.clientCount == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
        r12 = true;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super androidx.work.ListenableWorker.a> r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.function.NLSWorker.h(xl.d):java.lang.Object");
    }
}
