package jb;

import android.content.Context;

/* loaded from: classes.dex */
public final class a extends ib.a {

    /* renamed from: c */
    public final Context f17560c;

    /* renamed from: d */
    public final String f17561d;

    /* renamed from: e */
    public volatile d f17562e;

    /* renamed from: f */
    public final Object f17563f = new Object();

    public a(Context context, String str) {
        this.f17560c = context;
        this.f17561d = str;
    }

    @Override // ib.a
    public final String b(String str) {
        if (str != null) {
            if (this.f17562e == null) {
                synchronized (this.f17563f) {
                    if (this.f17562e == null) {
                        this.f17562e = new d(this.f17560c, this.f17561d);
                    }
                }
            }
            int i10 = 0;
            if (str.length() > 0) {
                while (str.charAt(i10) == '/') {
                    i10++;
                }
            }
            return this.f17562e.c('/' + str.substring(i10));
        }
        throw new NullPointerException("path must not be null.");
    }
}
