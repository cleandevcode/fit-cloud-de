package com.bumptech.glide;

import com.bumptech.glide.p;
import k5.a;

/* loaded from: classes.dex */
public abstract class p<CHILD extends p<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    public a.C0315a f5807a = k5.a.f18196a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return m5.l.b(this.f5807a, ((p) obj).f5807a);
        }
        return false;
    }

    public int hashCode() {
        a.C0315a c0315a = this.f5807a;
        if (c0315a != null) {
            return c0315a.hashCode();
        }
        return 0;
    }
}
