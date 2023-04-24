package bk;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.SparseBooleanArray;
import cn.sharesdk.framework.InnerShareParams;
import java.util.HashMap;
import jh.v;
import p000do.a;

/* loaded from: classes2.dex */
public abstract class a extends NotificationListenerService {

    /* renamed from: a */
    public final HashMap<String, C0059a> f4412a = new HashMap<>();

    /* renamed from: b */
    public final SparseBooleanArray f4413b = new SparseBooleanArray(5);

    /* renamed from: bk.a$a */
    /* loaded from: classes2.dex */
    public static final class C0059a {

        /* renamed from: a */
        public final String f4414a;

        /* renamed from: b */
        public final long f4415b;

        public C0059a(long j10, String str) {
            gm.l.f(str, InnerShareParams.TEXT);
            this.f4414a = str;
            this.f4415b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0059a) {
                C0059a c0059a = (C0059a) obj;
                return gm.l.a(this.f4414a, c0059a.f4414a) && this.f4415b == c0059a.f4415b;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f4415b;
            return ((int) (j10 ^ (j10 >>> 32))) + (this.f4414a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder c10 = v.c("CacheText(text=");
            c10.append(this.f4414a);
            c10.append(", timStamp=");
            return d4.b.a(c10, this.f4415b, ')');
        }
    }

    public abstract hj.b a(Context context);

    public abstract Integer b(Context context, StatusBarNotification statusBarNotification);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a(this).a().m(null);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        super.onListenerConnected();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#NLS");
        bVar.h("onListenerConnected", new Object[0]);
        a(this).a().m(this);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        super.onListenerDisconnected();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#NLS");
        bVar.h("onListenerDisconnected", new Object[0]);
        a(this).a().m(null);
        Class<?> cls = getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            NotificationListenerService.requestRebind(new ComponentName(this, cls));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x005e, code lost:
        if (r4.equals("com.netease.mobimail") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0073, code lost:
        if (r4.equals("com.netease.mail") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0076, code lost:
        r3 = bk.i.b(r3, 8, new int[]{22}, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0088, code lost:
        if (r4.equals("com.facebook.orca") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0091, code lost:
        if (r4.equals("com.tencent.mobileqq") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009a, code lost:
        if (r4.equals("com.twitter.android") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00b8, code lost:
        if (r4.equals("com.google.android.gm") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00c1, code lost:
        if (r4.equals("com.tencent.mm") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x00c4, code lost:
        r10 = r3.extras;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x00c6, code lost:
        if (r10 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x00c8, code lost:
        r11 = r10.getCharSequence("android.title");
        r10 = r10.getCharSequence("android.text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x00d0, code lost:
        if (r11 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00d6, code lost:
        if (r11.length() != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x00d9, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x00db, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x00dc, code lost:
        if (r11 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00de, code lost:
        if (r10 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x00e4, code lost:
        if (r10.length() != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x00e7, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x00e9, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00ea, code lost:
        if (r10 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00ec, code lost:
        r3 = r3.tickerText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00ee, code lost:
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00f0, code lost:
        r3 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00fc, code lost:
        if (r4.equals("com.google.android.gm.lite") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x010a, code lost:
        if (r16.f4413b.get(r17.getId()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x010c, code lost:
        r3 = r3.extras;
        r10 = r3.getCharSequenceArray("android.textLines");
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0112, code lost:
        if (r10 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0115, code lost:
        if (r10.length != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0117, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0119, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x011b, code lost:
        if ((!r10) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x011e, code lost:
        r10 = r3.getCharSequence("android.title");
        r3 = r3.getCharSequence("android.text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0126, code lost:
        if (r10 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x012c, code lost:
        if (r10.length() != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x012f, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0131, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0132, code lost:
        if (r11 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0134, code lost:
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x013a, code lost:
        if (r3.length() != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x013d, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x013f, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0140, code lost:
        if (r11 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0142, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append((java.lang.Object) r10);
        r11.append(' ');
        r11.append((java.lang.Object) r3);
        r3 = r11.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0157, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0158, code lost:
        if (r3 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x015e, code lost:
        if (r3.length() != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0161, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0163, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0164, code lost:
        if (r10 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0166, code lost:
        r16.f4413b.put(r17.getId(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0177, code lost:
        if (r4.equals("com.tencent.androidqqmail") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x017b, code lost:
        r3 = bk.i.b(r3, 8, new int[]{0}, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0262, code lost:
        if (r4.equals("com.skype.raider") == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01d2  */
    @Override // android.service.notification.NotificationListenerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNotificationPosted(android.service.notification.StatusBarNotification r17) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.a.onNotificationPosted(android.service.notification.StatusBarNotification):void");
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification != null ? statusBarNotification.getPackageName() : null;
        if (packageName == null || packageName.length() == 0) {
            return;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#NLS");
        bVar.h("onNotificationRemoved:%s", packageName);
        if (gm.l.a("com.google.android.gm", packageName) || gm.l.a("com.google.android.gm.lite", packageName)) {
            this.f4413b.delete(statusBarNotification.getId());
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#NLS");
        bVar.h("onTrimMemory:%d", Integer.valueOf(i10));
        if (i10 >= 80) {
            this.f4412a.clear();
            this.f4413b.clear();
        }
    }
}
