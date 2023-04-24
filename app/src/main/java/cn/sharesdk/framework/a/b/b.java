package cn.sharesdk.framework.a.b;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Data;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: m */
    private static int f5119m;

    /* renamed from: n */
    private static long f5120n;

    /* renamed from: a */
    public int f5121a;

    /* renamed from: b */
    public String f5122b;

    /* renamed from: c */
    public String f5123c;

    /* renamed from: d */
    public String f5124d;

    @Override // cn.sharesdk.framework.a.b.c
    public String a() {
        return "[AUT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void a(long j10) {
        f5120n = j10;
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
        return f5119m;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long e() {
        return f5120n;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void f() {
        f5119m++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder(super.toString());
        sb2.append('|');
        sb2.append(this.f5121a);
        sb2.append('|');
        sb2.append(this.f5122b);
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5124d)) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f5126f.substring(0, 16), this.f5124d), 0);
                if (!TextUtils.isEmpty(encodeToString) && encodeToString.contains("\n")) {
                    encodeToString = encodeToString.replace("\n", "");
                }
                sb2.append(encodeToString);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        }
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5132l)) {
            sb2.append(this.f5132l);
        }
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5123c)) {
            sb2.append(this.f5123c);
        }
        return sb2.toString();
    }
}
