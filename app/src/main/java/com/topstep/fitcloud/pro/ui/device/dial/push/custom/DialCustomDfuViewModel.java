package com.topstep.fitcloud.pro.ui.device.dial.push.custom;

import android.app.Application;
import android.os.Environment;
import android.support.v4.media.d;
import androidx.lifecycle.l0;
import bi.z0;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import gm.l;
import java.io.File;
import kotlin.Metadata;
import nh.f;
import ul.i;
import y0.a;
import y3.d1;
import zh.g;

@Metadata
/* loaded from: classes2.dex */
public final class DialCustomDfuViewModel extends f<b, a> {

    /* renamed from: h */
    public final Application f11004h;

    /* renamed from: i */
    public final g f11005i;

    /* renamed from: j */
    public final DialPushParams f11006j;

    /* renamed from: k */
    public final File f11007k;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomDfuViewModel$a$a */
        /* loaded from: classes2.dex */
        public static final class C0165a extends a {

            /* renamed from: a */
            public final Throwable f11008a;

            public C0165a(Throwable th2) {
                l.f(th2, "error");
                this.f11008a = th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final y3.b<File> f11009a;

        /* renamed from: b */
        public final int f11010b;

        public b() {
            this(0);
        }

        public /* synthetic */ b(int i10) {
            this(d1.f30940b, -1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(y3.b<? extends File> bVar, int i10) {
            l.f(bVar, "dialFile");
            this.f11009a = bVar;
            this.f11010b = i10;
        }

        public static b a(b bVar, y3.b bVar2, int i10, int i11) {
            if ((i11 & 1) != 0) {
                bVar2 = bVar.f11009a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f11010b;
            }
            bVar.getClass();
            l.f(bVar2, "dialFile");
            return new b(bVar2, i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return l.a(this.f11009a, bVar.f11009a) && this.f11010b == bVar.f11010b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f11009a.hashCode() * 31) + this.f11010b;
        }

        public final String toString() {
            StringBuilder a10 = d.a("State(dialFile=");
            a10.append(this.f11009a);
            a10.append(", progress=");
            return a1.b.a(a10, this.f11010b, ')');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialCustomDfuViewModel(Application application, l0 l0Var) {
        super(new b(0));
        l.f(l0Var, "savedStateHandle");
        this.f11004h = application;
        Object obj = l0Var.f2739a.get("custom_item");
        l.c(obj);
        this.f11005i = (g) obj;
        Object obj2 = l0Var.f2739a.get("push_params");
        l.c(obj2);
        this.f11006j = (DialPushParams) obj2;
        String str = Environment.DIRECTORY_DOWNLOADS;
        Object obj3 = y0.a.f30807a;
        File[] b10 = a.b.b(application, str);
        l.e(b10, "getExternalFilesDirs(con…ment.DIRECTORY_DOWNLOADS)");
        File file = (File) i.B(b10);
        if (file == null || (!file.exists() && !file.mkdirs())) {
            file = null;
        }
        this.f11007k = file;
        z0.g(rm.l.h(this), null, 0, new zh.d(this, null), 3);
    }
}
