package p5;

import android.content.Context;
import android.util.Log;
import d6.m0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import o5.v;
import p5.a;
import p5.d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final String f23906a;

    /* loaded from: classes.dex */
    public static final class a extends ObjectInputStream {
        public a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (!gm.l.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = gm.l.a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? d.b.class : d.b.class;
                gm.l.e(readClassDescriptor, "resultClassDescriptor");
                return readClassDescriptor;
            }
            cls = a.C0430a.class;
            readClassDescriptor = ObjectStreamClass.lookup(cls);
            gm.l.e(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        new f();
        f23906a = f.class.getName();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0068: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0067 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0096 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #10 {, blocks: (B:70:0x0003, B:76:0x0027, B:77:0x002a, B:113:0x0096, B:80:0x0035, B:91:0x0053, B:92:0x0056, B:95:0x0061, B:111:0x0091, B:99:0x0069, B:100:0x006c, B:104:0x007e, B:103:0x0077, B:106:0x0080, B:107:0x0083, B:110:0x008e), top: B:129:0x0003, inners: #0, #2, #7, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized p5.s a() {
        /*
            java.lang.Class<p5.f> r0 = p5.f.class
            monitor-enter(r0)
            int r1 = x5.e.f30297a     // Catch: java.lang.Throwable -> L9d
            android.content.Context r1 = o5.v.a()     // Catch: java.lang.Throwable -> L9d
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            gm.l.e(r3, r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            p5.f$a r4 = new p5.f$a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.io.FileNotFoundException -> L7f
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L66 java.io.FileNotFoundException -> L80
            if (r3 == 0) goto L3e
            p5.s r3 = (p5.s) r3     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L66 java.io.FileNotFoundException -> L80
            d6.m0.e(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L9d
            goto L3c
        L34:
            r1 = move-exception
            java.lang.String r2 = p5.f.f23906a     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L9d
        L3c:
            r2 = r3
            goto L94
        L3e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L66 java.io.FileNotFoundException -> L80
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L66 java.io.FileNotFoundException -> L80
            throw r3     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L66 java.io.FileNotFoundException -> L80
        L46:
            r3 = move-exception
            goto L4c
        L48:
            r3 = move-exception
            goto L69
        L4a:
            r3 = move-exception
            r4 = r2
        L4c:
            java.lang.String r5 = p5.f.f23906a     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L66
            d6.m0.e(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L9d
            goto L94
        L60:
            r1 = move-exception
            java.lang.String r3 = p5.f.f23906a     // Catch: java.lang.Throwable -> L9d
        L63:
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L91
        L66:
            r2 = move-exception
            r3 = r2
            r2 = r4
        L69:
            d6.m0.e(r2)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> L9d
            goto L7e
        L76:
            r1 = move-exception
            java.lang.String r2 = p5.f.f23906a     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L9d
        L7e:
            throw r3     // Catch: java.lang.Throwable -> L9d
        L7f:
            r4 = r2
        L80:
            d6.m0.e(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            r1.delete()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            goto L94
        L8d:
            r1 = move-exception
            java.lang.String r3 = p5.f.f23906a     // Catch: java.lang.Throwable -> L9d
            goto L63
        L91:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L9d
        L94:
            if (r2 != 0) goto L9b
            p5.s r2 = new p5.s     // Catch: java.lang.Throwable -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L9d
        L9b:
            monitor-exit(r0)
            return r2
        L9d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.f.a():p5.s");
    }

    public static final void b(s sVar) {
        ObjectOutputStream objectOutputStream;
        Context a10 = v.a();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(a10.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
        try {
            objectOutputStream.writeObject(sVar);
        } catch (Throwable th3) {
            th = th3;
            try {
                Log.w(f23906a, "Got unexpected exception while persisting events: ", th);
                try {
                    a10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                m0.e(objectOutputStream);
            }
        }
    }
}
