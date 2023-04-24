package ci;

import a0.g2;
import android.content.Context;
import bi.z0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import y0.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$startTransfer$1", f = "PlaybackClientHelper.kt", l = {257, 326}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends zl.i implements fm.p<rm.t<? super Integer>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4733e;

    /* renamed from: f */
    public /* synthetic */ Object f4734f;

    /* renamed from: g */
    public final /* synthetic */ v f4735g;

    /* renamed from: h */
    public final /* synthetic */ Context f4736h;

    /* renamed from: i */
    public final /* synthetic */ ci.a f4737i;

    /* renamed from: j */
    public final /* synthetic */ m f4738j;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<tl.l> {

        /* renamed from: b */
        public final /* synthetic */ File f4739b;

        /* renamed from: c */
        public final /* synthetic */ v f4740c;

        /* renamed from: d */
        public final /* synthetic */ b f4741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, v vVar, b bVar) {
            super(0);
            this.f4739b = file;
            this.f4740c = vVar;
            this.f4741d = bVar;
        }

        @Override // fm.a
        public final tl.l m() {
            this.f4739b.delete();
            this.f4740c.f4838a.h(this.f4741d);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends wc.b {

        /* renamed from: a */
        public final /* synthetic */ m f4742a;

        /* renamed from: b */
        public final /* synthetic */ File f4743b;

        /* renamed from: c */
        public final /* synthetic */ rm.t<Integer> f4744c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(m mVar, File file, rm.t<? super Integer> tVar) {
            this.f4742a = mVar;
            this.f4743b = file;
            this.f4744c = tVar;
        }

        @Override // wc.b
        public final void d(boolean z10) {
            String str;
            String str2;
            if (z10) {
                wc.d b10 = wc.d.b();
                m mVar = this.f4742a;
                int i10 = mVar.f4792a;
                int i11 = mVar.f4793b;
                synchronized (b10) {
                    try {
                        if (i10 <= 0) {
                            str = "parameter error, sent packet size is invalid";
                        } else if (i11 <= 0) {
                            str = "parameter error, buffer check size is invalid";
                        } else {
                            b10.f29786d = i10;
                            b10.f29787e = i11 / i10;
                            if (b10.f29788f == null) {
                                b10.f29788f = new LinkedBlockingQueue<>();
                            }
                            b10.f29789g = new AtomicInteger(0);
                            b10.f29790h = new AtomicInteger(0);
                        }
                        ge.b.f(str);
                    } finally {
                    }
                }
                wc.d b11 = wc.d.b();
                File file = this.f4743b;
                synchronized (b11) {
                    if (file == null) {
                        str2 = "input file can not be null";
                    } else if (!file.exists()) {
                        str2 = "input file not exists";
                    } else if (file.length() == 0) {
                        str2 = "input file content cannot be empty";
                    } else if (b11.f29788f == null) {
                        str2 = "start failed, please call init() at first.";
                    } else {
                        b11.a(file);
                    }
                    ge.b.f(str2);
                }
                wc.d.b().f29783a = new s.i(11, this.f4744c);
                return;
            }
            this.f4744c.o(new w0(3));
        }

        @Override // wc.b
        public final void k(int i10) {
            if (i10 == 1) {
                try {
                    gm.f.h(this.f4744c, 100);
                    this.f4744c.o(null);
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            }
            this.f4744c.o(new w0(5));
        }

        @Override // wc.b
        public final void l() {
            this.f4744c.o(new w0(4));
        }

        @Override // wc.b
        public final void m(int i10) {
            String str;
            String str2;
            int i11;
            wc.d b10 = wc.d.b();
            if (b10.f29788f == null) {
                str = "start failed, please call init() at first";
            } else if (b10.f29784b == null) {
                str = "update file, transfer has not yet started";
            } else {
                if (i10 == 241) {
                    str2 = "onTransferSuccess: >>>>> Buffer A can use";
                } else if (i10 == 242) {
                    str2 = "onTransferSuccess: >>>>> Buffer B can use";
                } else {
                    str = "invalid buffer flag!";
                }
                ge.b.p(str2);
                if (b10.f29783a != null) {
                    int doubleValue = (int) (new BigDecimal(b10.f29790h.get()).divide(new BigDecimal(b10.f29791i), 2, 1).doubleValue() * 100.0d);
                    rm.t tVar = (rm.t) b10.f29783a.f25996b;
                    gm.l.f(tVar, "$$this$callbackFlow");
                    if (doubleValue >= 100) {
                        doubleValue = 99;
                    }
                    try {
                        gm.f.h(tVar, Integer.valueOf(doubleValue));
                    } catch (Exception e10) {
                        p000do.a.f13275a.q(e10);
                    }
                }
                StringBuilder a10 = android.support.v4.media.d.a("(transfer/total): [");
                a10.append(b10.f29790h);
                a10.append("/");
                a10.append(b10.f29791i);
                a10.append("]");
                ge.b.d(a10.toString());
                if (b10.f29791i != b10.f29790h.get()) {
                    try {
                        b10.f29788f.put(Integer.valueOf(i10));
                        return;
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                byte b11 = b10.f29792j;
                if (i10 == 241) {
                    i11 = b11 | 1;
                } else {
                    i11 = b11 | 2;
                }
                b10.f29792j = (byte) i11;
                g2.c(android.support.v4.media.d.a("check transmission state: "), b10.f29792j);
                if (b10.f29792j == 3) {
                    ge.b.p("The transmission is complete, valid song...");
                    if (wc.c.f29781j == null) {
                        ge.b.p("please call setup(Context, BeeProManager) first");
                    }
                    wc.c cVar = wc.c.f29781j;
                    int i12 = (int) b10.f29791i;
                    cVar.getClass();
                    if (i12 <= 0) {
                        ge.b.g("song length is invalid", kd.c.f18443f);
                        new h4.l(48, 1);
                        return;
                    }
                    byte[] bArr = new byte[6];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    wrap.putInt(0, i12);
                    wrap.putShort(4, (short) 4660);
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = (byte) 133;
                    bArr2[1] = (byte) 6;
                    System.arraycopy(bArr, 0, bArr2, 2, 6);
                    cVar.g(new ed.b(2, (short) 1669, (short) 1668, bArr2));
                    return;
                }
                return;
            }
            ge.b.f(str);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.PlaybackClientHelper$startTransfer$1$file$1", f = "PlaybackClientHelper.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<pm.e0, xl.d<? super File>, Object> {

        /* renamed from: e */
        public final /* synthetic */ v f4745e;

        /* renamed from: f */
        public final /* synthetic */ Context f4746f;

        /* renamed from: g */
        public final /* synthetic */ ci.a f4747g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v vVar, Context context, ci.a aVar, xl.d<? super c> dVar) {
            super(2, dVar);
            this.f4745e = vVar;
            this.f4746f = context;
            this.f4747g = aVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super File> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f4745e, this.f4746f, this.f4747g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            String str;
            mf.a0.k(obj);
            v vVar = this.f4745e;
            Context context = this.f4746f;
            ci.a aVar = this.f4747g;
            vVar.getClass();
            gm.l.f(context, "context");
            Object obj2 = y0.a.f30807a;
            File[] a10 = a.b.a(context);
            gm.l.e(a10, "getExternalCacheDirs(context)");
            File file = (File) ul.i.B(a10);
            if (file == null || (!file.exists() && !file.mkdirs())) {
                file = null;
            }
            if (file == null) {
                return null;
            }
            String str2 = aVar.f4707c;
            if (str2 != null && str2.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                str = "unknown";
            } else {
                str = aVar.f4707c;
            }
            File file2 = new File(file, str);
            InputStream openInputStream = context.getContentResolver().openInputStream(aVar.f4706b);
            if (openInputStream != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    tl.l lVar = tl.l.f28297a;
                    mf.a0.d(fileOutputStream, null);
                    mf.a0.d(openInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        mf.a0.d(openInputStream, th2);
                        throw th3;
                    }
                }
            }
            return file2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(v vVar, Context context, ci.a aVar, m mVar, xl.d<? super c0> dVar) {
        super(2, dVar);
        this.f4735g = vVar;
        this.f4736h = context;
        this.f4737i = aVar;
        this.f4738j = mVar;
    }

    @Override // fm.p
    public final Object A(rm.t<? super Integer> tVar, xl.d<? super tl.l> dVar) {
        return ((c0) p(tVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c0 c0Var = new c0(this.f4735g, this.f4736h, this.f4737i, this.f4738j, dVar);
        c0Var.f4734f = obj;
        return c0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        File file;
        h4.l g10;
        rm.t tVar;
        Object s10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4733e;
        try {
        } catch (Exception e10) {
            p000do.a.f13275a.q(e10);
            file = null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mf.a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (rm.t) this.f4734f;
            mf.a0.k(obj);
            s10 = obj;
        } else {
            mf.a0.k(obj);
            tVar = (rm.t) this.f4734f;
            wm.b bVar = pm.o0.f24382b;
            c cVar = new c(this.f4735g, this.f4736h, this.f4737i, null);
            this.f4734f = tVar;
            this.f4733e = 1;
            s10 = z0.s(this, bVar, cVar);
            if (s10 == aVar) {
                return aVar;
            }
        }
        file = (File) s10;
        if (file == null) {
            tVar.o(new w0(1));
            return tl.l.f28297a;
        }
        b bVar2 = new b(this.f4738j, file, tVar);
        this.f4735g.f4838a.e(bVar2);
        wc.c cVar2 = this.f4735g.f4838a;
        cVar2.getClass();
        if (!file.exists()) {
            ge.b.g("song file not exists", kd.c.f18443f);
            g10 = new h4.l(48, 1);
        } else if (file.length() == 0) {
            ge.b.g("file content cannot be empty", kd.c.f18443f);
            g10 = new h4.l(48, 1);
        } else {
            byte[] bytes = file.getName().getBytes(StandardCharsets.UTF_16LE);
            int length = bytes.length + 2;
            int length2 = (int) file.length();
            ge.b.q("enter transfer mode: [songNameLen: " + length + ", songLen: " + length2 + "]", kd.c.f18443f);
            int i11 = length + 2;
            int i12 = i11 + 4;
            byte[] bArr = new byte[i12];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            wrap.putShort(0, (short) length);
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            wrap.putInt(i11, length2);
            byte[] bArr2 = new byte[i12 + 2];
            bArr2[0] = (byte) 130;
            bArr2[1] = (byte) 6;
            if (i12 > 0) {
                System.arraycopy(bArr, 0, bArr2, 2, i12);
            }
            g10 = cVar2.g(new ed.b(2, (short) 1666, (short) 1666, bArr2));
        }
        if (g10.f15867b != 0) {
            file.delete();
            this.f4735g.f4838a.h(bVar2);
            tVar.o(new w0(2));
        } else {
            a aVar2 = new a(file, this.f4735g, bVar2);
            this.f4734f = null;
            this.f4733e = 2;
            if (rm.r.a(tVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
