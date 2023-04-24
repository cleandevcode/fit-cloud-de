package com.mob.commons.cc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    public a f8300a;

    /* loaded from: classes.dex */
    public interface a {
        Object a(String str, ArrayList<Object> arrayList);
    }

    public p(a aVar) {
        this.f8300a = aVar;
    }

    public Object a(String str, ArrayList<Object> arrayList) {
        a aVar = this.f8300a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(str, arrayList);
    }
}
