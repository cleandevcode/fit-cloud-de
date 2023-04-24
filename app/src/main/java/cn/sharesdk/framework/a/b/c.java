package cn.sharesdk.framework.a.b;

import com.mob.MobSDK;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: e */
    public long f5125e;

    /* renamed from: f */
    public String f5126f;

    /* renamed from: g */
    public String f5127g;

    /* renamed from: h */
    public int f5128h;

    /* renamed from: i */
    public String f5129i;

    /* renamed from: j */
    public int f5130j;

    /* renamed from: k */
    public String f5131k;

    /* renamed from: l */
    public String f5132l;

    public abstract String a();

    public abstract void a(long j10);

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract void f();

    public boolean g() {
        int b10 = b();
        int c10 = c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - e() < b10) {
            return d() < ((long) c10);
        }
        a(currentTimeMillis);
        return true;
    }

    public void h() {
        f();
    }

    public String toString() {
        return a() + ':' + this.f5125e + '|' + this.f5126f + '|' + MobSDK.getAppkey() + '|' + this.f5127g + '|' + this.f5128h + '|' + this.f5129i + '|' + this.f5130j + '|' + this.f5131k;
    }
}
