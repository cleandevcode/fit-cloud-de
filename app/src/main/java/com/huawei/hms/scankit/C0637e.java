package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.p.C0657e;
import com.huawei.hms.scankit.p.C0661f;
import com.huawei.hms.scankit.p.C0663fb;
import com.huawei.hms.scankit.p.C0665g;
import com.huawei.hms.scankit.p.C0675ib;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.e */
/* loaded from: classes.dex */
public class C0637e implements InterfaceC0638f, InterfaceC0640h, InterfaceC0639g {

    /* renamed from: a */
    public static final String f7371a = "e";

    /* renamed from: b */
    public static volatile C0675ib f7372b;
    private IObjectWrapper A;
    private A B;
    private IOnResultCallback C;
    private IOnErrorCallback G;

    /* renamed from: d */
    private final Rect f7374d;

    /* renamed from: e */
    private final int f7375e;

    /* renamed from: f */
    private final boolean f7376f;

    /* renamed from: g */
    private Context f7377g;

    /* renamed from: h */
    private HandlerC0627a f7378h;

    /* renamed from: i */
    private B f7379i;

    /* renamed from: j */
    private C0657e f7380j;

    /* renamed from: k */
    private ViewfinderView f7381k;

    /* renamed from: l */
    private TextureView f7382l;

    /* renamed from: m */
    private TextureView.SurfaceTextureListener f7383m;

    /* renamed from: n */
    private Collection<BarcodeFormat> f7384n;

    /* renamed from: o */
    private Map<EnumC0631d, ?> f7385o;

    /* renamed from: p */
    private String f7386p;

    /* renamed from: r */
    private String f7388r;

    /* renamed from: t */
    private float f7390t;

    /* renamed from: x */
    private boolean f7394x;

    /* renamed from: y */
    private boolean f7395y;

    /* renamed from: z */
    private boolean f7396z;

    /* renamed from: c */
    public volatile C0663fb f7373c = null;

    /* renamed from: s */
    private boolean f7389s = true;

    /* renamed from: u */
    private boolean f7391u = true;

    /* renamed from: v */
    private boolean f7392v = false;

    /* renamed from: w */
    private boolean f7393w = true;
    private boolean D = false;
    private boolean E = false;
    private boolean H = true;

    /* renamed from: q */
    private boolean f7387q = false;
    private boolean F = false;

