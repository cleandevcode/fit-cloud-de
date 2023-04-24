package kj;

import android.app.Application;
import android.content.Context;
import bk.h;
import gm.l;
import hj.p;

/* loaded from: classes2.dex */
public final class g extends bk.f<f> {

    /* loaded from: classes2.dex */
    public static final class a implements h<f> {
        @Override // bk.h
        public final f a(Context context, hj.a aVar) {
            l.f(context, "context");
            l.f(aVar, "connector");
            return new f(context, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Application application, p pVar) {
        super(application, pVar, new a());
        l.f(application, "application");
        l.f(pVar, "connector");
    }
}
