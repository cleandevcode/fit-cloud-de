package s;

import d6.c0;
import d6.s;
import java.util.List;
import o5.y;
import org.json.JSONException;
import p000do.a;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements o.a, s.a, ge.a {

    /* renamed from: a */
    public final /* synthetic */ int f26241a;

    public /* synthetic */ x2(int i10) {
        this.f26241a = i10;
    }

    @Override // ge.a
    public final void a(int i10, String str, String str2) {
        switch (this.f26241a) {
            case 5:
                a.b bVar = p000do.a.f13275a;
                gm.l.e(str, "tag");
                bVar.t(str);
                bVar.l(i10 + 1, str2, new Object[0]);
                return;
            default:
                a.b bVar2 = p000do.a.f13275a;
                gm.l.e(str, "tag");
                bVar2.t(str);
                bVar2.l(i10 + 1, str2, new Object[0]);
                return;
        }
    }

    @Override // o.a
    public final Object apply(Object obj) {
        List list = (List) obj;
        return null;
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        switch (this.f26241a) {
            case 2:
                if (z10) {
                    o5.v.f22849m = true;
                    return;
                } else {
                    o5.v vVar = o5.v.f22837a;
                    return;
                }
            default:
                if (z10) {
                    r5.d dVar = r5.d.f25245a;
                    o5.g0 g0Var = o5.g0.APP_EVENTS;
                    try {
                        o5.y yVar = new o5.y(null, gm.l.k("/cloudbridge_settings", o5.v.b()), null, o5.f0.GET, new y.b() { // from class: r5.c
                            @Override // o5.y.b
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void b(o5.e0 r12) {
                                /*
                                    Method dump skipped, instructions count: 362
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: r5.c.b(o5.e0):void");
                            }
                        }, 32);
                        c0.a aVar = d6.c0.f12645d;
                        if (r5.d.f25246b != null) {
                            o5.v.i(g0Var);
                            yVar.d();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } catch (JSONException e10) {
                        c0.a aVar2 = d6.c0.f12645d;
                        if (r5.d.f25246b != null) {
                            ih.v.q(e10);
                            o5.v.i(g0Var);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return;
        }
    }
}
