package i8;

import android.accounts.Account;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final Account f16608a;

    /* renamed from: b */
    public final Set f16609b;

    /* renamed from: c */
    public final Set f16610c;

    /* renamed from: d */
    public final Map f16611d;

    /* renamed from: e */
    public final View f16612e;

    /* renamed from: f */
    public final String f16613f;

    /* renamed from: g */
    public final String f16614g;

    /* renamed from: h */
    public final e9.a f16615h;

    /* renamed from: i */
    public Integer f16616i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Account f16617a;

        /* renamed from: b */
        public o0.d f16618b;

        /* renamed from: c */
        public String f16619c;

        /* renamed from: d */
        public String f16620d;
    }

    public d(Account account, o0.d dVar, String str, String str2) {
        e9.a aVar = e9.a.f13505a;
        this.f16608a = account;
        Set emptySet = dVar == null ? Collections.emptySet() : Collections.unmodifiableSet(dVar);
        this.f16609b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f16611d = emptyMap;
        this.f16612e = null;
        this.f16613f = str;
        this.f16614g = str2;
        this.f16615h = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (w wVar : emptyMap.values()) {
            wVar.getClass();
            hashSet.addAll(null);
        }
        this.f16610c = Collections.unmodifiableSet(hashSet);
    }
}
