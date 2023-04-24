package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import gm.l;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import m2.j;
import m2.k;

@Metadata
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f3343a;

    /* renamed from: b */
    public final LinkedHashMap f3344b = new LinkedHashMap();

    /* renamed from: c */
    public final b f3345c = new b();

    /* renamed from: d */
    public final a f3346d = new a();

    /* loaded from: classes.dex */
    public static final class a extends k.a {
        public a() {
            MultiInstanceInvalidationService.this = r1;
        }

        @Override // m2.k
        public final int h0(j jVar, String str) {
            l.f(jVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f3345c) {
                int i11 = multiInstanceInvalidationService.f3343a + 1;
                multiInstanceInvalidationService.f3343a = i11;
                if (multiInstanceInvalidationService.f3345c.register(jVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f3344b.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f3343a--;
                }
            }
            return i10;
        }

        @Override // m2.k
        public final void k0(String[] strArr, int i10) {
            l.f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f3345c) {
                String str = (String) multiInstanceInvalidationService.f3344b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f3345c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    Object broadcastCookie = multiInstanceInvalidationService.f3345c.getBroadcastCookie(i11);
                    if (broadcastCookie != null) {
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.f3344b.get(Integer.valueOf(intValue));
                        if (i10 != intValue && l.a(str, str2)) {
                            try {
                                multiInstanceInvalidationService.f3345c.getBroadcastItem(i11).f(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
                multiInstanceInvalidationService.f3345c.finishBroadcast();
                tl.l lVar = tl.l.f28297a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<j> {
        public b() {
            MultiInstanceInvalidationService.this = r1;
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(j jVar, Object obj) {
            l.f(jVar, "callback");
            l.f(obj, "cookie");
            MultiInstanceInvalidationService.this.f3344b.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.f3346d;
    }
}
