package cn.sharesdk.framework.a.b;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: d */
    private static int f5133d;

    /* renamed from: m */
    private static long f5134m;

    /* renamed from: a */
    public String f5135a;

    /* renamed from: b */
    public int f5136b;

    /* renamed from: c */
    public String f5137c = "";

    @Override // cn.sharesdk.framework.a.b.c
    public String a() {
        return "[EVT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void a(long j10) {
        f5134m = j10;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long d() {
        return f5133d;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long e() {
        return f5134m;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void f() {
        f5133d++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        return super.toString() + '|' + this.f5135a + '|' + this.f5136b + '|' + this.f5137c;
    }
}
