package ci;

import android.text.TextUtils;
import java.io.File;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$requestBinFile$2", f = "PlaybackClientHelper.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends zl.i implements fm.p<pm.e0, xl.d<? super File>, Object> {

    /* renamed from: e */
    public int f4873e;

    /* renamed from: f */
    public final /* synthetic */ v f4874f;

    /* renamed from: g */
    public final /* synthetic */ byte f4875g;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ v f4876b;

        /* renamed from: c */
        public final /* synthetic */ b f4877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, b bVar) {
            super(1);
            this.f4876b = vVar;
            this.f4877c = bVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestBinFile cancel", new Object[0]);
            this.f4876b.f4838a.h(this.f4877c);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ v f4878a;

        /* renamed from: b */
        public final /* synthetic */ pm.i<File> f4879b;

        /* renamed from: c */
        public final /* synthetic */ gm.a0<File> f4880c;

        /* renamed from: d */
        public final /* synthetic */ byte f4881d;

        public b(v vVar, pm.j jVar, gm.a0 a0Var, byte b10) {
            this.f4878a = vVar;
            this.f4879b = jVar;
            this.f4880c = a0Var;
            this.f4881d = b10;
        }

        @Override // wc.b
        public final void g(byte[] bArr) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.p("onGetFileContentReport:%s", bi.r.h(bArr));
            File file = this.f4880c.f15485a;
            if (file != null) {
                v vVar = this.f4878a;
                pm.i<File> iVar = this.f4879b;
                if (!tb.a.u(file, bArr)) {
                    bVar.t("SongPush");
                    bVar.h("requestBinFile fail:binFile write", new Object[0]);
                    vVar.f4838a.h(this);
                    iVar.l(mf.a0.f(new q()));
                }
            }
        }

        @Override // wc.b
        public final void h(byte[] bArr) {
            File file;
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.p("onGetFileFooterReport:%s", bi.r.h(bArr));
            File file2 = this.f4880c.f15485a;
            if (file2 != null) {
                v vVar = this.f4878a;
                pm.i<File> iVar = this.f4879b;
                if (!tb.a.u(file2, bArr)) {
                    bVar.t("SongPush");
                    bVar.h("requestBinFile fail:binFile write", new Object[0]);
                    vVar.f4838a.h(this);
                    iVar.l(mf.a0.f(new q()));
                }
            }
            if (this.f4879b.a()) {
                bVar.t("SongPush");
                Object[] objArr = new Object[1];
                File file3 = this.f4880c.f15485a;
                if (file3 != null) {
                    file = file3.getAbsoluteFile();
                } else {
                    file = null;
                }
                objArr[0] = file;
                bVar.h("requestBinFile success:%s", objArr);
                this.f4878a.f4838a.h(this);
                this.f4879b.l(this.f4880c.f15485a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wc.b
        public final void i(int i10, long j10) {
            String str;
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.p("onGetFileHeaderReport:%d  %d", Integer.valueOf(i10), Long.valueOf(j10));
            T t10 = 0;
            t10 = 0;
            t10 = 0;
            if (j10 == 0) {
                bVar.t("SongPush");
                bVar.h("requestBinFile success:null", new Object[0]);
                this.f4878a.f4838a.h(this);
                this.f4879b.l(null);
                return;
            }
            if (wc.a.f29779b == null) {
                synchronized (wc.a.class) {
                    if (wc.a.f29779b == null) {
                        wc.a.f29779b = new wc.a();
                    }
                }
            }
            String str2 = wc.a.f29779b.f29780a;
            gm.a0<File> a0Var = this.f4880c;
            if (this.f4881d == 0) {
                str = "header.bin";
            } else {
                str = "name.bin";
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                File file = new File(str2, str);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    if (file.createNewFile()) {
                        t10 = file;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                ge.b.f("create failed, input dir and name can not be null");
            }
            a0Var.f15485a = t10;
            if (this.f4880c.f15485a == null) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("SongPush");
                bVar2.h("requestBinFile fail:binFile create", new Object[0]);
                this.f4878a.f4838a.h(this);
                this.f4879b.l(mf.a0.f(new q()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, byte b10, xl.d<? super z> dVar) {
        super(2, dVar);
        this.f4874f = vVar;
        this.f4875g = b10;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super File> dVar) {
        return ((z) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new z(this.f4874f, this.f4875g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4873e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4874f;
            byte b10 = this.f4875g;
            this.f4873e = 1;
            pm.j jVar = new pm.j(1, mf.a0.i(this));
            jVar.u();
            a.b bVar = p000do.a.f13275a;
            bVar.t("SongPush");
            bVar.h("requestBinFile start", new Object[0]);
            byte b11 = b10;
            b bVar2 = new b(vVar, jVar, new gm.a0(), b11);
            vVar.f4838a.e(bVar2);
            jVar.z(new a(vVar, bVar2));
            wc.c cVar = vVar.f4838a;
            cVar.getClass();
            byte[] bArr = {b11};
            byte[] bArr2 = {(byte) 129, (byte) 6};
            System.arraycopy(bArr, 0, bArr2, 2, 1);
            h4.l g10 = cVar.g(new ed.b(1, (short) 1665, (short) 0, bArr2));
            if (g10.f15867b != 0) {
                bVar.t("SongPush");
                bVar.h("requestBinFile fail:beeError:%d", new Integer(g10.f15867b));
                vVar.f4838a.h(bVar2);
                jVar.l(mf.a0.f(new q()));
            }
            obj = jVar.t();
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
