package com.mob.commons.cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m implements ServiceConnection, s<m> {

    /* renamed from: a */
    private p f8299a;

    public void a(p pVar) {
        this.f8299a = pVar;
    }

    @Override // com.mob.commons.cc.s
    public boolean a(m mVar, Class<m> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("setHandler".equals(str) && objArr.length == 1) {
            mVar.a((p) objArr[0]);
            return true;
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f8299a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(componentName);
                arrayList.add(iBinder);
                this.f8299a.a("onServiceConnected", arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f8299a != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(componentName);
            this.f8299a.a("onServiceDisconnected", arrayList);
        }
    }
}
