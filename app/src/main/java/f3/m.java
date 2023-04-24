package f3;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a */
    public static m f14093a;

    /* loaded from: classes.dex */
    public static class a extends m {

        /* renamed from: b */
        public int f14094b;

        public a(int i10) {
            this.f14094b = i10;
        }

        @Override // f3.m
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f14094b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // f3.m
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f14094b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // f3.m
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f14094b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // f3.m
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f14094b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized m c() {
        m mVar;
        synchronized (m.class) {
            if (f14093a == null) {
                f14093a = new a(3);
            }
            mVar = f14093a;
        }
        return mVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
