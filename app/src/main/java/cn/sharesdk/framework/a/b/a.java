package cn.sharesdk.framework.a.b;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c */
    private static int f5115c;

    /* renamed from: d */
    private static long f5116d;

    /* renamed from: a */
    public int f5117a;

    /* renamed from: b */
    public String f5118b;

    @Override // cn.sharesdk.framework.a.b.c
    public String a() {
        return "[API]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void a(long j10) {
        f5116d = j10;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int c() {
        return 50;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long d() {
        return f5115c;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long e() {
        return f5116d;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void f() {
        f5115c++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        return super.toString() + '|' + this.f5117a + '|' + this.f5118b;
    }
}
