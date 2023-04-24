package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class Mb {

    /* renamed from: a */
    private final int f7609a;

    /* renamed from: b */
    private final int f7610b;

    public int a() {
        return this.f7610b;
    }

    public int b() {
        return this.f7609a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Mb) {
            Mb mb2 = (Mb) obj;
            return this.f7609a == mb2.f7609a && this.f7610b == mb2.f7610b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7609a * 32713) + this.f7610b;
    }

    public String toString() {
        return this.f7609a + "x" + this.f7610b;
    }
}
