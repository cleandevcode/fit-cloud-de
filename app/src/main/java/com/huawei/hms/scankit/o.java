package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes.dex */
public class o extends OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ q f7452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context) {
        super(context);
        this.f7452a = qVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        q qVar;
        int i11;
        int rotation = ((Activity) this.f7452a.f8146e).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            qVar = this.f7452a;
            i11 = 90;
        } else if (rotation == 1) {
            qVar = this.f7452a;
            i11 = 0;
        } else if (rotation == 2) {
            qVar = this.f7452a;
            i11 = 270;
        } else if (rotation != 3) {
            return;
        } else {
            qVar = this.f7452a;
            i11 = 180;
        }
        qVar.a(i11);
    }
}