    public C0637e(Context context, TextureView textureView, ViewfinderView viewfinderView, Rect rect, int i10, IObjectWrapper iObjectWrapper, boolean z10, String str, boolean z11) {
        this.f7377g = context;
        this.f7381k = viewfinderView;
        this.A = iObjectWrapper;
        this.f7382l = textureView;
        this.f7374d = rect;
        this.f7375e = i10;
        this.f7376f = z10;
        this.f7388r = str;
        this.f7395y = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.p.C0645b a(android.content.Context r7) {
        /*
            r6 = this;
            android.app.Activity r7 = (android.app.Activity) r7
            android.view.WindowManager r7 = r7.getWindowManager()
            android.view.Display r7 = r7.getDefaultDisplay()
            int r7 = r7.getRotation()
            java.lang.String r0 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r1 = "initCameraConfig:false"
            android.util.Log.i(r0, r1)
            r0 = 90
            r1 = 0
            r2 = 1080(0x438, float:1.513E-42)
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1
            if (r7 == 0) goto L73
            if (r7 == r4) goto L5c
            r5 = 2
            if (r7 == r5) goto L47
            r5 = 3
            if (r7 == r5) goto L32
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r3, r2)
            goto L7d
        L32:
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r0)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            r0 = 180(0xb4, float:2.52E-43)
            goto L85
        L47:
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r0)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            r0 = 270(0x10e, float:3.78E-43)
            goto L85
        L5c:
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r0)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            com.huawei.hms.scankit.p.b$a r7 = r7.b(r1)
            goto L89
        L73:
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r3, r2)
        L7d:
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r5)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
        L85:
            com.huawei.hms.scankit.p.b$a r7 = r7.b(r0)
        L89:
            com.huawei.hms.scankit.p.b$a r7 = r7.b(r1)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            com.huawei.hms.scankit.p.b r7 = r7.a()
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "ceres-c3"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lbd
            com.huawei.hms.scankit.p.b$a r7 = new com.huawei.hms.scankit.p.b$a
            r7.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r3)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r0)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            com.huawei.hms.scankit.p.b$a r7 = r7.b(r1)
            com.huawei.hms.scankit.p.b$a r7 = r7.a(r4)
            com.huawei.hms.scankit.p.b r7 = r7.a()
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.C0637e.a(android.content.Context):com.huawei.hms.scankit.p.b");
    }

    public void a(TextureView textureView) {
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            com.huawei.hms.scankit.util.a.d(f7371a, "initCamera() no surface view");
            return;
        }
        try {
            this.f7380j.a(textureView);
            this.f7380j.a(Collections.singletonList(new C0661f.a(new Rect(-150, -150, 150, 150), 1000)));
            try {
                this.f7380j.m();
            } catch (Exception e10) {
                com.huawei.hms.scankit.util.a.b(f7371a, "initCamera() get exception");
                e10.printStackTrace();
            }
            if (this.f7378h == null) {
                HandlerC0627a handlerC0627a = new HandlerC0627a(this.f7377g, this.f7381k, this.f7379i, this.f7384n, this.f7385o, this.f7386p, this.f7380j, this.f7374d, this.f7375e, this.f7395y, this.H);
                this.f7378h = handlerC0627a;
                handlerC0627a.c(this.f7394x);
                this.f7378h.a(this.f7396z);
                this.f7378h.b(this.f7391u);
                this.f7378h.a(this.B);
            }
        } catch (Exception e11) {
            if (this.f7373c != null) {
                this.f7373c.c(-1002);
            }
            com.huawei.hms.scankit.util.a.a(f7371a, "initCamera IOException", e11);
            e11.printStackTrace();
        }
    }

    private void a(boolean z10, C0657e c0657e) {
        try {
            C0665g g10 = c0657e.g();
            if (!c0657e.i()) {
                com.huawei.hms.scankit.util.a.c(f7371a, "zoom not supported");
                return;
            }
            int c10 = g10.c();
            int b10 = g10.b();
            if (z10 && b10 < c10) {
                b10++;
            } else if (b10 > 0) {
                b10--;
            } else {
                com.huawei.hms.scankit.util.a.c(f7371a, "handleZoom  zoom not change");
            }
            c0657e.c(b10);
        } catch (RuntimeException unused) {
            Log.e(f7371a, "handleZoom: RuntimeException");
        }
    }

    private float b(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        double sqrt = Math.sqrt((y10 * y10) + (x10 * x10));
        if (Double.isInfinite(sqrt) || Double.isNaN(sqrt)) {
            return 0.0f;
        }
        return BigDecimal.valueOf(sqrt).floatValue();
    }

    private void i() {
        HandlerC0627a handlerC0627a = this.f7378h;
        if (handlerC0627a != null) {
            handlerC0627a.e();
            this.f7378h = null;
        }
        if (!this.f7387q) {
            this.f7382l.setSurfaceTextureListener(null);
        }
        this.f7380j.k();
    }

    public C0637e a(A a10) {
        this.B = a10;
        return this;
    }

    public C0637e a(boolean z10) {
        this.f7396z = z10;
        HandlerC0627a handlerC0627a = this.f7378h;
        if (handlerC0627a != null) {
            handlerC0627a.a(z10);
        }
        return this;
    }

    public C0657e a() {
        return this.f7380j;
    }

    public void a(IOnErrorCallback iOnErrorCallback) {
        this.G = iOnErrorCallback;
    }

    public void a(IOnResultCallback iOnResultCallback) {
        this.C = iOnResultCallback;
    }

    public void a(HmsScan[] hmsScanArr, Bitmap bitmap) {
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder a10 = android.support.v4.media.d.a("decode time:");
        a10.append(System.currentTimeMillis());
        com.huawei.hms.scankit.util.a.a("scan-time", a10.toString());
        try {
            String str3 = f7371a;
            com.huawei.hms.scankit.util.a.c(str3, "result onResult");
            if (this.B.a()) {
                com.huawei.hms.scankit.util.a.c(str3, "result intercepted");
                return;
            }
            if (this.f7373c != null) {
                this.f7373c.a(hmsScanArr);
            }
            if (!this.f7376f) {
                hmsScanArr = com.huawei.hms.scankit.util.b.a(hmsScanArr);
            }
            if (this.B != null) {
                if (this.f7381k != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                    com.huawei.hms.scankit.util.a.c(str3, "result draw result point");
                    if (this.f7377g instanceof Activity) {
                        this.f7381k.a(hmsScanArr[0].getBorderRect(), com.huawei.hms.scankit.util.b.c((Activity) this.f7377g), this.f7380j.e());
                    }
                    this.F = false;
                }
                this.B.a(hmsScanArr);
            }
            if (this.C != null) {
                try {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("result callback end: pauseStatus");
                    sb3.append(this.F);
                    com.huawei.hms.scankit.util.a.c(str3, sb3.toString());
                    if (!this.F) {
                        if (this.f7396z && hmsScanArr != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                            Context context = this.f7377g;
                            if (context instanceof Activity) {
                                int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
                                hmsScanArr[0].originalBitmap = com.huawei.hms.scankit.util.b.a(bitmap, rotation);
                            }
                        }
                        this.C.onResult(hmsScanArr);
                    }
                } catch (RemoteException e10) {
                    if (this.f7373c != null) {
                        this.f7373c.c(-1003);
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("onResult  RemoteException  e:");
                    sb4.append(e10);
                    com.huawei.hms.scankit.util.a.d("CaptureHelper", sb4.toString());
                }
            }
        } catch (RuntimeException e11) {
            e = e11;
            str = f7371a;
            sb2 = new StringBuilder();
            str2 = "onResult:RuntimeException ";
            sb2.append(str2);
            sb2.append(e);
            Log.e(str, sb2.toString());
        } catch (Exception e12) {
            e = e12;
            str = f7371a;
            sb2 = new StringBuilder();
            str2 = "onResult:Exception: ";
            sb2.append(str2);
            sb2.append(e);
            Log.e(str, sb2.toString());
        }
    }

    public boolean a(MotionEvent motionEvent) {
        float b10;
        if (!this.f7389s || this.f7380j.f().a() < C0657e.b.CAMERA_OPENED.a() || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action == 5) {
                b10 = b(motionEvent);
            }
            return true;
        }
        b10 = b(motionEvent);
        float f10 = this.f7390t;
        if (b10 > f10 + 6.0f) {
            a(true, this.f7380j);
        } else if (b10 < f10 - 6.0f) {
            a(false, this.f7380j);
        } else {
            com.huawei.hms.scankit.util.a.c("CaptureHelper", "MotionEvent.ACTION_MOVE no handleZoom");
        }
        this.f7390t = b10;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r3 = this;
            r0 = 0
            r3.F = r0
            com.huawei.hms.feature.dynamic.IObjectWrapper r0 = r3.A     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            java.lang.Object r0 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            com.huawei.hms.scankit.p.ib r1 = new com.huawei.hms.scankit.p.ib     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            java.lang.String r2 = r3.f7388r     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            com.huawei.hms.scankit.C0637e.f7372b = r1     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            com.huawei.hms.scankit.p.ib r0 = com.huawei.hms.scankit.C0637e.f7372b     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            java.lang.String r1 = "single"
            r0.a(r1)     // Catch: java.lang.Exception -> L1c java.lang.RuntimeException -> L21
            goto L28
        L1c:
            java.lang.String r0 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r1 = "Exception"
            goto L25
        L21:
            java.lang.String r0 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r1 = "RuntimeException"
        L25:
            com.huawei.hms.scankit.util.a.b(r0, r1)
        L28:
            android.content.Context r0 = r3.f7377g
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            if (r0 == 0) goto L46
            android.content.Context r0 = r3.f7377g
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.camera"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 != 0) goto L46
            java.lang.String r0 = "scankit"
            java.lang.String r1 = "has no camera"
            android.util.Log.e(r0, r1)
            return
        L46:
            android.content.Context r0 = r3.f7377g
            com.huawei.hms.scankit.p.b r0 = r3.a(r0)
            java.lang.String r1 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r2 = "onCreate: CameraManageOncreate"
            android.util.Log.i(r1, r2)
            com.huawei.hms.scankit.p.e r1 = new com.huawei.hms.scankit.p.e
            android.content.Context r2 = r3.f7377g
            r1.<init>(r2, r0)
            r3.f7380j = r1
            com.huawei.hms.scankit.b r0 = new com.huawei.hms.scankit.b
            r0.<init>(r3)
            r1.a(r0)
            com.huawei.hms.scankit.c r0 = new com.huawei.hms.scankit.c
            r0.<init>(r3)
            r3.f7383m = r0
            com.huawei.hms.scankit.d r0 = new com.huawei.hms.scankit.d
            r0.<init>(r3)
            r3.f7379i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.C0637e.b():void");
    }

    public void b(boolean z10) {
        this.H = z10;
    }

    public void c() {
        this.F = true;
        this.f7380j.j();
        f7372b = null;
    }

    public void d() {
        this.F = true;
        if (this.D) {
            return;
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            r5 = this;
            r0 = 0
            r5.F = r0
            com.huawei.hms.feature.dynamic.IObjectWrapper r1 = r5.A     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            java.lang.Object r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            com.huawei.hms.scankit.p.fb r2 = new com.huawei.hms.scankit.p.fb     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            java.lang.String r3 = r5.f7388r     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            r5.f7373c = r2     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            com.huawei.hms.scankit.p.fb r1 = r5.f7373c     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            r1.b()     // Catch: java.lang.Exception -> L1a java.lang.RuntimeException -> L1f
            goto L26
        L1a:
            java.lang.String r1 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r2 = "Exception"
            goto L23
        L1f:
            java.lang.String r1 = com.huawei.hms.scankit.C0637e.f7371a
            java.lang.String r2 = "RuntimeException"
        L23:
            com.huawei.hms.scankit.util.a.b(r1, r2)
        L26:
            boolean r1 = r5.D
            if (r1 != 0) goto L48
            boolean r1 = r5.f7387q
            if (r1 != 0) goto L48
            android.view.TextureView r1 = r5.f7382l
            if (r1 == 0) goto L48
            android.view.TextureView$SurfaceTextureListener r2 = r5.f7383m
            r1.setSurfaceTextureListener(r2)
            boolean r1 = r5.f7387q
            if (r1 == 0) goto L41
            android.view.TextureView r1 = r5.f7382l
            r5.a(r1)
            goto L48
        L41:
            android.view.TextureView r1 = r5.f7382l
            android.view.TextureView$SurfaceTextureListener r2 = r5.f7383m
            r1.setSurfaceTextureListener(r2)
        L48:
            boolean r1 = r5.E
            if (r1 == 0) goto L67
            android.content.Context r1 = r5.f7377g
            int r2 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = "android.permission.CAMERA"
            int r1 = r1.checkPermission(r4, r2, r3)
            if (r1 != 0) goto L67
            android.view.TextureView r1 = r5.f7382l
            if (r1 == 0) goto L67
            r5.E = r0
            r5.a(r1)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.C0637e.e():void");
    }

    public void f() {
        this.F = false;
        TextureView textureView = this.f7382l;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this.f7383m);
            this.D = true;
            if (this.f7387q) {
                a(this.f7382l);
            } else {
                this.f7382l.setSurfaceTextureListener(this.f7383m);
            }
        }
    }

    public void g() {
        this.F = true;
        if (this.f7373c != null) {
            this.f7373c.c();
        }
        this.f7373c = null;
        if (this.D) {
            i();
        }
    }

    public void h() {
        String str;
        String str2;
        try {
            C0657e c0657e = this.f7380j;
            if (c0657e != null) {
                c0657e.c(1);
            }
        } catch (RuntimeException unused) {
            str = f7371a;
            str2 = "RuntimeException in reset zoomValue";
            com.huawei.hms.scankit.util.a.b(str, str2);
        } catch (Exception unused2) {
            str = f7371a;
            str2 = "Exception in reset zoomValue";
            com.huawei.hms.scankit.util.a.b(str, str2);
        }
    }
}
