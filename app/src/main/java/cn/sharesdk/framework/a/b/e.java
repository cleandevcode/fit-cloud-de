package cn.sharesdk.framework.a.b;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: b */
    private static int f5138b;

    /* renamed from: c */
    private static long f5139c;

    /* renamed from: a */
    public long f5140a;

    @Override // cn.sharesdk.framework.a.b.c
    public String a() {
        return "[EXT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void a(long j10) {
        f5139c = j10;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long d() {
        return f5138b;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long e() {
        return f5139c;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void f() {
        f5138b++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public boolean g() {
        cn.sharesdk.framework.a.a.e a10 = cn.sharesdk.framework.a.a.e.a();
        f5138b = a10.j("insertExitEventCount");
        f5139c = a10.i("lastInsertExitEventTime");
        return super.g();
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void h() {
        super.h();
        cn.sharesdk.framework.a.a.e a10 = cn.sharesdk.framework.a.a.e.a();
        a10.a("lastInsertExitEventTime", Long.valueOf(f5139c));
        a10.a("insertExitEventCount", f5138b);
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder(super.toString());
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5132l)) {
            sb2.append(this.f5132l);
        }
        sb2.append('|');
        sb2.append(Math.round(((float) this.f5140a) / 1000.0f));
        return sb2.toString();
    }
}
