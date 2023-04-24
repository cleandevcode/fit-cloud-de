package d6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f */
    public static b f12632f;

    /* renamed from: a */
    public String f12633a;

    /* renamed from: b */
    public long f12634b;

    /* renamed from: c */
    public String f12635c;

    /* renamed from: d */
    public String f12636d;

    /* renamed from: e */
    public boolean f12637e;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:147:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x008e A[Catch: Exception -> 0x0095, TryCatch #3 {Exception -> 0x0095, blocks: (B:124:0x000b, B:135:0x003a, B:138:0x004b, B:141:0x0056, B:145:0x0073, B:149:0x0092, B:148:0x008e, B:127:0x001e, B:129:0x002a), top: B:235:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:154:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x00f7 A[Catch: all -> 0x016f, Exception -> 0x01d8, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0158 A[Catch: all -> 0x016f, Exception -> 0x01d8, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0162 A[Catch: all -> 0x016f, Exception -> 0x01d8, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0166 A[Catch: all -> 0x016f, Exception -> 0x01d8, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0172 A[Catch: all -> 0x016f, Exception -> 0x01d8, TRY_LEAVE, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x01d0 A[Catch: all -> 0x016f, Exception -> 0x01d8, TRY_ENTER, TryCatch #8 {Exception -> 0x01d8, all -> 0x016f, blocks: (B:169:0x00e9, B:171:0x00f7, B:173:0x00fb, B:176:0x010a, B:178:0x0124, B:185:0x0149, B:187:0x0150, B:192:0x0162, B:194:0x0166, B:198:0x0172, B:190:0x0158, B:182:0x0138, B:218:0x01d0, B:219:0x01d7), top: B:237:0x00e9 }] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x01f1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static d6.b a(android.content.Context r17) {
            /*
                Method dump skipped, instructions count: 501
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.b.a.a(android.content.Context):d6.b");
        }
    }

    /* renamed from: d6.b$b */
    /* loaded from: classes.dex */
    public static final class C0216b implements IInterface {

        /* renamed from: a */
        public final IBinder f12638a;

        public C0216b(IBinder iBinder) {
            this.f12638a = iBinder;
        }

        public final boolean a0() {
            Parcel obtain = Parcel.obtain();
            gm.l.e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            gm.l.e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f12638a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f12638a;
        }

        public final String k() {
            Parcel obtain = Parcel.obtain();
            gm.l.e(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            gm.l.e(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f12638a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: a */
        public final AtomicBoolean f12639a = new AtomicBoolean(false);

        /* renamed from: b */
        public final LinkedBlockingDeque f12640b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.f12639a.compareAndSet(true, true)) {
                Object take = this.f12640b.take();
                gm.l.e(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f12640b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String a() {
        if (o5.v.h() && o5.q0.a()) {
            return this.f12633a;
        }
        return null;
    }
}
