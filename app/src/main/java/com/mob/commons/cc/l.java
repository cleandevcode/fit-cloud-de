package com.mob.commons.cc;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l implements s<l> {

    /* renamed from: a */
    private p f8297a;

    private ConnectivityManager.NetworkCallback a() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.mob.commons.cc.l.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(network);
                l.this.f8297a.a("onAvailable", arrayList);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                ArrayList<Object> arrayList = new ArrayList<>();
                arrayList.add(network);
                l.this.f8297a.a("onLost", arrayList);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    public void a(p pVar) {
        this.f8297a = pVar;
    }

    @Override // com.mob.commons.cc.s
    public boolean a(l lVar, Class<l> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if ("setHandler".equals(str) && objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof p)) {
            lVar.a((p) obj);
        } else if (!"initNetworkCallback".equals(str) || objArr.length != 0) {
            return false;
        } else {
            objArr2[0] = lVar.a();
        }
        return true;
    }
}
