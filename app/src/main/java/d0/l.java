package d0;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p0.c;
import s.h1;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12591a;

    /* renamed from: b */
    public final /* synthetic */ na.a f12592b;

    /* renamed from: c */
    public final /* synthetic */ m f12593c;

    public l(m mVar, int i10, na.a aVar) {
        this.f12593c = mVar;
        this.f12591a = i10;
        this.f12592b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.a aVar;
        ArrayList arrayList;
        int decrementAndGet;
        m mVar = this.f12593c;
        int i10 = this.f12591a;
        na.a aVar2 = this.f12592b;
        ArrayList arrayList2 = mVar.f12595b;
        if (!mVar.isDone() && arrayList2 != null) {
            boolean z10 = true;
            try {
                try {
                    try {
                        try {
                            h1.k("Tried to set value from future which is not done", aVar2.isDone());
                            arrayList2.set(i10, f.d(aVar2));
                            decrementAndGet = mVar.f12597d.decrementAndGet();
                            if (decrementAndGet < 0) {
                                z10 = false;
                            }
                            h1.k("Less than 0 remaining futures", z10);
                        } catch (RuntimeException e10) {
                            if (mVar.f12596c) {
                                mVar.f12599f.b(e10);
                            }
                            int decrementAndGet2 = mVar.f12597d.decrementAndGet();
                            if (decrementAndGet2 < 0) {
                                z10 = false;
                            }
                            h1.k("Less than 0 remaining futures", z10);
                            if (decrementAndGet2 == 0) {
                                ArrayList arrayList3 = mVar.f12595b;
                                if (arrayList3 != null) {
                                    aVar = mVar.f12599f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            } else {
                                return;
                            }
                        } catch (ExecutionException e11) {
                            if (mVar.f12596c) {
                                mVar.f12599f.b(e11.getCause());
                            }
                            int decrementAndGet3 = mVar.f12597d.decrementAndGet();
                            if (decrementAndGet3 < 0) {
                                z10 = false;
                            }
                            h1.k("Less than 0 remaining futures", z10);
                            if (decrementAndGet3 == 0) {
                                ArrayList arrayList4 = mVar.f12595b;
                                if (arrayList4 != null) {
                                    aVar = mVar.f12599f;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (CancellationException unused) {
                        if (mVar.f12596c) {
                            mVar.cancel(false);
                        }
                        int decrementAndGet4 = mVar.f12597d.decrementAndGet();
                        if (decrementAndGet4 < 0) {
                            z10 = false;
                        }
                        h1.k("Less than 0 remaining futures", z10);
                        if (decrementAndGet4 == 0) {
                            ArrayList arrayList5 = mVar.f12595b;
                            if (arrayList5 != null) {
                                aVar = mVar.f12599f;
                                arrayList = new ArrayList(arrayList5);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Error e12) {
                    mVar.f12599f.b(e12);
                    int decrementAndGet5 = mVar.f12597d.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z10 = false;
                    }
                    h1.k("Less than 0 remaining futures", z10);
                    if (decrementAndGet5 == 0) {
                        ArrayList arrayList6 = mVar.f12595b;
                        if (arrayList6 != null) {
                            aVar = mVar.f12599f;
                            arrayList = new ArrayList(arrayList6);
                        }
                    } else {
                        return;
                    }
                }
                if (decrementAndGet == 0) {
                    ArrayList arrayList7 = mVar.f12595b;
                    if (arrayList7 != null) {
                        aVar = mVar.f12599f;
                        arrayList = new ArrayList(arrayList7);
                        aVar.a(arrayList);
                        return;
                    }
                    h1.k(null, mVar.isDone());
                    return;
                }
                return;
            } catch (Throwable th2) {
                int decrementAndGet6 = mVar.f12597d.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z10 = false;
                }
                h1.k("Less than 0 remaining futures", z10);
                if (decrementAndGet6 == 0) {
                    ArrayList arrayList8 = mVar.f12595b;
                    if (arrayList8 != null) {
                        mVar.f12599f.a(new ArrayList(arrayList8));
                    } else {
                        h1.k(null, mVar.isDone());
                    }
                }
                throw th2;
            }
        }
        h1.k("Future was done before all dependencies completed", mVar.f12596c);
    }
}
