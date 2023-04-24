package com.mob.commons.cc;

/* loaded from: classes.dex */
public class n implements s<m> {
    @Override // com.mob.commons.cc.s
    public boolean a(m mVar, Class<m> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if ("setHandler".equals(str) && objArr.length == 1 && (obj = objArr[0]) != null && (obj instanceof p)) {
            mVar.a((p) obj);
            return true;
        }
        return false;
    }
}
