package com.mob.commons.cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends BroadcastReceiver implements s<h> {

    /* renamed from: a */
    private p f8295a;

    public void a(p pVar) {
        this.f8295a = pVar;
    }

    @Override // com.mob.commons.cc.s
    public boolean a(h hVar, Class<h> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if ("setHandler".equals(str) && objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof p)) {
            hVar.a((p) obj);
            return true;
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f8295a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>(1);
                arrayList.add(intent);
                this.f8295a.a("onReceive", arrayList);
            } catch (Throwable unused) {
            }
        }
    }
}
