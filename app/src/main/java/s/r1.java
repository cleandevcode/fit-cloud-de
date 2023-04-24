package s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a */
    public final Executor f26166a;

    /* renamed from: b */
    public final Object f26167b = new Object();

    /* renamed from: c */
    public final LinkedHashSet f26168c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f26169d = new LinkedHashSet();

    /* renamed from: e */
    public final LinkedHashSet f26170e = new LinkedHashSet();

    /* renamed from: f */
    public final a f26171f = new a();

    /* loaded from: classes.dex */
    public class a extends CameraDevice.StateCallback {

        /* renamed from: b */
        public static final /* synthetic */ int f26172b = 0;

        public a() {
            r1.this = r1;
        }

        public final void a() {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            synchronized (r1.this.f26167b) {
                r1 r1Var = r1.this;
                synchronized (r1Var.f26167b) {
                    arrayList = new ArrayList();
                    synchronized (r1Var.f26167b) {
                        arrayList2 = new ArrayList(r1Var.f26168c);
                    }
                    arrayList.addAll(arrayList2);
                    synchronized (r1Var.f26167b) {
                        arrayList3 = new ArrayList(r1Var.f26170e);
                    }
                    arrayList.addAll(arrayList3);
                }
                r1.this.f26170e.clear();
                r1.this.f26168c.clear();
                r1.this.f26169d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i2) it.next()).c();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (r1.this.f26167b) {
                linkedHashSet.addAll(r1.this.f26170e);
                linkedHashSet.addAll(r1.this.f26168c);
            }
            r1.this.f26166a.execute(new androidx.activity.b(2, linkedHashSet));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i10) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public r1(c0.g gVar) {
        this.f26166a = gVar;
    }

    public final void a(i2 i2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        i2 i2Var2;
        synchronized (this.f26167b) {
            arrayList = new ArrayList();
            synchronized (this.f26167b) {
                arrayList2 = new ArrayList(this.f26168c);
            }
            arrayList.addAll(arrayList2);
            synchronized (this.f26167b) {
                arrayList3 = new ArrayList(this.f26170e);
            }
            arrayList.addAll(arrayList3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (i2Var2 = (i2) it.next()) != i2Var) {
            i2Var2.c();
        }
    }
}
