package l2;

import l2.l2;

/* loaded from: classes.dex */
public final class m0<Key, Value> extends l2<Key, Value> {

    /* renamed from: b */
    public int f19089b;

    @Override // l2.l2
    public final boolean a() {
        throw null;
    }

    @Override // l2.l2
    public final Key b(m2<Key, Value> m2Var) {
        throw null;
    }

    @Override // l2.l2
    public final Object c(l2.a aVar, zl.c cVar) {
        r0 r0Var;
        int i10;
        boolean z10 = aVar instanceof l2.a.c;
        if (z10) {
            r0Var = r0.REFRESH;
        } else if (aVar instanceof l2.a.C0335a) {
            r0Var = r0.APPEND;
        } else if (aVar instanceof l2.a.b) {
            r0Var = r0.PREPEND;
        } else {
            throw new qa.p();
        }
        if (this.f19089b == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z10) {
                int i11 = aVar.f19074a;
                if (i11 % 3 == 0) {
                    i10 = i11 / 3;
                    this.f19089b = i10;
                }
            }
            i10 = aVar.f19074a;
            this.f19089b = i10;
        }
        return bi.z0.s(cVar, null, new l0(this, new x(r0Var, aVar.a()), aVar, null));
    }
}
