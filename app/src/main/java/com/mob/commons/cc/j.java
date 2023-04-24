package com.mob.commons.cc;

import android.database.ContentObserver;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j extends ContentObserver implements s<j> {

    /* renamed from: a */
    private p f8296a;

    public j() {
        super(null);
    }

    public void a(p pVar) {
        this.f8296a = pVar;
    }

    @Override // com.mob.commons.cc.s
    public boolean a(j jVar, Class<j> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if ("setHandler".equals(str) && objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof p)) {
            jVar.a((p) obj);
            return true;
        }
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f8296a != null) {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(Boolean.valueOf(z10));
            this.f8296a.a("onChange", arrayList);
        }
    }
}
