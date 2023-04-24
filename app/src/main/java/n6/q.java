package n6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import jm.c;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    public final Set<String> f22154a;

    /* renamed from: b */
    public final String f22155b;

    /* renamed from: c */
    public final String f22156c;

    public q(Set set) {
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        HashSet hashSet;
        String uuid = UUID.randomUUID().toString();
        gm.l.e(uuid, "randomUUID().toString()");
        lm.j jVar = new lm.j(43, 128);
        c.a aVar = jm.c.f17996a;
        gm.l.f(aVar, "random");
        try {
            int E = bi.r.E(aVar, jVar);
            lm.c cVar = new lm.c('a', 'z');
            lm.c cVar2 = new lm.c('A', 'Z');
            if (cVar instanceof Collection) {
                arrayList = ul.q.Q(cVar2, (Collection) cVar);
            } else {
                ArrayList arrayList2 = new ArrayList();
                ul.n.D(cVar, arrayList2);
                ul.n.D(cVar2, arrayList2);
                arrayList = arrayList2;
            }
            ArrayList R = ul.q.R(ul.q.R(ul.q.R(ul.q.R(ul.q.Q(new lm.c('0', '9'), arrayList), '-'), '.'), '_'), '~');
            ArrayList arrayList3 = new ArrayList(E);
            boolean z13 = false;
            for (int i10 = 0; i10 < E; i10++) {
                c.a aVar2 = jm.c.f17996a;
                gm.l.f(aVar2, "random");
                if (!R.isEmpty()) {
                    arrayList3.add(Character.valueOf(((Character) R.get(aVar2.c(R.size()))).charValue()));
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
            String M = ul.q.M(arrayList3, "", null, null, null, 62);
            if (uuid.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z12 = false;
            } else {
                if (om.l.g0(uuid, ' ', 0, false, 6) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = !z11;
            }
            if (z12 && a0.j(M)) {
                z13 = true;
            }
            if (z13) {
                if (set != null) {
                    hashSet = new HashSet(set);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add("openid");
                Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
                gm.l.e(unmodifiableSet, "unmodifiableSet(permissions)");
                this.f22154a = unmodifiableSet;
                this.f22155b = uuid;
                this.f22156c = M;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
