package nh;

import androidx.lifecycle.s0;
import bi.r;
import jh.v;
import sm.g1;
import sm.t0;
import tl.l;

/* loaded from: classes2.dex */
public abstract class f<State, Event> extends s0 {

    /* renamed from: d */
    public final g1 f22393d;

    /* renamed from: e */
    public final t0 f22394e;

    /* renamed from: f */
    public final rm.a f22395f;

    /* renamed from: g */
    public final sm.c f22396g;

    public f(State state) {
        g1 c10 = r.c(state);
        this.f22393d = c10;
        this.f22394e = r.f(c10);
        rm.a a10 = v.a(0, null, 7);
        this.f22395f = a10;
        this.f22396g = r.J(a10);
    }

    public final State e() {
        return (State) this.f22393d.getValue();
    }

    public final Object f(Event event, xl.d<? super l> dVar) {
        Object d10 = this.f22395f.d(event, dVar);
        return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : l.f28297a;
    }

    public final l g(Object obj) {
        this.f22393d.setValue(obj);
        return l.f28297a;
    }
}
