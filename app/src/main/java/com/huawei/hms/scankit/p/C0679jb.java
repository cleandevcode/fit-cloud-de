package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.C0675ib;
import java.util.TimerTask;

/* renamed from: com.huawei.hms.scankit.p.jb */
/* loaded from: classes.dex */
public class C0679jb extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C0675ib.b f7971a;

    public C0679jb(C0675ib.b bVar) {
        this.f7971a = bVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        String str;
        try {
            this.f7971a.f7945c = true;
            this.f7971a.a();
        } catch (Exception unused) {
            str = this.f7971a.f7943a;
            com.huawei.hms.scankit.util.a.b(str, "onLog Exception");
        }
    }
}
