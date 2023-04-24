package ci;

import android.content.Context;
import android.text.TextUtils;
import bi.z0;
import java.io.File;
import java.util.List;
import pm.r1;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a */
    public final wc.c f4838a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f4839a;

        /* renamed from: b */
        public final int f4840b;

        public a(int i10, int i11) {
            this.f4839a = i10;
            this.f4840b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f4839a == aVar.f4839a && this.f4840b == aVar.f4840b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f4839a * 31) + this.f4840b;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("StorageSpace(totalSpace=");
            a10.append(this.f4839a);
            a10.append(", freeSpace=");
            return a1.b.a(a10, this.f4840b, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper", f = "PlaybackClientHelper.kt", l = {33, 34, 35, 41, 47}, m = "getSongPushParams")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public Object f4841d;

        /* renamed from: e */
        public Object f4842e;

        /* renamed from: f */
        public Object f4843f;

        /* renamed from: g */
        public /* synthetic */ Object f4844g;

        /* renamed from: i */
        public int f4846i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            v.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4844g = obj;
            this.f4846i |= Integer.MIN_VALUE;
            return v.this.a(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$getSongPushParams$songInfoList$1", f = "PlaybackClientHelper.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<pm.e0, xl.d<? super List<xc.a>>, Object> {

        /* renamed from: e */
        public final /* synthetic */ File f4847e;

        /* renamed from: f */
        public final /* synthetic */ File f4848f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, File file2, xl.d<? super c> dVar) {
            super(2, dVar);
            this.f4847e = file;
            this.f4848f = file2;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super List<xc.a>> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f4847e, this.f4848f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:228:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ci.v.c.t(java.lang.Object):java.lang.Object");
        }
    }

    public v(Context context, wc.c cVar) {
        String str;
        gm.l.f(context, "context");
        this.f4838a = cVar;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            if (wc.a.f29779b == null) {
                synchronized (wc.a.class) {
                    if (wc.a.f29779b == null) {
                        wc.a.f29779b = new wc.a();
                    }
                }
            }
            wc.a aVar = wc.a.f29779b;
            String absolutePath = externalFilesDir.getAbsolutePath();
            aVar.getClass();
            if (TextUtils.isEmpty(absolutePath)) {
                str = "set cache dir failed, input parameter can not be null";
            } else {
                File file = new File(absolutePath);
                if (!file.exists() && !file.mkdirs()) {
                    str = "set cache dir failed, can not create dir in your specified position";
                } else {
                    aVar.f29780a = absolutePath;
                    ge.b.k("set cache dir: " + absolutePath);
                    return;
                }
            }
            ge.b.f(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super ci.j0> r17) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.v.a(xl.d):java.lang.Object");
    }

    public final sm.b b(m mVar, Context context, ci.a aVar) {
        gm.l.f(mVar, "info");
        gm.l.f(context, "context");
        gm.l.f(aVar, "audioInfo");
        return bi.r.l(new c0(this, context, aVar, mVar, null));
    }

    public final Object c(m0 m0Var) {
        Object s10 = z0.s(m0Var, r1.f24386b, new d0(this, null));
        return s10 == yl.a.COROUTINE_SUSPENDED ? s10 : tl.l.f28297a;
    }
}
