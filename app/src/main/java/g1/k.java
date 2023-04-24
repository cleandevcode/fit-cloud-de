package g1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static final o0.f<String, Typeface> f14824a = new o0.f<>(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f14825b;

    /* renamed from: c */
    public static final Object f14826c;

    /* renamed from: d */
    public static final o0.h<String, ArrayList<j1.a<a>>> f14827d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Typeface f14828a;

        /* renamed from: b */
        public final int f14829b;

        public a(int i10) {
            this.f14828a = null;
            this.f14829b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f14828a = typeface;
            this.f14829b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14825b = threadPoolExecutor;
        f14826c = new Object();
        f14827d = new o0.h<>();
    }

    public static a a(String str, Context context, f fVar, int i10) {
        int i11;
        Typeface a10 = f14824a.a(str);
        if (a10 != null) {
            return new a(a10);
        }
        try {
            l a11 = e.a(context, fVar);
            int i12 = a11.f14830a;
            int i13 = 1;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                m[] mVarArr = a11.f14831b;
                if (mVarArr != null && mVarArr.length != 0) {
                    for (m mVar : mVarArr) {
                        int i14 = mVar.f14836e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                    i13 = 0;
                }
                i11 = i13;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface b10 = a1.g.f221a.b(context, a11.f14831b, i10);
            if (b10 != null) {
                f14824a.b(str, b10);
                return new a(b10);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
