package d6;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e implements o5.l {

    /* renamed from: b */
    public static final b f12661b = new b();

    /* renamed from: c */
    public static final HashMap f12662c = new HashMap();

    /* renamed from: a */
    public final HashMap f12663a = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(Intent intent, int i10);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final synchronized void a(int i10, a aVar) {
            HashMap hashMap = e.f12662c;
            if (hashMap.containsKey(Integer.valueOf(i10))) {
                return;
            }
            hashMap.put(Integer.valueOf(i10), aVar);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        Login(0),
        Share(1),
        /* JADX INFO: Fake field, exist only in values array */
        Message(2),
        /* JADX INFO: Fake field, exist only in values array */
        Like(3),
        /* JADX INFO: Fake field, exist only in values array */
        GameRequest(4),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupCreate(5),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupJoin(6),
        /* JADX INFO: Fake field, exist only in values array */
        AppInvite(7),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceShare(8),
        /* JADX INFO: Fake field, exist only in values array */
        GamingFriendFinder(9),
        /* JADX INFO: Fake field, exist only in values array */
        GamingGroupIntegration(10),
        /* JADX INFO: Fake field, exist only in values array */
        Referral(11),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextCreate(12),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextSwitch(13),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextChoose(14),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentShareDialog(15);
        

        /* renamed from: a */
        public final int f12667a;

        c(int i10) {
            this.f12667a = i10;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            return (c[]) Arrays.copyOf(values(), 16);
        }

        public final int a() {
            o5.v vVar = o5.v.f22837a;
            n0.g();
            return o5.v.f22846j + this.f12667a;
        }
    }

    @Override // o5.l
    public final boolean a(int i10, int i11, Intent intent) {
        a aVar;
        a aVar2 = (a) this.f12663a.get(Integer.valueOf(i10));
        if (aVar2 == null) {
            synchronized (f12661b) {
                aVar = (a) f12662c.get(Integer.valueOf(i10));
            }
            if (aVar == null) {
                return false;
            }
            return aVar.a(intent, i11);
        }
        return aVar2.a(intent, i11);
    }
}
