package com.topstep.fitcloud.pro.ui.camera;

import a0.a1;
import a0.b0;
import android.annotation.SuppressLint;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.r2;
import androidx.camera.core.a;
import androidx.camera.core.e;
import androidx.camera.core.m;
import com.topstep.fitcloud.pro.databinding.FragmentCameraBinding;
import com.topstep.fitcloud.pro.ui.widget.CountDownView;
import com.topstep.fitcloudpro.R;
import fm.p;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jj.o0;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import og.c1;
import og.t;
import oh.l;
import p000do.a;
import pm.e0;
import tl.i;
import y.e1;
import y.g;

@Metadata
/* loaded from: classes2.dex */
public final class CameraFragment extends l {
    public static final a F0;
    public static final /* synthetic */ h<Object>[] G0;
    public androidx.camera.core.h A0;
    public androidx.camera.core.e B0;
    public g C0;
    public androidx.camera.lifecycle.e D0;
    public t E0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10414t0;

    /* renamed from: u0 */
    public ExecutorService f10415u0;

    /* renamed from: v0 */
    public final i f10416v0;

    /* renamed from: w0 */
    public final d f10417w0;

    /* renamed from: x0 */
    public int f10418x0;

    /* renamed from: y0 */
    public int f10419y0;

    /* renamed from: z0 */
    public m f10420z0;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b implements e.a {

        /* renamed from: a */
        public final ArrayDeque<Long> f10421a;

        /* renamed from: b */
        public final ArrayList<fm.l<Double, tl.l>> f10422b;

        public b() {
            c cVar = c.f10423b;
            this.f10421a = new ArrayDeque<>(5);
            ArrayList<fm.l<Double, tl.l>> arrayList = new ArrayList<>();
            arrayList.add(cVar);
            this.f10422b = arrayList;
        }

        @Override // androidx.camera.core.e.a
        public final /* synthetic */ void a() {
        }

        @Override // androidx.camera.core.e.a
        public final void b(e1 e1Var) {
            double d10;
            if (this.f10422b.isEmpty()) {
                e1Var.close();
                return;
            }
            this.f10421a.push(Long.valueOf(System.currentTimeMillis()));
            while (this.f10421a.size() >= 8) {
                this.f10421a.removeLast();
            }
            Long peekFirst = this.f10421a.peekFirst();
            if (peekFirst != null) {
                peekFirst.longValue();
            }
            Long peekLast = this.f10421a.peekLast();
            if (peekLast != null) {
                peekLast.longValue();
            }
            this.f10421a.size();
            Long first = this.f10421a.getFirst();
            gm.l.e(first, "frameTimestamps.first");
            first.longValue();
            int i10 = 0;
            ByteBuffer a10 = ((a.C0021a) e1Var.l()[0]).a();
            gm.l.e(a10, "image.planes[0].buffer");
            a10.rewind();
            int remaining = a10.remaining();
            byte[] bArr = new byte[remaining];
            a10.get(bArr);
            ArrayList arrayList = new ArrayList(remaining);
            for (int i11 = 0; i11 < remaining; i11++) {
                arrayList.add(Integer.valueOf(bArr[i11] & 255));
            }
            Iterator it = arrayList.iterator();
            double d11 = 0.0d;
            while (it.hasNext()) {
                d11 += ((Number) it.next()).intValue();
                i10++;
                if (i10 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            if (i10 == 0) {
                d10 = Double.NaN;
            } else {
                d10 = d11 / i10;
            }
            Iterator<fm.l<Double, tl.l>> it2 = this.f10422b.iterator();
            while (it2.hasNext()) {
                it2.next().k(Double.valueOf(d10));
            }
            e1Var.close();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Double, tl.l> {

        /* renamed from: b */
        public static final c f10423b = new c();

        public c() {
            super(1);
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Double d10) {
            d10.doubleValue();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements DisplayManager.DisplayListener {
        public d() {
            CameraFragment.this = r1;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            b0 a10;
            CameraFragment cameraFragment = CameraFragment.this;
            View view = cameraFragment.H;
            if (view != null) {
                if (i10 == cameraFragment.f10418x0) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Camera");
                    bVar.b("Rotation changed: " + view.getDisplay().getRotation(), new Object[0]);
                    androidx.camera.core.h hVar = cameraFragment.A0;
                    if (hVar != null) {
                        int rotation = view.getDisplay().getRotation();
                        int x10 = ((a1) hVar.f1805f).x(0);
                        if (hVar.v(rotation) && hVar.f1662s != null) {
                            hVar.f1662s = i0.a.a(Math.abs(b0.c.u(rotation) - b0.c.u(x10)), hVar.f1662s);
                        }
                    }
                    androidx.camera.core.e eVar = cameraFragment.B0;
                    if (eVar != null && eVar.v(view.getDisplay().getRotation()) && (a10 = eVar.a()) != null) {
                        eVar.f1625m.f1632b = eVar.g(a10);
                    }
                }
                tl.l lVar = tl.l.f28297a;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<DisplayManager> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            CameraFragment.this = r1;
        }

        @Override // fm.a
        public final DisplayManager m() {
            Object systemService = CameraFragment.this.V0().getSystemService("display");
            gm.l.d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            return (DisplayManager) systemService;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.camera.CameraFragment$onViewCreated$2", f = "CameraFragment.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10426e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ CameraFragment f10428a;

            public a(CameraFragment cameraFragment) {
                this.f10428a = cameraFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                int i10 = ((pj.a) obj).f24277a;
                if (i10 == 21) {
                    CameraFragment cameraFragment = this.f10428a;
                    a aVar = CameraFragment.F0;
                    ImageButton imageButton = cameraFragment.i1().btnShutter;
                    gm.l.e(imageButton, "viewBind.btnShutter");
                    imageButton.performClick();
                    imageButton.setPressed(true);
                    imageButton.invalidate();
                    imageButton.postDelayed(new r2(12, imageButton), 50L);
                } else if (i10 == 23) {
                    this.f10428a.T0().finish();
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            CameraFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10426e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                t tVar = CameraFragment.this.E0;
                if (tVar != null) {
                    sm.b d10 = qi.h.d(((o0) tVar.d().f23241a).a());
                    a aVar2 = new a(CameraFragment.this);
                    this.f10426e = 1;
                    if (d10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("deviceManager");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(CameraFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentCameraBinding;", 0);
        gm.b0.f15488a.getClass();
        G0 = new h[]{tVar};
        F0 = new a();
    }

    public CameraFragment() {
        super(R.layout.fragment_camera);
        this.f10414t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentCameraBinding.class, this);
        this.f10416v0 = new i(new e());
        this.f10417w0 = new d();
        this.f10418x0 = -1;
        this.f10419y0 = 1;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        ExecutorService executorService = this.f10415u0;
        if (executorService != null) {
            executorService.shutdown();
            ((DisplayManager) this.f10416v0.getValue()).unregisterDisplayListener(this.f10417w0);
            return;
        }
        gm.l.l("cameraExecutor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        CountDownView countDownView = i1().countDownView;
        if (countDownView.f12256h > 0) {
            countDownView.f12256h = 0;
            countDownView.f12255g.removeMessages(1);
            countDownView.f12249a.setText((CharSequence) null);
        }
        t tVar = this.E0;
        if (tVar != null) {
            c1 d10 = tVar.d();
            a0.j(d10.f23242b, new og.a1(d10, false, null));
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        if (!si.f.c(si.f.f27071a, V0(), h7.a.p("android.permission.CAMERA"))) {
            tb.a.f(this).l(R.id.toPermission, new Bundle(), null);
        }
        t tVar = this.E0;
        if (tVar != null) {
            c1 d10 = tVar.d();
            a0.j(d10.f23242b, new og.a1(d10, true, null));
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    @Override // lh.c, androidx.fragment.app.r
    @SuppressLint({"MissingPermission"})
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        gm.l.e(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f10415u0 = newSingleThreadExecutor;
        ((DisplayManager) this.f10416v0.getValue()).registerDisplayListener(this.f10417w0, null);
        i1().viewFinder.post(new s.m(10, this));
        qi.h.k(qi.h.i(this), new f(null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(1:(1:(7:10|11|12|13|(4:15|16|17|(2:19|20))|24|(10:26|1a8|38|(2:40|(2:41|(3:43|(3:45|46|47)(1:49)|48)(1:50)))(0)|51|52|53|(1:55)|56|(2:58|60)(1:61))(2:69|70))(1:73))(1:75))(1:76)|74|11|12|13|(0)|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0170, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h1() {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.camera.CameraFragment.h1():void");
    }

    public final FragmentCameraBinding i1() {
        return (FragmentCameraBinding) this.f10414t0.a(this, G0[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x003e, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0029  */
    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            java.lang.String r0 = "newConfig"
            gm.l.f(r5, r0)
            r5 = 1
            r4.E = r5
            r4.h1()
            com.topstep.fitcloud.pro.databinding.FragmentCameraBinding r0 = r4.i1()
            android.widget.ImageView r0 = r0.imgFacing
            androidx.camera.lifecycle.e r1 = r4.D0
            r2 = 0
            if (r1 == 0) goto L26
            y.p r3 = y.p.f30748c
            y.u r1 = r1.f1846e     // Catch: java.lang.IllegalArgumentException -> L25
            a0.c0 r1 = r1.f30771a     // Catch: java.lang.IllegalArgumentException -> L25
            java.util.LinkedHashSet r1 = r1.a()     // Catch: java.lang.IllegalArgumentException -> L25
            r3.d(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r1 = 1
            goto L27
        L25:
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L41
            androidx.camera.lifecycle.e r1 = r4.D0
            if (r1 == 0) goto L3d
            y.p r3 = y.p.f30747b
            y.u r1 = r1.f1846e     // Catch: java.lang.IllegalArgumentException -> L3c
            a0.c0 r1 = r1.f30771a     // Catch: java.lang.IllegalArgumentException -> L3c
            java.util.LinkedHashSet r1 = r1.a()     // Catch: java.lang.IllegalArgumentException -> L3c
            r3.d(r1)     // Catch: java.lang.IllegalArgumentException -> L3c
            r1 = 1
            goto L3e
        L3c:
        L3d:
            r1 = 0
        L3e:
            if (r1 == 0) goto L41
            goto L42
        L41:
            r5 = 0
        L42:
            r0.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.camera.CameraFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }
}
