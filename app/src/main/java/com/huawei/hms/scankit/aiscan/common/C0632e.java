package com.huawei.hms.scankit.aiscan.common;

import java.util.List;

/* renamed from: com.huawei.hms.scankit.aiscan.common.e */
/* loaded from: classes.dex */
public final class C0632e {

    /* renamed from: a */
    private final byte[] f7227a;

    /* renamed from: b */
    private int f7228b;

    /* renamed from: c */
    private final String f7229c;

    /* renamed from: d */
    private final List<byte[]> f7230d;

    /* renamed from: e */
    private final String f7231e;

    /* renamed from: f */
    private Integer f7232f;

    /* renamed from: g */
    private Integer f7233g;

    /* renamed from: h */
    private Object f7234h;

    /* renamed from: i */
    private final int f7235i;

    /* renamed from: j */
    private final int f7236j;

    public C0632e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C0632e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f7227a = bArr;
        this.f7228b = bArr == null ? 0 : bArr.length * 8;
        this.f7229c = str;
        this.f7230d = list;
        this.f7231e = str2;
        this.f7235i = i11;
        this.f7236j = i10;
    }

    public int a() {
        return this.f7228b;
    }

    public void a(int i10) {
        this.f7228b = i10;
    }

    public void a(Integer num) {
        this.f7233g = num;
    }

    public void a(Object obj) {
        this.f7234h = obj;
    }

    public Object b() {
        return this.f7234h;
    }

    public void b(Integer num) {
        this.f7232f = num;
    }

    public byte[] c() {
        return this.f7227a;
    }

    public String d() {
        return this.f7229c;
    }
}
