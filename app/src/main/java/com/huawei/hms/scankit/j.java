package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.p.C0649c;
import com.huawei.hms.scankit.p.C0657e;
import com.huawei.hms.scankit.p.C0661f;
import com.huawei.hms.scankit.p.C0665g;
import com.huawei.hms.scankit.p.C0675ib;
import com.huawei.hms.scankit.p.Fb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends Handler {

    /* renamed from: a */
    private static long f7405a;

    /* renamed from: b */
    private final Context f7406b;

    /* renamed from: c */
    private final C0657e f7407c;

    /* renamed from: d */
    private final HandlerC0627a f7408d;

    /* renamed from: e */
    private boolean f7409e = true;

    /* renamed from: f */
    private int f7410f = 50;

    /* renamed from: g */
    private a f7411g;

    /* renamed from: h */
    private Rect f7412h;

    /* renamed from: i */
    private int f7413i;

    /* renamed from: j */
    private IRemoteFrameDecoderDelegate f7414j;

    /* renamed from: k */
    private boolean f7415k;

    /* loaded from: classes.dex */
    public static class a extends AsyncTask<Object, Object, Object> {

        /* renamed from: a */
        private WeakReference<j> f7416a;

        /* renamed from: e */
        private List<C0661f.a> f7420e;

        /* renamed from: f */
        private List<C0661f.a> f7421f;

        /* renamed from: b */
        private boolean f7417b = true;

        /* renamed from: c */
        private boolean f7418c = false;

        /* renamed from: d */
        private int f7419d = 0;

        /* renamed from: g */
        private int f7422g = 0;

        /* renamed from: h */
        private int f7423h = 0;

        public a(j jVar) {
            this.f7416a = new WeakReference<>(jVar);
        }

        private void a() {
            this.f7419d = 0;
            this.f7422g = 0;
        }

        public void a(int i10) {
            this.f7419d += i10;
            this.f7422g++;
        }

        public void a(List<Rect> list, int i10, int i11, boolean z10) {
            if (list == null) {
                com.huawei.hms.scankit.util.a.a("ScankitDecode", "areas is null");
            } else if (list.size() == 0) {
                this.f7421f = Collections.singletonList(new C0661f.a(new Rect(-100, -100, 100, 100), 1000));
            } else {
                this.f7421f = new ArrayList();
                for (Rect rect : list) {
                    int centerX = ((rect.centerX() * 2000) / i10) - 1000;
                    int centerY = ((rect.centerY() * 2000) / i11) - 1000;
                    int width = ((rect.width() * 2000) / i10) / 2;
                    int height = ((rect.height() * 2000) / i11) / 2;
                    this.f7421f.add(new C0661f.a(new Rect(centerX - (width / 2), centerY - (height / 2), centerX + width, centerY + height), 1000 / list.size()));
                }
                list.clear();
            }
        }

        public void b(int i10) {
            String str;
            this.f7423h = i10;
            j jVar = this.f7416a.get();
            if (jVar != null) {
                try {
                    jVar.a(this.f7423h, this.f7421f);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ScanCode handle global value");
                    sb2.append(this.f7423h);
                    com.huawei.hms.scankit.util.a.c("DecodeHandler", sb2.toString());
                } catch (RuntimeException e10) {
                    StringBuilder a10 = android.support.v4.media.d.a("RuntimeException: ");
                    a10.append(e10.getMessage());
                    str = a10.toString();
                    com.huawei.hms.scankit.util.a.b("DecodeHandler", str);
                } catch (Exception unused) {
                    str = "Exception";
                    com.huawei.hms.scankit.util.a.b("DecodeHandler", str);
                }
            }
        }

        public void b(List<Rect> list, int i10, int i11, boolean z10) {
            if (list == null) {
                com.huawei.hms.scankit.util.a.a("ScankitDecode", "areas is null");
            } else if (list.size() == 0) {
                this.f7420e = Collections.singletonList(new C0661f.a(new Rect(-100, -100, 100, 100), 1000));
            } else {
                this.f7420e = new ArrayList();
                if (z10) {
                    int i12 = (i11 > i10 ? i11 - i10 : i10 - i11) >> 1;
                    for (Rect rect : list) {
                        int centerY = (((rect.centerY() + i12) * 2000) / i10) - 1000;
                        int centerX = ((rect.centerX() * 2000) / i11) - 1000;
                        int height = ((rect.height() * 2000) / i10) / 2;
                        int width = ((rect.width() * 2000) / i11) / 2;
                        this.f7420e.add(new C0661f.a(new Rect(centerY - (height / 2), centerX - (width / 2), centerY + height, centerX + width), 1000 / list.size()));
                    }
                    return;
                }
                for (Rect rect2 : list) {
                    int centerX2 = ((rect2.centerX() * 2000) / i10) - 1000;
                    int centerY2 = ((rect2.centerY() * 2000) / i11) - 1000;
                    int width2 = ((rect2.width() * 2000) / i10) / 2;
                    int height2 = ((rect2.height() * 2000) / i11) / 2;
                    this.f7420e.add(new C0661f.a(new Rect(centerX2 - (width2 / 2), centerY2 - (height2 / 2), centerX2 + width2, centerY2 + height2), 1000 / list.size()));
                }
                list.clear();
            }
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            String str;
            Log.i("ScankitDecode", "doInBackground: ");
            while (!this.f7418c) {
                if (this.f7417b) {
                    try {
                        Thread.sleep(400L);
                    } catch (InterruptedException unused) {
                        com.huawei.hms.scankit.util.a.c("ScankitDecode", "doInBackground  get InterruptedException  error!!!");
                    }
                    this.f7417b = false;
                } else {
                    j jVar = this.f7416a.get();
                    int i10 = this.f7422g;
                    if (i10 == 0) {
                        this.f7417b = true;
                    } else if (jVar != null) {
                        try {
                            jVar.a(this.f7419d / i10, this.f7420e);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ScanCode handle auto value");
                            sb2.append(this.f7419d / this.f7422g);
                            com.huawei.hms.scankit.util.a.c("DecodeHandler", sb2.toString());
                            a();
                            this.f7417b = true;
                        } catch (RuntimeException e10) {
                            StringBuilder a10 = android.support.v4.media.d.a("RuntimeException: ");
                            a10.append(e10.getMessage());
                            str = a10.toString();
                            com.huawei.hms.scankit.util.a.b("DecodeHandler", str);
                        } catch (Exception unused2) {
                            str = "Exception";
                            com.huawei.hms.scankit.util.a.b("DecodeHandler", str);
                        }
                    }
                }
            }
            return null;
        }
    }

    public j(Context context, C0657e c0657e, HandlerC0627a handlerC0627a, Map<EnumC0631d, Object> map, Rect rect, boolean z10) {
        this.f7415k = false;
        this.f7406b = context;
        this.f7407c = c0657e;
        this.f7408d = handlerC0627a;
        this.f7412h = rect;
        if (this.f7411g == null) {
            a aVar = new a(this);
            this.f7411g = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
        this.f7413i = 0;
        this.f7415k = z10;
        a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0043 A[Catch: RemoteException -> 0x005b, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:59:0x003f, B:61:0x0043, B:63:0x0050, B:65:0x0054), top: B:72:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0050 A[Catch: RemoteException -> 0x005b, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:59:0x003f, B:61:0x0043, B:63:0x0050, B:65:0x0054), top: B:72:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ScankitDecode"
            boolean r1 = r3.f7415k     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            if (r1 == 0) goto L12
            java.lang.String r4 = "use local decoder"
            android.util.Log.d(r0, r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            java.lang.Class<com.huawei.hms.scankit.DecoderCreator> r4 = com.huawei.hms.scankit.DecoderCreator.class
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            goto L3f
        L12:
            java.lang.String r1 = "use remote decoder"
            android.util.Log.d(r0, r1)     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            android.content.Context r4 = com.huawei.hms.hmsscankit.j.d(r4)     // Catch: java.lang.Throwable -> L1b java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
        L1b:
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            java.lang.String r2 = "com.huawei.hms.scankit.DecoderCreator"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            java.lang.String r2 = "com.huawei.hms.scankit.aiscan.common.BarcodeFormat"
            r4.loadClass(r2)     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            java.lang.Object r4 = r1.newInstance()     // Catch: java.lang.InstantiationException -> L33 java.lang.ClassNotFoundException -> L36 java.lang.IllegalAccessException -> L39
            goto L3f
        L33:
            java.lang.String r4 = "InstantiationException"
            goto L3b
        L36:
            java.lang.String r4 = "ClassNotFoundException"
            goto L3b
        L39:
            java.lang.String r4 = "IllegalAccessException"
        L3b:
            com.huawei.hms.scankit.util.a.a(r0, r4)
            r4 = 0
        L3f:
            boolean r1 = r4 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r1 == 0) goto L50
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch: android.os.RemoteException -> L5b
            com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator r4 = com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator.Stub.asInterface(r4)     // Catch: android.os.RemoteException -> L5b
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r4 = r4.newRemoteFrameDecoderDelegate()     // Catch: android.os.RemoteException -> L5b
            r3.f7414j = r4     // Catch: android.os.RemoteException -> L5b
            return
        L50:
            com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate r4 = r3.f7414j     // Catch: android.os.RemoteException -> L5b
            if (r4 != 0) goto L60
            com.huawei.hms.scankit.s r4 = com.huawei.hms.scankit.s.a()     // Catch: android.os.RemoteException -> L5b
            r3.f7414j = r4     // Catch: android.os.RemoteException -> L5b
            goto L60
        L5b:
            java.lang.String r4 = "RemoteException"
            com.huawei.hms.scankit.util.a.a(r0, r4)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.j.a(android.content.Context):void");
    }

    private static void a(byte[] bArr, int i10, int i11, Bundle bundle) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i10, i11, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", 1.0f);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            Log.e("ScankitDecode", "RemoteException");
        }
    }

    private void a(byte[] bArr, boolean z10) {
        int i10;
        C0675ib.a aVar;
        com.huawei.hms.scankit.aiscan.common.x[] xVarArr;
        int i11 = this.f7407c.e().x;
        int i12 = this.f7407c.e().y;
        Context context = this.f7406b;
        if (context != null && (context instanceof Activity)) {
            i10 = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        } else {
            i10 = 0;
        }
        if (this.f7408d != null) {
            if (C0637e.f7372b != null) {
                aVar = C0637e.f7372b.a(false, i11 * i12);
            } else {
                aVar = null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("Rect", this.f7412h);
            Point a10 = com.huawei.hms.scankit.util.c.a(this.f7406b);
            if (a10 != null) {
                bundle.putParcelable("Screen", a10);
            }
            try {
                xVarArr = this.f7414j.decode(bArr, i11, i12, i10, this.f7408d.b(), ObjectWrapper.wrap(bundle));
            } catch (RemoteException unused) {
                Log.e("ScankitDecode", "RemoteException");
                xVarArr = null;
            }
            if (xVarArr != null && xVarArr.length > 0 && xVarArr[0] != null) {
                if (this.f7408d.d() && xVarArr[0].j() != 1.0f && System.currentTimeMillis() - f7405a > 1000) {
                    StringBuilder a11 = android.support.v4.media.d.a("need to zoom");
                    a11.append(xVarArr[0].j());
                    com.huawei.hms.scankit.util.a.c("ScankitDecode", a11.toString());
                    if (a(xVarArr[0].j(), xVarArr, aVar)) {
                        f7405a = System.currentTimeMillis();
                        return;
                    }
                }
                if (xVarArr[0].i() == null) {
                    if (xVarArr[0].k()) {
                        StringBuilder a12 = android.support.v4.media.d.a("ScanCode need to globalexposure");
                        a12.append(xVarArr[0].f());
                        com.huawei.hms.scankit.util.a.c("ScankitDecode", a12.toString());
                        this.f7411g.a(xVarArr[0].e(), i11, i12, false);
                        this.f7411g.b(xVarArr[0].f());
                    } else {
                        StringBuilder a13 = android.support.v4.media.d.a("ScanCode need to exposure");
                        a13.append(xVarArr[0].d());
                        com.huawei.hms.scankit.util.a.c("ScankitDecode", a13.toString());
                        this.f7411g.a(xVarArr[0].d());
                        this.f7411g.b(xVarArr[0].c(), i11, i12, z10);
                    }
                }
                a(xVarArr, bArr, i11, i12, aVar);
                return;
            }
            this.f7408d.sendEmptyMessage(R.id.scankit_decode_failed);
            if (C0637e.f7372b != null) {
                C0637e.f7372b.a((HmsScan[]) null, aVar);
            }
        }
    }

    private void a(com.huawei.hms.scankit.aiscan.common.x[] xVarArr, byte[] bArr, int i10, int i11, C0675ib.a aVar) {
        if (this.f7408d != null) {
            HmsScan[] a10 = Fb.a(xVarArr);
            Message obtain = Message.obtain(this.f7408d, R.id.scankit_decode_succeeded, a10);
            Log.d("ScankitDecode", "scankit decode succeed msg");
            if (C0637e.f7372b != null) {
                C0637e.f7372b.a(a10, aVar);
            }
            if (this.f7408d.c()) {
                Bundle bundle = new Bundle();
                a(bArr, i10, i11, bundle);
                obtain.setData(bundle);
            }
            obtain.sendToTarget();
        }
    }

    private boolean a(float f10, com.huawei.hms.scankit.aiscan.common.x[] xVarArr, C0675ib.a aVar) {
        if (b(f10)) {
            Message obtain = Message.obtain();
            obtain.what = R.id.scankit_decode_succeeded;
            HmsScan[] a10 = Fb.a(xVarArr);
            obtain.obj = a10;
            if (C0637e.f7372b != null) {
                C0637e.f7372b.a(a10, aVar);
            }
            this.f7408d.sendMessage(obtain);
            return true;
        }
        return false;
    }

    private boolean c() {
        Context context = this.f7406b;
        if (context == null) {
            return true;
        }
        Object systemService = context.getSystemService("window");
        if (!(systemService instanceof WindowManager)) {
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "isScreenPortrait  getSystemService  WINDOW_SERVICE  error!!!");
            return true;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    public int a(float f10) {
        List<Integer> a10 = a();
        if (a10 == null) {
            return -3;
        }
        if (a10.size() <= 0) {
            return -4;
        }
        if (f10 == 1.0f) {
            return 0;
        }
        if (f10 == b()) {
            return a10.size() - 1;
        }
        for (int i10 = 1; i10 < a10.size(); i10++) {
            float f11 = 100.0f * f10;
            if (a10.get(i10).intValue() >= f11 && a10.get(i10 - 1).intValue() <= f11) {
                return i10;
            }
        }
        return -1;
    }

    public List<Integer> a() {
        return this.f7407c.g().a();
    }

    public void a(int i10, List<C0661f.a> list) {
        C0657e c0657e;
        C0649c b10 = this.f7407c.b();
        int b11 = b10.b();
        int c10 = b10.c();
        int a10 = b10.a();
        if (i10 == 0) {
            return;
        }
        int i11 = a10 + i10;
        if (i11 <= b11) {
            b11 = i11 < c10 ? c10 : i11;
        }
        this.f7407c.b(b11);
        C0661f c11 = this.f7407c.c();
        Rect b12 = c11.b();
        if (c11.a() > 0) {
            if (c11.a() == 1) {
                int centerX = b12.centerX();
                int centerY = b12.centerY();
                if (Math.sqrt((centerY - list.get(0).f7880a.centerY()) + (centerY - list.get(0).f7880a.centerY()) + ((centerX - list.get(0).f7880a.centerX()) * (centerX - list.get(0).f7880a.centerX()))) <= this.f7410f) {
                    return;
                }
                list.set(0, new C0661f.a(list.get(0).f7880a, 1000));
                c0657e = this.f7407c;
                list = list.subList(0, 1);
            } else {
                c0657e = this.f7407c;
            }
            c0657e.a(list);
        }
    }

    public float b() {
        List<Integer> a10 = a();
        if (a10 == null) {
            return 1.0f;
        }
        return Math.round(a10.get(a10.size() - 1).intValue() / 100.0f);
    }

    public boolean b(float f10) {
        String str;
        boolean z10;
        HandlerC0627a handlerC0627a = this.f7408d;
        if (handlerC0627a == null || !handlerC0627a.a()) {
            try {
                C0665g g10 = this.f7407c.g();
                if (g10 == null) {
                    com.huawei.hms.scankit.util.a.c("ScankitDecode", "Zoom not supported,data is null");
                    return false;
                }
                int c10 = g10.c();
                int b10 = g10.b();
                List<Integer> a10 = g10.a();
                float intValue = ((a10.get(b10).intValue() * 1.0f) / 100.0f) * f10;
                if (((int) (intValue * 100.0f)) > a10.get(c10).intValue()) {
                    intValue = (c10 * 1.0f) / 100.0f;
                }
                if (!this.f7407c.i()) {
                    com.huawei.hms.scankit.util.a.c("ScankitDecode", "Zoom not supported");
                    return false;
                }
                int a11 = a(intValue);
                if (a11 > b10) {
                    this.f7407c.c(a11);
                    z10 = true;
                } else {
                    this.f7407c.c(b10);
                    z10 = false;
                }
                this.f7407c.a(Collections.singletonList(new C0661f.a(new Rect(-150, -150, 150, 150), 1000)));
                return z10;
            } catch (RuntimeException unused) {
                str = "Zoom not supported,RuntimeException happen";
                com.huawei.hms.scankit.util.a.b("ScankitDecode", str);
                return false;
            } catch (Exception unused2) {
                str = "Zoom not supported,Exception happen";
                com.huawei.hms.scankit.util.a.b("ScankitDecode", str);
                return false;
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null && this.f7409e) {
            int i10 = message.what;
            if (i10 == R.id.scankit_decode) {
                int i11 = this.f7413i;
                if (i11 <= 1) {
                    this.f7413i = i11 + 1;
                    this.f7408d.sendEmptyMessage(R.id.scankit_decode_failed);
                    return;
                }
                Object obj = message.obj;
                if (obj instanceof byte[]) {
                    a((byte[]) obj, c());
                }
            } else if (i10 == R.id.scankit_quit) {
                this.f7409e = false;
                a aVar = this.f7411g;
                if (aVar != null) {
                    aVar.f7418c = true;
                    this.f7411g.cancel(true);
                }
                Looper.myLooper().quit();
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("handleMessage  message.what:");
                a10.append(message.what);
                com.huawei.hms.scankit.util.a.c("ScankitDecode", a10.toString());
            }
        }
    }
}
